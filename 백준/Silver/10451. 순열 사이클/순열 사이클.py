import sys
input = sys.stdin.readline
def f(n,s):
    global ans
    visited[n] = True
    if lst[n]==s:
        ans +=1
        return
    f(lst[n],s)
for tc in range(int(input())):
    N = int(input())
    lst = [0]+list(map(int,input().split()))
    visited = [False for i in range(N+1)]
    ans = 0
    for i in range(1,N+1):
        if not visited[i]:
            f(i,i)
    print(ans)
