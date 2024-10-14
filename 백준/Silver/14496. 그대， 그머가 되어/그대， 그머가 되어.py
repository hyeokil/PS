from collections import deque
import sys
input= sys.stdin.readline

def Main():
    A,B = map(int,input().split())
    N,M = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a,b = map(int,input().split())
        arr[a].append(b)
        arr[b].append(a)
    q = deque()
    q.append((A,0))
    visited = [False]*(N+1)
    visited[A] = True
    ans = -1
    while q:
        now,cnt = q.popleft()
        if now == B:
            ans = cnt
            break
        for i in arr[now]:
            if not visited[i]:
                visited[i] = True
                q.append((i,cnt+1))
    print(ans)
Main()