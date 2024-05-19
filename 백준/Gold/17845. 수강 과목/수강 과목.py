import sys
input = sys.stdin.readline

N,M = map(int,input().split())
dp = [-1]*(N+1)
dp[0]=0
for _ in range(M):
    a,b=map(int,input().split())
    for i in range(N,-1,-1):
        if dp[i]!=-1 and i+b <=N:
            dp[i+b]=max(dp[i]+a,dp[i+b])
print(max(dp))

