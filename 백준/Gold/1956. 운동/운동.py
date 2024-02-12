import sys
input = sys.stdin.readline
def Main():
    N,M = map(int, input().split())
    dist = [[float('inf')]*(N+1)for _ in range(N+1)]
    for _ in range(M):
        a, b,c = map(int,input().split())
        if dist[a][b] > c:
            dist[a][b] = c
    for k in range(1,N+1):
        for i in range(1,N+1):
            for j in range(1,N+1):
                dist[i][j] = min(dist[i][j],dist[i][k]+dist[k][j])
    ans = float('inf')
    for i in range(1,N+1):
        if dist[i][i] < ans :
            ans = dist[i][i]
    if ans == float('inf'):
        print(-1)
    else:
        print(ans)
Main()