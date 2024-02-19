import heapq

def Main():
    N,M = map(int,input().split())
    lst = list(map(int,input().split()))
    heapq.heapify(lst)
    for i in range(M):
        a = heapq.heappop(lst)
        b = heapq.heappop(lst)
        heapq.heappush(lst,a+b)
        heapq.heappush(lst, a + b)
    print(sum(lst))
Main()