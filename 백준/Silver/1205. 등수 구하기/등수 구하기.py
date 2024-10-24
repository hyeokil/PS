import sys
input = sys.stdin.readline
def Main():
    N,M,P = map(int,input().split())
    if N>0:
        lst = list(map(int,input().split()))
        ans = -1
        for i in range(N):
            if lst[i] <=M:
                ans = i+1
                break
        else:
            if P>N:
                ans = N+1
        if lst[-1] == M and N==P:
            ans = -1
        print(ans)
    else:
        print(1)
Main()