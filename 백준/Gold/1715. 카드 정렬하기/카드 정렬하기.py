import sys,heapq
input = sys.stdin.readline

def Main():
    N = int(input())
    q = []
    for _ in range(N):
        n = int(input())
        heapq.heappush(q,n)
    ans = 0
    while N > 1:
        x = heapq.heappop(q)
        y = heapq.heappop(q)
        ans += x+y
        heapq.heappush(q,x+y)
        N-=1
    print(ans)
Main()