import sys
from collections import deque
input = sys.stdin.readline

def Main():
    N, M, R = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a,b = map(int,input().split())
        arr[a].append(b)
        arr[b].append(a)
    for i in range(1,N+1):arr[i].sort(reverse=True)
    visited = [0]*(N+1)
    visited[R] = 1
    q = deque()
    q.append(R)
    idx = 2
    while q:
        x = q.popleft()
        for i in arr[x]:
            if visited[i]==0:
                visited[i] = idx
                idx+=1
                q.append(i)
    for i in range(1,N+1):
        print(visited[i])    
Main()