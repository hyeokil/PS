import sys
input= sys.stdin.readline
from collections import deque
def Main():
    N,M = map(int, input().split())
    arr = [list(map(int,input().split())) for _ in range(N)]
    ans = 0
    for i in range(N):
        for j in range(M):
            if arr[i][j] ==1 :
                ans += 1
                q =deque()
                q.append((i,j))
                arr[i][j] = 0
                while q:
                    x,y = q.popleft()
                    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1),(-1,-1),(1,1),(1,-1),(-1,1)]:
                        nx,ny =dx+x,dy+y
                        if 0<=nx<N and 0<=ny<M and arr[nx][ny] == 1 :
                            arr[nx][ny] = 0
                            q.append((nx,ny))
    print(ans)
Main()