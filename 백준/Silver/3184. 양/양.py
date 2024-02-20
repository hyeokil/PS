from collections import deque

def Main():
    N,M = map(int,input().split())
    arr = [list(input()) for i in range(N)]
    visited = [[False]*M for i in range(N)]
    ansO=0
    ansV=0
    for i in range(N):
        for j in range(M):
            if visited[i][j]: continue
            v = 0
            o=0
            if arr[i][j] == "v":
                v+=1
            elif arr[i][j] == "o":
                o+=1
            else:continue
            q = deque()
            q.append((i,j))
            visited[i][j]=True
            while q :
                x,y = q.popleft()
                for dx,dy in [(1,0),(-1,0),(0,1),(0,-1)]:
                    nx,ny=dx+x,dy+y
                    if 0<=nx<N and 0<=ny<M and arr[nx][ny] != "#" and not visited[nx][ny]:
                        visited[nx][ny] = True
                        q.append((nx,ny))
                        if arr[nx][ny] == "v":v+=1
                        elif arr[nx][ny] == "o":o+=1
            if o>v:ansO+=o
            else:ansV+=v
    
    print(ansO,ansV)
Main()