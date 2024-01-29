import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    di = {}
    for i in range(N):
        _,S = input().rstrip().split('.')
        if S in di :di[S] +=1
        else:di[S]=1
    for a,b in sorted(di.items()):
        print(a,b)
Main()