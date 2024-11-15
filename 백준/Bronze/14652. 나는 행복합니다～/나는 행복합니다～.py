import sys
input = sys.stdin.readline

def Main():
    N,M,K = map(int,input().split())
    print(K//M,K%M)
Main()