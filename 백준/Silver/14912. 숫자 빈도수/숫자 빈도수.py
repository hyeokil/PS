def Main():
    N, D = map(int,input().split())
    ans = 0
    for n in range(1,N+1):
        a = str(n)
        ans += a.count(str(D))
    print(ans)
Main()