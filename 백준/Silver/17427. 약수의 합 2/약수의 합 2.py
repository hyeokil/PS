import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    S = 0
    for i in range(1,N+1):
        S+=(N//i)*i
    print(S)
Main()