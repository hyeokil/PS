import heapq
def Main():
    N,M,A,B,C = map(int,input().split())
    arr =[[]for _ in range(N+1)]
    for i in range(M):
        a,b,c = map(int,input().split())
        arr[a].append((b,c))
        arr[b].append((a,c))
    visited = [False]*(N+1)
    q = [(0,0,A)]
    visited[A] = True
    ans = float('inf')
    while q:
        big,nowD,now = heapq.heappop(q)
        visited[now] = True
        if now == B:
            ans = big
            break
        for go,goD in arr[now]:
            curD = goD+nowD
            if curD <= C and not visited[go]:
                heapq.heappush(q,(max(big,goD),curD,go))
    if ans==float("inf"):print(-1)
    else:print(ans)
Main()