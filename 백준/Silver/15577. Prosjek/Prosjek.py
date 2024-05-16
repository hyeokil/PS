import heapq
N = int(input())
q = []
for _ in range(N):
    a = int(input())
    heapq.heappush(q, a)
for _ in range(N-1):
    a = heapq.heappop(q)
    b = heapq.heappop(q)
    heapq.heappush(q,(a+b)/2)
print(f"{heapq.heappop(q):.6f}")