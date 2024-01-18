import sys,heapq
input = sys.stdin.readline

def Main():
    for tc in range(int(input())):
        N,M = map(int,input().split())
        arr = [[]for _ in range(N+1)]
        for _ in range(M):
            a,b,c = map(int,input().split())
            arr[a].append((b,c))
            arr[b].append((a,c))
        K = int(input())
        lst = list(map(int,input().split()))
        dist = [[float('inf')]*K for _ in range(N+1)]
        for i in range(K):
            dist[lst[i]][i] = 0
            visited = [False]*(N+1)
            q = [(0,lst[i])]
            while q :
                nowD,now = heapq.heappop(q)
                if visited[now]:
                    continue
                visited[now] = True
                for go,goD in arr[now]:
                    curD = nowD+goD
                    if dist[go][i] > curD:
                        dist[go][i] =curD
                        heapq.heappush(q,(curD,go))
        res = float('inf')
        ans = -1
        for i in range(1,N+1):
            if res > sum(dist[i]):
                res = sum(dist[i])
                ans = i
        print(ans)
Main()