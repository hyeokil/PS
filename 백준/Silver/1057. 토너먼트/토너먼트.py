import sys
input = sys.stdin.readline

def Main():
    L = list(map(int,input().split()))
    ans = 0
    while L[1]!=L[2]:
        L[1]-=L[1]//2
        L[2]-=L[2]//2
        ans+=1
    print(ans)
Main()