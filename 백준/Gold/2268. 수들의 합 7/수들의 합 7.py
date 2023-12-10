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
lst= [0]*(N+1)
tree = [0]*(N+1)
for m in range(M):
    Q, A, B = map(int, input().split())
    if Q == 0:
        print(Sum(max(A,B))-Sum(min(A,B)-1))
    else:
        Modify(A, B-lst[A])
        lst[A] = B

