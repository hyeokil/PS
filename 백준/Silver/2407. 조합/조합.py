import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)

def fac(a):
    if a==1:
        return 1
    return a*fac(a-1)

def Main():
    N,M = map(int,input().split())
    print(fac(N)//(fac(M)*fac(N-M)))
Main()
