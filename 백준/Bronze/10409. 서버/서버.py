import sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    lst= list(map(int,input().split()))
    ans = 0
    for i in range(N):
        if M>=lst[i]:
            M-=lst[i]
            ans+=1
        else:
            break
    print(ans)
Main()