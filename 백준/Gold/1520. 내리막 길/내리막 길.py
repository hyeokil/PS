import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)
def dfs(x,y):
    cnt = 0
    if x == N-1 and y == M-1 :
        return 1
    if dp[x][y] != -1 :
        return dp[x][y]
    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
        nx,ny = x+dx,y+dy
        if 0<=nx<N and 0<=ny<M and arr[nx][ny] < arr[x][y]:
            cnt += dfs(nx,ny)
    dp[x][y] = cnt 
    return dp[x][y]

N,M = map(int, input().split())
arr = [list(map(int,input().split())) for _ in range(N)]
dp = [[-1]*M for _ in range(N)]
dp[0][0] = -1

print(dfs(0,0))