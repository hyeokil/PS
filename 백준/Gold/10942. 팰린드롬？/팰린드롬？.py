import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    L = list(map(int, input().split()))
    M = int(input())
    dp = [[0]*N for _ in range(N)]
    for i in range(N):
        dp[i][i]=1
    for i in range(1,N):
        if L[i-1]==L[i]:
            dp[i-1][i]=1
    for i in range(2,N):
        for s in range(N-i):
            e = s+i
            if L[s]==L[e]:
                if dp[s+1][e-1]==1:
                    dp[s][e]=1
    for _ in range(M):
        a,b = map(int, input().split())
        print(dp[a-1][b-1])
Main()