import sys
input = sys.stdin.readline

def Main():
    N=int(input())
    arr = [list(map(int,input().split())) for i in range(N)]
    ans = float('inf')
    for k in range(3):
        dp = [[float('inf')]*3 for i in range(N)]
        dp[0][k]=arr[0][k]
        for i in range(1,N):
            for j in range(3):
                dp[i][j] = arr[i][j]+min(dp[i-1][j-1],dp[i-1][j-2])
        ans = min(ans,dp[-1][k-1],dp[-1][k-2])
    print(ans)
Main()