import heapq
import sys
input = sys.stdin.readline

def dijk(a):
    dist = [float("inf") for _ in range(N+1)]
    dist[a] = 0
    hq = []
    heapq.heappush(hq,(0,a))
    while hq:
        curD,cur = heapq.heappop(hq)
        if dist[cur] < curD : continue
        for now in roads[cur].keys():
            D = curD + roads[cur][now]
            if D < dist[now]:
                dist[now] = D
                heapq.heappush(hq,(D,now))
    return dist

N = int(input())
A,B,C = map(int,input().split())
roads = [{} for _ in range(N+1)]
M = int(input())
for _ in range(M):
    d,e,l = map(int,input().split())
    if e in roads[d]:
        if roads[d][e] > l:
            roads[d][e] = l
    else:
        roads[d][e] = l
    if d in roads[e]:
        if roads[e][d] > l:
            roads[e][d] = l
    else:
        roads[e][d] = l
distA = dijk(A)
distB = dijk(B)
distC = dijk(C)
ans = 0
mx = 0
for i in range(1,N+1):
    if distA[i]!=float('inf') and distB[i]!=float('inf') and distC[i]!=float('inf'):
        if mx < min(distA[i],distB[i],distC[i]):
            mx = min(distA[i], distB[i], distC[i])
            ans = i
print(ans)