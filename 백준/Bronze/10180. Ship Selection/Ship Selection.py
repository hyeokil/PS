import sys
input = sys.stdin.readline

for tc in range(int(input())):
    N,D = map(int,input().split())
    ans = 0
    for i in range(N):
        V,F,C = map(int,input().split())
        if V*(F/C)>=D:
            ans+=1
    print(ans)