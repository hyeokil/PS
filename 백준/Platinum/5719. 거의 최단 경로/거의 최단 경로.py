import sys, heapq
input = sys.stdin.readline
from collections import deque
def dijk():
    q = [(0,S)]
    dist = [float('inf')]*N
    dist[S] = 0
    while q :
        nowd,now = heapq.heappop(q)
        if dist[now] < nowd :
            continue
        for go,god in arr[now]:
            if visited[now][go]:
                continue
            curd = nowd + god
            if dist[go] > curd:
                dist[go] = curd
                heapq.heappush(q,(curd,go))
    return dist

def bfs():
    q = deque()
    q.append(E)
    while q :
        x = q.popleft()
        if x == S :
            continue
        for y,yd in rarr[x]:
            if d1[y]+yd == d1[x] and not visited[y][x]:
                visited[y][x] = True
                q.append(y)
while True :
    N,M = map(int,input().split())
    if N == 0 and M == 0 :
        break
    S,E = map(int,input().split())
    arr = [[] for _ in range(N)]
    rarr = [[] for _ in range(N)]
    visited = [[False]*N for _ in range(N)]
    for i in range(M):
        a,b,c = map(int, input().split())
        arr[a].append((b,c))
        rarr[b].append((a,c))
    d1 = dijk()
    if d1[E] == float('inf'):
        print(-1)
        continue
    bfs()
    d2 = dijk()
    if d2[E] == float('inf'):
        print(-1)
    else:
        print(d2[E])
