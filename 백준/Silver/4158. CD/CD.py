import sys
input = sys.stdin.readline

def Main():
    while True:
        N,M= map(int,input().split())
        if N==0 and M==0:break
        se = set(int(input()) for _ in range(N+M))
        print(N + M - len(se))
Main()