import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)
def dfs(x):
    global idx
    visited[x] = idx
    idx+=1
    for y in arr[x]:
        if visited[y] == 0:
            dfs(y)
    return
N,M,R=map(int,input().split())
arr = [[] for _ in range(N+1)]
visited = [0]*(N+1)
for _ in range(M):
    a,b = map(int,input().split())
    arr[a].append(b)
    arr[b].append(a)
for a in arr:
    a.sort()
idx = 1
dfs(R)
for i in range(1,N+1):
    print(visited[i])
