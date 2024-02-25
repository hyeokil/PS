def Main():
    N = int(input())
    L = list(map(int,input().split()))
    J = list(map(int,input().split()))
    dp = [0]*100
    for i in range(N):
        for j in range(99,L[i]-1,-1):
            if j>L[i]:
                if dp[j-L[i]]:
                    dp[j]= max(dp[j],dp[j-L[i]]+J[i])
            else:
                dp[j]= max(dp[j],dp[j-L[i]]+J[i])
    print(max(dp))
Main()