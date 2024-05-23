import heapq,sys
input = sys.stdin.readline

def Main():
    while True :
        N,M = map(int,input().split())
        if N == 0 and M == 0:
            break
        arr = [[] for _ in range(N)]
        ans = 0
        for _ in range(M):
            x,y,z = map(int,input().split())
            arr[x].append((y,z))
            arr[y].append((x, z))
            ans+=z
        cnt = 0
        visited = [False]*N
        q= [(0,0)]
        while q:
            if cnt==N:
                break
            nowD,now = heapq.heappop(q)
            if visited[now]:
                continue
            visited[now]=True
            ans-=nowD
            cnt+=1
            for go, goD in arr[now]:
                heapq.heappush(q, (goD,go))
        print(ans)
Main()