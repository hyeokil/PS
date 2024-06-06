import sys
input = sys.stdin.readline

N = int(input())
lst = [0]+list(map(int, input().split()))
dp = [0]*(N+1)
for i in range(1,N+1):
    for j in range(i,N+1):
        dp[j] = max(dp[j],dp[j-i]+lst[i])
print(dp[N])
