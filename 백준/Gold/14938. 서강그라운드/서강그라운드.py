import sys,heapq
input = sys.stdin.readline
def Main():
    N,M,R = map(int, input().split())
    items = [0]+list(map(int, input().split()))
    way =[[] for _ in range(N+1)]
    for r in range(R):
        a,b,c = map(int,input().split())
        way[a].append((b,c))
        way[b].append((a,c))
    max_item = [[0]*(N+1) for _ in range(N+1)]
    for i in range(1,N+1):
        q = [(0,i)]
        max_item[i][i]= items[i]
        while q :
            xd,x = heapq.heappop(q)
            for y,yd in way[x]:
                curd = xd+yd
                if curd <= M :
                    max_item[i][y] = items[y]
                    heapq.heappush(q,(curd,y))
    ans = 0
    for i in max_item:
        if ans < sum(i):
            ans = sum(i)
    print(ans)
Main()