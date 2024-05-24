import sys
input = sys.stdin.readline

def find(a):
    if parent[a] != a:
        parent[a] = find(parent[a])
    return parent[a]

def union(a,b):
    a=find(a)
    b =find(b)
    if a!=b:
        parent[b]= a
        return True
    else:
        return False

N,M,K = map(int,input().split())
lst = list(map(int,input().split()))
parent = [i for i in range(N+1)]
for i in lst:
    parent[i] = 0
arr = []
for _ in range(M):
    a,b,c = map(int,input().split())
    arr.append((c,a,b))
arr.sort()
ans = 0
cnt = 0
for v,x,y in arr:
    if union(x,y):
        cnt+=1
        ans+=v
print(ans)