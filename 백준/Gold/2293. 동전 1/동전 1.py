N,K = map(int, input().split())
dp = [0]*(K+1)
dp[0] = 1
coins = [int(input()) for _ in range(N)]

for coin in coins:
    for k in range(coin,K+1):
        if k - coin >= 0 :
            dp[k]+=dp[k-coin]
print(dp[K])
