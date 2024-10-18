import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    dp = [[0]*(K+1) for i in range(N+1)]
    dp[1][1] =1
    for i in range(2,N+1):
        for j in range(1,min(i+1,K+1)):
            dp[i][j] = dp[i-1][j]+dp[i-1][j-1]
    print(dp[N][K])
Main()