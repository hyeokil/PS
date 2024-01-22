import heapq
import sys
input=sys.stdin.readline

N = int(input())
arr = [[] for _ in range(N+1)]
for i in range(N-1):
    a,b,c = map(int,input().split())
    arr[a].append((b,-c))
    arr[b].append((a,-c))
dist = [float('inf') for _ in range(N+1)]
dist[1] = 0
q = [(0,1)]
visited = [False]*(N+1)
while q:
    nowD,now = heapq.heappop(q)
    if visited[now]:continue
    visited[now]=True
    for go,goD in arr[now]:
        curd = nowD+goD
        if curd < dist[go] and not visited[go]:
            dist[go]=curd
            heapq.heappush(q,(curd,go))
print(-min(dist[1:]))


