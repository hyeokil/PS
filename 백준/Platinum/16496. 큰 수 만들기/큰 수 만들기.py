import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = input().split()
    lst.sort(key=lambda x:x*9,reverse=True)
    print(int("".join(lst)))
Main()