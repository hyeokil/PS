import sys,heapq
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = []
    visited = [False]*N
    for i in range(N):
        a,b = map(float, input().split())
        lst.append((a,b))
    q= [(0,0)]
    cnt = 0
    ans = 0
    while q :
        if cnt == N:
            break
        D, now = heapq.heappop(q)
        if visited[now] :
            continue
        visited[now] =True
        cnt+=1
        ans += D
        for i in range(N):
            if i != now :
                V = ((lst[now][0]-lst[i][0])**2+(lst[now][1]-lst[i][1])**2)**0.5
                heapq.heappush(q,(V,i))
    print(ans)
Main()