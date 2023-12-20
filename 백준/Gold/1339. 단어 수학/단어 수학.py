def Main():
    N = int(input())
    lst = []
    dict = {}
    alp ='ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    lstV = []
    for i in range(26):
        dict[alp[i]] = 0
    for _ in range(N):
        S = input()[::-1]
        for i in range(len(S)):
            dict[S[i]] += 10**i
    for val in dict.values():
        if val > 0:
            lstV.append(val)
    lstV.sort(reverse=True)
    num = 9
    ans = 0
    for val in lstV :
        ans += val*num
        num-=1
    print(ans)
Main()

