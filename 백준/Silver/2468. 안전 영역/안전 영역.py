from collections import deque
import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    ans = 1
    for h in range(1,101):
        visited = [[False]*N for _ in range(N)]
        result = 0
        for i in range(N):
            for j in range(N):
                if arr[i][j] > h and not visited[i][j] :
                    q = deque()
                    q.append((i,j))
                    visited[i][j] = True
                    while q:
                        x,y = q.popleft()
                        for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                            nx,ny = dx+x,dy+y
                            if 0<=nx<N and 0<=ny<N and arr[nx][ny] > h and not visited[nx][ny] :
                                visited[nx][ny] = True
                                q.append((nx,ny))
                    result+= 1
        if result == 0 :
            break
        if ans < result :
            ans = result
    print(ans)
Main()