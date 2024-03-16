import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    L = list(map(int, input().split()))
    B,C = map(int,input().split())
    ans = N
    for l in L:
        if l>B:
            ans += (l-B)//C
            if (l-B)%C:
                ans+=1
    print(ans)
Main()