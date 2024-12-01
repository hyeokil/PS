import sys
input = sys.stdin.readline


def Main():
    N = int(input())
    list_ = list(map(int,input().split()))
    print(max(list_)-min(list_))
Main()