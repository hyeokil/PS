import sys
input = sys.stdin.readline

def Main():
    N,K = map(int,input().split())
    lst = list(map(int,input().split()))
    lstC = [0,0,0]
    s = 0
    ans = float('inf')
    for i in range(N):
        lstC[lst[i]]+=1
        if lstC[1] >= K:
            while lstC[1] >= K :
                lstC[lst[s]]-=1
                s+=1
            ans = min(ans,i-s+2)
    if ans == float('inf'):print(-1)
    else:print(ans)

Main()