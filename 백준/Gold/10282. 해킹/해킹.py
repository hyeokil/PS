import sys, heapq
input = sys.stdin.readline
def Main():
    for tc in range(int(input())):
        N,D,C = map(int,input().split())
        arr = [[] for _ in range(N+1)]
        for d in range(D):
            a,b,s = map(int, input().split())
            arr[b].append((a, s))
        dist = [float('inf')]*(N+1)
        dist[C] = 0
        q= [(0,C)]
        ans = 0
        mx = 0
        while q :
            t,c = heapq.heappop(q)
            for go, got in arr[c]:
                curt = t+got
                if dist[go] > curt:
                    dist[go] = curt
                    heapq.heappush(q,(curt,go))
        for i in range(1,N+1):
            if dist[i] != float('inf'):
                ans+=1
                if mx < dist[i]:
                    mx = dist[i]
        print(ans, mx)
Main()