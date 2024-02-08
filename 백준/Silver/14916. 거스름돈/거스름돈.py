def Main():
    N= int(input())
    dp = [float('inf')]*(N+1)
    dp[0]=0
    for i in range(5,N+1,5):
        dp[i] = dp[i-5]+1
    for i in range(2,N+1):
        dp[i]=min(dp[i],dp[i-2]+1)
    if dp[N] == float('inf'):print(-1)
    else:print(dp[N])
Main()