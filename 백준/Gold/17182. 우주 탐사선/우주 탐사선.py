import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)
def f(i,k,curV):
    global ans
    if curV >=ans:
        return
    if k==N:
        ans = min(ans,curV)
        return
    for j in range(N):
        if not visited[j]:
            visited[j] = True
            f(j,k+1,curV+arr[i][j])
            visited[j] = False

N,K = map(int,input().split())
arr = [list(map(int,input().split())) for _ in range(N)]
for k in range(N):
    for i in range(N):
        for j in range(N):
            arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j])
visited = [False]*N
visited[K]= True
ans = float('inf')
f(K,1,0)
print(ans)