import sys
input = sys.stdin.readline

def Modify(i, diff):
    while i <= N:
        tree[i] += diff
        i += (i & -i)
def Sum(i):
    result = 0
    while i>0:
        result+=tree[i]
        i -= (i & -i)
    return result

N,M = map(int, input().split())
lst= [0]+list(map(int, input().split()))
tree = [0]*(N+1)
for i in range(1,N+1):
    Modify(i,lst[i])
for m in range(M):
    X, Y, A, B = map(int, input().split())
    print(Sum(max(X,Y))-Sum(min(X,Y)-1))
    Modify(A, B-lst[A])
    lst[A]=B
