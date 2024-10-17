import sys
input = sys.stdin.readline

def Main():
    dp = [[0,0,0] for _ in range(100001)]
    dp[1] = [1,0,0]
    dp[2] = [0,1,0]
    dp[3] = [1,1,1]
    for i in range(4,100001):
        for j in range(3):
            dp[i][j] = (dp[i-j-1][(j+1)%3] + dp[i-j-1][(j+2)%3])%1000000009

    for _ in range(int(input())):
        print(sum(dp[int(input())])%1000000009)
Main()