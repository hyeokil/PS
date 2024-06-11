import sys
input = sys.stdin.readline

def Main():
    T = int(input())
    for tc in range(T):
        A,B = map(int,input().split())
        while A!=B:
            if A>B:A//=2
            else:B//=2
        print(A*10)
Main()