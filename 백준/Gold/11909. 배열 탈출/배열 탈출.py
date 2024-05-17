import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    dp = [[float('inf')]*N for _ in range(N)]
    dp[0][0]=0
    for i in range(N):
        for j in range(N):
            if 0<=i-1:
                if arr[i-1][j] > arr[i][j]:
                    dp[i][j] = min(dp[i-1][j],dp[i][j])
                else:
                    dp[i][j] = min(dp[i-1][j]+arr[i][j]-arr[i-1][j]+1,dp[i][j])
            if 0<=j-1:
                if arr[i][j-1] > arr[i][j]:
                    dp[i][j] = min(dp[i][j-1],dp[i][j])
                else:
                    dp[i][j] = min(dp[i][j-1]+arr[i][j]-arr[i][j-1]+1,dp[i][j])
    print(dp[N-1][N-1])
Main()