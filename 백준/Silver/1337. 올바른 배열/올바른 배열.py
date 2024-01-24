import sys
input = sys.stdin.readline

def Main():
    N =int(input())
    lst = [int(input()) for _ in range(N)]
    lst.sort()
    se = set(lst)
    ans = 0
    for i in range(N):
        res = 0
        for j in range(5):
            if lst[i]+j in se:
                res+=1
        ans = max(ans,res)
    if ans >=5:
        print(0)
    else:print(5-ans)
Main()