def dfs(x,y,k):
    global ans
    if x==0 and y==C-1 and k==K:
        ans+=1
        return
    if k>=K:
        return
    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
        nx=x+dx
        ny=y+dy
        if 0<=nx<R and 0<=ny<C and arr[nx][ny]!="T" and not visited[nx][ny]:
            visited[nx][ny]=True
            dfs(nx,ny,k+1)
            visited[nx][ny]=False


R,C,K=map(int,input().split())
arr = [list(input()) for i in range(R)]
visited = [[False]*C for _ in range(R)]
visited[R-1][0]= True
ans =0
dfs(R-1,0,1)
print(ans)
