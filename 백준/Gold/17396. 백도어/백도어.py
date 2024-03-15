import sys, heapq
input = sys.stdin.readline
          
N,M = map(int,input().split())
lst = list(map(int,input().split()))
lst[-1] = 0
arr = [{} for _ in range(N)]
for _ in range(M):
    a,b,t = map(int, input().split())
    if lst[a]  or lst[b] :
        continue
    arr[a][b] = t
    arr[b][a] = t
dis = [float("inf")] * N
dis[0] =0
q = [(0,0)]
while q :
  nowD , now = heapq.heappop(q)
  if dis[now] < nowD :
    continue
  for go in arr[now].keys():
    ndis = arr[now][go]+nowD
    if dis[go]>ndis:
      dis[go]=ndis
      heapq.heappush(q,(ndis,go))
if dis[N-1] == float("inf") :
  print(-1)
else:
  print(dis[N-1])
