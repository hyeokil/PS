import sys
input = sys.stdin.readline
def f():
    for tc in range(int(input())):
        A,B = map(int,input().split())
        while A!=B:
            if A>B:A//=2
            else:B//=2
        print(A*10)
f()