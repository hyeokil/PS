def dfs1(x,y):
    visited[x][y]= True
    if y+1<M and arr[x][y+1]=="-":
        dfs1(x,y+1)
    return
def dfs2(x,y):
    visited[x][y]= True
    if x+1<N and arr[x+1][y]=="|":
        dfs2(x+1,y)
    return

N,M = map(int,input().split())
arr = [input() for _ in range(N)]
visited = [[False]*M for _ in range(N)]
ans = 0
for i in range(N):
    for j in range(M):
        if visited[i][j]:
            continue
        ans+=1
        if arr[i][j] =="-":
            dfs1(i,j)
        else:
            dfs2(i,j)
print(ans)