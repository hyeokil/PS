import sys,math
input = sys.stdin.readline
def Main():
    N = int(input())
    lst = []
    tmp = int(input())
    for i in range(N-1):
        n = int(input())
        lst.append(n-tmp)
        tmp = n
    res = lst[0]
    for i in range(1,N-1):
        res = math.gcd(res,lst[i])
    ans = 0
    for i in range(N-1):
        ans += lst[i]//res-1
    print(ans)
Main()