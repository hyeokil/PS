from collections import deque
import sys
input = sys.stdin.readline

def Main():
    N,M,S = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    visited= [0]*(N+1)
    for _ in range(M):
        a,b = map(int,input().split())
        arr[a].append(b)
        arr[b].append(a)
    for i in range(1,N+1):arr[i].sort()
    q = deque()
    q.append(S)
    visited[S]=1
    cnt = 2
    while q:
        x = q.popleft()
        for y in arr[x]:
            if visited[y]==0:
                visited[y]=cnt
                cnt+=1
                q.append(y)
    for i in range(1,N+1):
        print(visited[i])
Main()