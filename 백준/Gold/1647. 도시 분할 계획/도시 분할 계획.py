import heapq, sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a,b,c=map(int,input().split())
        arr[a].append((b,c))
        arr[b].append((a, c))
    dist = [-1]*(N+1)
    dist[0] = 0
    q = [(0,1)]
    while q :
        nowD,now = heapq.heappop(q)
        if dist[now] != -1:continue
        dist[now]=nowD
        for go,goD in arr[now]:
            if dist[go] != -1:continue
            heapq.heappush(q,(goD,go))
    print(sum(dist)-max(dist))
Main()