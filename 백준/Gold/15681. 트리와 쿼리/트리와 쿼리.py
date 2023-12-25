import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)

def dfs(a):
    visited[a] = 1
    for b in arr[a] :
        if visited[b] == -1:
            visited[a] += dfs(b)
    return visited[a]

N,R,Q = map(int, input().split())
arr= [[] for _ in range(N+1)]
visited = [-1]*(N+1)
for _ in range(N-1):
    a,b = map(int,input().split())
    arr[a].append(b)
    arr[b].append(a)
dfs(R)
for _ in range(Q):
    U = int(input())
    print(visited[U])