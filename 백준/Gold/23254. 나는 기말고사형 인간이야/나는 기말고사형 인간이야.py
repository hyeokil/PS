import sys,heapq
input = sys.stdin.readline

def Main():
    N,M = map(int, input().split())
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    q = []
    for i in range(M):
        heapq.heappush(q,(-B[i],i))
    time = N*24
    ans = sum(A)
    while q:
        value,idx = heapq.heappop(q)    
        value = -value
        need = (100 - A[idx])//value
        possible = min(time,need)
        time -= possible
        ans+=possible*value
        A[idx] += possible*value
        tmp = 100 - A[idx]
        if tmp >0:
            heapq.heappush(q,(-tmp,idx))
        if time == 0:
            break
    print(ans)
Main()


