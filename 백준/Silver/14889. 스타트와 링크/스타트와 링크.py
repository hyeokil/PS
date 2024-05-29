import sys
input = sys.stdin.readline
def f(i,k):
    global ans
    if i==N:
        return
    if k==N//2:
        res = 0
        for j in range(N):
            if visited[j]:
                for k in range(j+1,N):
                    if visited[k]:
                        res += arr[j][k]+arr[k][j]
        for j in range(N):
            if not visited[j]:
                for k in range(j+1,N):
                    if not visited[k]:
                        res -= (arr[j][k]+arr[k][j])
        ans =min(ans,abs(res))

        return
    visited[i] = True
    f(i+1,k+1)
    visited[i] = False
    f(i+1,k)
N = int(input())
arr = [list(map(int,input().split()))for _ in range(N)]
visited = [False for i in range(N)]
ans = float('inf')
f(0,0)
print(ans)