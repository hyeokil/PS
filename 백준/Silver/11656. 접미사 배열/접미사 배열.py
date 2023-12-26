def Main():
    S = input()
    res = set()
    L = len(S)
    for i in range(L):
        res.add(S[i:L])
    ans = sorted(res)
    for a in ans :
        print(a)
Main()