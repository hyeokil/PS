import sys
input  = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    dp = [float('inf')]*(K+1)
    coins = []
    for i in range(N):
        coins.append(int(input()))
    for coin in coins:
        if coin <=K :
            dp[coin] =1
            if coin == K:break
        for i in range(coin+1,K+1):
            if dp[i] > 0 :
                dp[i] = min(dp[i],dp[i-coin]+1)
    if dp[K] ==float('inf'):print(-1)
    else:print(dp[K])
Main()