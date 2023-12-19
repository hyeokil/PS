import sys
input = sys.stdin.readline
def Main():
    N = int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    dp = [[0,0,0] for _ in range(N)]
    dp[0][0] = arr[0][0]
    dp[0][1] = arr[0][1]
    dp[0][2] = arr[0][2]
    for i in range(1,N):
        for j in range(3):
            dp[i][j] = arr[i][j]+min(dp[i-1][(j+1)%3],dp[i-1][(j+2)%3])
    print(min(dp[N-1]))
Main()