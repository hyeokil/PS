import sys
sys.setrecursionlimit(10**8)
def f(a,b):
    if b == 1:
        return a%C
    tmp = f(a,b//2)
    if b%2 == 0:
        return tmp**2%C
    else:
        return tmp**2*a%C
A,B,C = map(int, input().split())
print(f(A,B))