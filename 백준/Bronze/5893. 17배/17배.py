import sys
input = sys.stdin.readline

def Main():
    N = input().rstrip()
    print(bin(int(N,2)*17)[2:])
Main()