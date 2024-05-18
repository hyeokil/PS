import sys
input = sys.stdin.readline
def Main():
    N,K = map(int,input().split())
    weights = list(map(int,input().split()))
    weights.sort()
    s=0
    e=N-1
    ans = 0
    while s<e :
        V = weights[s]+weights[e]
        if V > K:
            e-=1
        else:
            ans+=1
            s+=1
            e-=1
    print(ans)
Main()