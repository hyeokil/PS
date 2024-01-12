import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,W = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    lst = [0]*(N+1)
    child = [-1]*(N+1)
    for _ in range(N-1):
        u,v = map(int,input().split())
        arr[u].append(v)
        arr[v].append(u)
    q = deque()
    q.append(1)
    while q:
        x = q.popleft()
        res = 0
        parent = -1
        for y in arr[x] :
            if child[y] == -1:
                q.append(y)
                res+=1
            else:
                parent = y
        if parent != -1 :
            arr[x].remove(parent)
        child[x] = res
    q = deque()
    q.append((1,W))
    while q :
        x,v = q.popleft()
        lst[x] = v
        if child[x] == 0 :
            continue
        V = v/child[x]
        for y in arr[x]:
            q.append((y,V))
        lst[x] = 0
    ans = 0
    cnt = 0
    for i in lst:
        if i >0:
            ans +=i
            cnt+=1
    print(ans/cnt)
Main()