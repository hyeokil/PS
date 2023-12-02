def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    check = [False]*(N+2)
    check[N+1] = True
    dp = [1]*(N+1)
    for i in lst:
        check[i] = True
        if check[i+1] == False :
            dp[i] = dp[i-1] +1
        else:
            dp[i] = dp[i-1]
    print(N-max(dp))

Main()