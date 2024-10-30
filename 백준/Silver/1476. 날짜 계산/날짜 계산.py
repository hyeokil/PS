import sys
input = sys.stdin.readline

def Main():
    E,S,M = map(int,input().split())
    ans = 1
    e,s,m = 0,0,0
    while True:
        if e==E-1 and s==S-1 and m==M-1:
            break
        ans+=1
        e= (e+1)%15
        s = (s+1)%28
        m = (m+1)%19
    print(ans)
Main()