import sys
input = sys.stdin.readline

def Main():
    N,D,K,C = map(int,input().split())
    lst = [int(input()) for _ in range(N)]
    ans =0
    for i in range(N):
        if i+K>N:ans = max(ans, len(set(lst[i:]+lst[:(i+K)%N]+[C])))
        else:ans = max(ans, len(set(lst[i:i+K]+[C])))
    print(ans)
    
Main()