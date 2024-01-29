import sys, heapq
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    arr = [[] for i in range(N+1)]
    for i in range(M):
        a,b,c = map(int,input().split())
        arr[a].append((b,c))
        arr[b].append((a,c))
    dist = [[float('inf')]*(N+1) for i in range(N+1)]
    ans = [[0]*(N+1) for i in range(N+1)]
    for i in range(1,N+1):
        dist[i][i] = 0
        ans[i][i] = '-'
        q = [(0,i,'@')]
        while q:
            nowD, now,first = heapq.heappop(q)
            if dist[i][now] < nowD:
                continue
            for go,goD in arr[now]:
                curD = nowD+goD
                if dist[i][go] > curD:
                    dist[i][go] = curD
                    if first == '@':
                        heapq.heappush(q,(curD,go,go))
                        ans[i][go] = go
                    else:
                        heapq.heappush(q,(curD,go,first))
                        ans[i][go] = first
        print(*ans[i][1::])
Main()