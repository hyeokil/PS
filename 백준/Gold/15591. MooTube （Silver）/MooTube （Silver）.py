import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,Q = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for _ in range(N-1):
        a,b,c = map(int,input().split())
        arr[a].append((b,c))
        arr[b].append((a, c))
    for _ in range(Q):
        a,b = map(int,input().split())
        visited = [False]*(N+1)
        visited[b] = True
        q=deque([b])
        ans = 0
        while q:
            x= q.popleft()
            for y,yv in arr[x]:
                if visited[y]:
                    continue
                if yv>=a :
                    ans+=1
                    q.append(y)
                    visited[y]=True
        print(ans)
Main()