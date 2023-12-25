import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,M,K = map(int,input().split())
    arr = [[False]*M for _ in range(N)]
    ans = 0
    for i in range(K):
        a,b = map(int,input().split())
        arr[a-1][b-1] = True
    for i in range(N):
        for j in range(M):
            if arr[i][j] :
                cnt = 1
                arr[i][j] = False
                q = deque()
                q.append((i,j))
                while q:
                    x,y = q.popleft()
                    for dx,dy in [(1,0),(-1,0),(0,1),(0,-1)]:
                        nx,ny=dx+x,dy+y
                        if 0<=nx<N and 0<=ny<M and arr[nx][ny] :
                            cnt+=1
                            arr[nx][ny] = False
                            q.append((nx,ny))

                if ans < cnt :
                    ans = cnt
    print(ans)
Main()