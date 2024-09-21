import heapq,sys
input = sys.stdin.readline
N = int(input())
M = int(input())
arr = [[] for _ in range(N+1)]
for _ in range(M):
    a,b,t = map(int, input().split())
    arr[a].append((b,t))
dis = [float('inf')] * (N+1)
s , g =map(int, input().split())
dis[s] = 0
q = [(0,s)]
while q:
    curD , now = heapq.heappop(q)
    if curD > dis[g] :
        continue
    for go,godis in arr[now] :
        nowdis = curD + godis
        if dis[go] > nowdis :
            dis[go] = nowdis
            heapq.heappush(q,(nowdis,go))
print(dis[g])

