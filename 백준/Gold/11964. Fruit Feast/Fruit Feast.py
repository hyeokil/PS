import heapq

def Main():
    T,A,B = map(int,input().split())
    ans = 0
    dp = [[False]*2 for _ in range(T+1)]
    q=[]
    heapq.heappush(q,(1,A))
    heapq.heappush(q,(1,B))

    while q :
        cnt,V = heapq.heappop(q)
        if V>T:
            continue
        dp[V][cnt]=True
        ans = max(ans,V)
        if cnt and not dp[V//2][0]:
            heapq.heappush(q,(0,V//2))
        if T-V>=A:
            heapq.heappush(q,(cnt,V+A*((T-V)//A)))
        if T-V>=B:
            heapq.heappush(q,(cnt,V+B*((T-V)//B)))
    print(ans)
Main()