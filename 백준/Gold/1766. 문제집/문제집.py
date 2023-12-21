import sys, heapq
input = sys.stdin.readline
def Main():
    N,M = map(int,input().split())
    inde= [0]*(N+1)
    arr = [[] for _ in range(N+1)]
    for _ in range(M):
        a, b = map(int,input().split())
        inde[b] += 1
        arr[a].append(b)
    ans = []
    q = []
    for i in range(1,N+1):
        if inde[i] == 0 :
            heapq.heappush(q,i)
    while q :
        x = heapq.heappop(q)
        ans.append(x)
        for y in arr[x]:
            inde[y] -= 1
            if inde[y] == 0 :
                heapq.heappush(q,y)
    print(*ans)
Main()
