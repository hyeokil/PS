import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    L = [list(map(int, input().split())) for _ in range(N)]
    L.sort()
    mx = L[0][1]
    ans = L[0][1]-L[0][0]
    for i in range(1,N):
        if L[i][1] <= mx:continue
        elif L[i][0]<mx:
            ans+=L[i][1]-mx
            mx = L[i][1]
        else:
            ans += L[i][1]-L[i][0]
            mx = L[i][1]
    print(ans)
Main()