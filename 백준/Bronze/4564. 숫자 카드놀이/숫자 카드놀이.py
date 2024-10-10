import sys
input = sys.stdin.readline

while True:
    N = input().rstrip()
    if N == "0": break
    res = int(N[0])
    ans = N
    while len(N)>1:
        for i in range(1,len(N)):
            res *= int(N[i])
        ans += " "+str(res)
        N = str(res)
        res = int(N[0])
    print(ans)


