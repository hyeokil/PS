import heapq,sys
input = sys.stdin.readline

def Main():
    N,M = map(int,input().split())
    P = list(map(int,input().split()))
    q= []
    for p in P:heapq.heappush(q,-p)
    C = list(map(int,input().split()))
    for c in C:
        x = -heapq.heappop(q)
        if x<c:
            print(0)
            break
        heapq.heappush(q,-(x-c))
    else:print(1)
Main()