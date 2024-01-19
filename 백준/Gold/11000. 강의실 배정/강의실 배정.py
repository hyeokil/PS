import sys,heapq
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = []
    for _ in range(N):
        a,b = map(int,input().split())
        arr.append((a,b))
    arr.sort()
    ans = [0]
    for i in range(N):
        x,y = arr[i]
        if x >= ans[0]:
            heapq.heappop(ans)
        heapq.heappush(ans,y)
    print(len(ans))
Main()