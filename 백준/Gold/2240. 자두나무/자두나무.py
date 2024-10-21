import sys
input = sys.stdin.readline

def Main():
    T,W = map(int,input().split())
    dp = [[0]*(W+1) for _ in range(T+1)]
    for i in range(1,T+1):
        N = int(input())
        for j in range(min(W+1,i+1)):
            if j%2 == N-1:
                if j==0:
                    dp[i][j] = dp[i-1][j]+1
                else:
                    dp[i][j] = max(dp[i-1][j],dp[i-1][j-1])+1
            else:
                if j==0:
                    dp[i][j] = dp[i-1][j]
                else:
                    dp[i][j] = max(dp[i-1][j],dp[i-1][j-1])
    print(max(dp[T]))
Main()