from collections import deque
import sys
input = sys.stdin.readline

def bfs():
    isOne = 0
    visited = [[False] * M for _ in range(N)]
    for x in range(1, N - 1):
        for y in range(1, M - 1):
            if not visited[x][y] and arr[x][y] != 0:
                isOne += 1
                if isOne >= 2:
                    return isOne
                q = deque()
                q.append((x, y))
                visited[x][y] = True
                while q :
                    x1,y1 = q.popleft()
                    for dx1,dy1 in D :
                        nx1,ny1 = dx1+x1,dy1+y1
                        if not visited[nx1][ny1] and arr[nx1][ny1] != 0 :
                            visited[nx1][ny1] = True
                            q.append((nx1,ny1))
    return isOne



N,M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
ans = 0
D = [(1,0),(0,1),(-1,0),(0,-1)]
while True :
    ans += 1
    wasIce =[[False]*M for __ in range(N)]
    for i in range(1,N-1):
        for j in range(1,M-1):
            if arr[i][j] != 0 :
                wasIce[i][j] =True
                water = 0
                for di,dj in D:
                    ni,nj = di+i,dj+j
                    if arr[ni][nj] == 0 and not wasIce[ni][nj] :
                        water += 1
                if arr[i][j] >= water:
                    arr[i][j]-=water
                else:
                    arr[i][j] = 0
    result = bfs()
    if result >= 2:
        break
    elif result == 0:
        ans = 0
        break
print(ans)