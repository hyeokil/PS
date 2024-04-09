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
        if 0<=nx<R and 0<=ny<C and arr[nx][ny]!="T" :
            arr[nx][ny]="T"
            dfs(nx,ny,k+1)
            arr[nx][ny]="."


R,C,K=map(int,input().split())
arr = [list(input()) for i in range(R)]
arr[R-1][0]="T"
ans =0
dfs(R-1,0,1)
print(ans)
