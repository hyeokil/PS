import heapq

def Main():
    N = int(input())
    da = int(input())
    q = []
    for i in range(N-1):
        a = int(input())
        heapq.heappush(q, -a)
    ans = 0
    while q:
        x = heapq.heappop(q)
        if -x < da:
            break
        ans+=1
        heapq.heappush(q,x+1)
        da+=1
    print(ans)
Main()