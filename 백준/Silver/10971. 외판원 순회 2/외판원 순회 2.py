import sys
input = sys.stdin.readline
def f(i,k,curV,s):
    global ans
    if curV > ans:
        return
    if k==N:
        if arr[i][s] !=0:
            V = curV+arr[i][s]
            ans = min(ans,V)
        return
    for j in range(N):
        if not visited[j] and arr[i][j]!=0:
            visited[j] = True
            f(j,k+1,curV+arr[i][j],s)
            visited[j] = False

N = int(input())
arr = [list(map(int,input().split()))for _ in range(N)]
visited = [False for i in range(N)]
ans = float('inf')
for i in range(N):
    visited[i]=True
    f(i,1,0,i)
    visited[i] = False
print(ans)