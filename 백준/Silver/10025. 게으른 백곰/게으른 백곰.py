import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    lstX = []
    lstG = []
    for _ in range(N):
        g,x = map(int,input().split())
        lstX.append(x)
        lstG.append(g)
    lst = [0]*(max(lstX)+1)
    for i in range(N):
        lst[lstX[i]]=lstG[i]
    now = 0
    if 2*K+1 >max(lstX):
        now = sum(lst)
        print(now)
    else:
        for i in range(2 * K + 1):
            now += lst[i]
        ans = now
        for i in range(2 * K + 1, max(lstX) + 1):
            now += lst[i] - lst[i - ((2 * K) + 1)]
            ans = max(ans, now)
        print(ans)
Main()
