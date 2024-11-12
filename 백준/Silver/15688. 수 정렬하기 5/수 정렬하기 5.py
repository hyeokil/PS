import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = [int(input()) for _ in range(N)]
    lst.sort()
    for i in range(N):
        print(lst[i])
Main()

