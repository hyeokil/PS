import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)
def find(a):
    if parent[a] != a:
        parent[a] = find(parent[a])
    return parent[a]

def union(a,b):
    a = find(a)
    b = find(b)
    if a!=b:
        parent[b]=a

N = int(input())
parent = [i for i in range(N+1)]
for i in range(N-2):
      a,b = map(int,input().split())
      union(a,b)
A = find(1)
for i in range(2,N+1):
    if A != find(i):
        print(1,i)
        break