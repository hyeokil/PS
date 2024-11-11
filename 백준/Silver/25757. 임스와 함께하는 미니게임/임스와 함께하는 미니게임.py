import sys
input = sys.stdin.readline

def Main():
    se = set()
    N, M = input().rstrip().split()
    N = int(N)
    ans = 0
    cnt = 1
    for _ in range(N):
        S = input().rstrip()
        if S not in se: cnt+=1
        se.add(S)
        if M == 'Y' and cnt==2:
            ans+=1
            cnt=1
        elif M=='F' and cnt==3:
            ans+=1
            cnt=1
        elif M=='O' and cnt==4:
            ans+=1
            cnt=1
    print(ans)            
Main()