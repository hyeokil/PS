import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = list(map(int,input().split()))
    lst.sort()
    print(lst[(N-1)//2])
Main()
