import sys
input = sys.stdin.readline
def Main():
    N,M = map(int, input().split())
    lst = [int(input()) for _ in range(N)]
    lst.sort()
    ans = float('inf')
    s,e = 0,0
    while e<N:
        V = lst[e]-lst[s]
        if V == M :
            ans = M
            break
        if M < V :
            if V < ans :
                ans = V
            s+=1
        elif V < M:
            e+=1
    print(ans)
Main()