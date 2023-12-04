def Main():
    N,M = map(int, input().split())
    lst = list(map(int, input().split()))
    remainder = [0]*M
    prefix=0
    for i in lst:
        prefix+=i
        remainder[prefix%M] += 1
    ans = remainder[0]
    for i in range(M):
        ans += remainder[i]*(remainder[i]-1)//2
    print(ans)
Main()