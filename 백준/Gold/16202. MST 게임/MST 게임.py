import heapq,sys
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
arr = []
for i in range(1,M+1):
    a,b = map(int,input().split())
    arr.append((i,a,b))
ans = [0]*K
for i in range(K):
    res = 0
    cnt = 0
    parent = [i for i in range(N+1)]
    for v,x,y in arr[i:]:
        if union(x,y):
            cnt+=1
            res+=v
            if cnt==N-1:break
    if cnt != N-1:break
    else:ans[i]=res
print(*ans)