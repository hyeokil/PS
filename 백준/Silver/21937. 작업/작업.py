import sys
from collections import deque
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a,b = map(int,input().split())
        arr[b].append(a)
    X = int(input())
    visited = [False] * (N+1)
    ans = 0
    q = deque()
    q.append(X)
    while q:
        x = q.popleft()
        for y in arr[x]:
            if visited[y]:
                continue
            ans +=1
            visited[y] = True
            q.append(y)
    print(ans)
Main()
