import sys
input = sys.stdin.readline

def dfs(x):
    for y in arr[x]:
        if not visited[y]:
            visited[y]=True
            dfs(y)

N=int(input())
arr = [[] for _ in range(N+1)]
ans = [0] * (N+1)
for _ in range(N-1):
    a,b = map(int,input().split())
    arr[a].append(b)
visited =[False]*(N+1)
visited[1]=True
dfs(1)
for i in range(1,N+1):
    if visited[i]:
        ans[i]=True
for i in range(2,N+1):
    visited =[False]*(N+1)
    visited[i]=True
    dfs(i)
    for i in range(1, N + 1):
        if not visited[i] or not ans[i]:
            ans[i] = False
for i in range(1,N+1):
    if ans[i]:
        print(i)
        break
else:
    print(-1)