from collections import deque

while True:
    F,N,M = map(int,input().split())
    if F == 0 and N == 0 and M == 0: break
    arr = [[] for _ in range(F)]
    flag = False
    ans = 0
    visited = [[[False]*M for _ in range(N)] for _ in range(F)]
    for i in range(F):
        for j in range(N):
            arr[i].append(input())
        input()
    for k in range(F):
        for i in range(N):
            for j in range(M):
                if arr[k][i][j] == "S":
                    q =deque()
                    q.append((k,i,j,0))
                    visited[k][i][j] = True
                    while q:
                        f,x,y,cnt = q.popleft()
                        if arr[f][x][y] == "E":
                            ans = cnt
                            flag=True
                            break
                        for df,dx,dy in [(-1,0,0),(1,0,0),(0,-1,0),(0,1,0),(0,0,-1),(0,0,1)]:
                            nf,nx,ny = f+df,x+dx,y+dy
                            if 0<=nf<F and 0<=nx<N and 0<=ny<M and arr[nf][nx][ny]!="#" and not visited[nf][nx][ny]:
                                q.append((nf,nx,ny,cnt+1))
                                visited[nf][nx][ny] = True
                    break
    if flag:print(f"Escaped in {ans} minute(s).")
    else:print("Trapped!")

