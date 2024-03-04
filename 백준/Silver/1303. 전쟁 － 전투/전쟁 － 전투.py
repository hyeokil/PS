from collections import deque

def Main():
    N,M = map(int,input().split())
    arr = [list(input()) for _ in range(M)]
    ans = {"W":0,"B":0}
    for i in range(M):
        for j in range(N):
            if arr[i][j] == "":
                continue
            res= 1
            tmp = arr[i][j]
            q = deque()
            q.append((i,j))
            arr[i][j] = ""
            while q:
                x,y = q.popleft()
                for dx,dy in ((1,0),(-1,0),(0,1),(0,-1)):
                    nx = dx+x
                    ny = dy+y
                    if 0<=nx<M and 0<=ny<N and arr[nx][ny]==tmp:
                        q.append((nx,ny))
                        arr[nx][ny] = ""
                        res+=1
            ans[tmp]+=res**2
    print(*ans.values())
Main()