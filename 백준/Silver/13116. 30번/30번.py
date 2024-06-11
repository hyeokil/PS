import sys
input = sys.stdin.readline
T = int(input())
for tc in range(T):
    A,B = map(int,input().split())
    C = min(A,B)
    D = max(A,B)
    visited = [False]*(max(C,D//2)+1)
    while C >0:
        visited[C]=True
        C//=2
    ans = 0
    while D>1:
        D//=2
        if visited[D]:
            ans = D
            break
    print(ans*10)