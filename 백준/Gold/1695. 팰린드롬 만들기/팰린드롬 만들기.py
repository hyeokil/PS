import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    dp = [[0]*N for _ in range(2)]
    for i in range(N-1,-1,-1):
        for j in range(i+1,N):
            x = i%2
            if lst[i] != lst[j]:
                dp[x][j] = min(dp[x][j-1],dp[x-1][j])+1
            else:
                dp[x][j] = dp[x-1][j-1]
    print(dp[0][N-1])
Main()    