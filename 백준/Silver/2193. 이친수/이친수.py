def Main():
    N = int(input())
    dp0 = 0
    dp1 = 1
    for i in range(2,N+1):
        tmp = dp0+dp1
        dp0=dp1
        dp1 = tmp
    print(dp1)
Main()