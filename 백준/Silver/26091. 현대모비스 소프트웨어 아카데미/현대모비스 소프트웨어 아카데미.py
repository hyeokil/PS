import sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    lst = list(map(int, input().split()))
    lst.sort()
    s=0
    e=N-1
    ans = 0
    while s<e:
        V = lst[s]+lst[e]
        if V >=M:
            ans +=1
            s+=1
            e-=1
        else:
            s+=1
    print(ans)
Main()