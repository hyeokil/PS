def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    dp1 = [1]*N
    dp2 = [1]*N
    for i in range(N):
        a = lst[i]
        for j in range(i):
            b = lst[j]
            if a>b :
                dp1[i] = max(dp1[j]+1,dp1[i])
    for i in range(N-1,-1,-1):
        a = lst[i]
        for j in range(N-1,i,-1):
            b = lst[j]
            if a>b:
                dp2[i] = max(dp2[j]+1,dp2[i])
    ans = 0
    for i in range(N):
        if ans < dp1[i]+dp2[i]:
            ans = dp1[i]+dp2[i]
    print(ans-1)
Main()