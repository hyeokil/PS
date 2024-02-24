import sys,heapq
input = sys.stdin.readline

def Main():
    q = []
    for _ in range(int(input())):
        lst = list(map(int,input().split()))
        if lst[0]:
            for i in range(1,lst[0]+1):
                heapq.heappush(q,-lst[i])
        else:
            if q:print(-heapq.heappop(q))
            else:print(-1)
Main()