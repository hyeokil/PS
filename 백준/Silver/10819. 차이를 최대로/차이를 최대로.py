def f(i):
    global ans
    if i==N:
        tmp =0
        for k in range(1,N):
            tmp += abs(res[k-1]-res[k])
        ans = max(ans,tmp)
    for j in range(N):
        if visited[j]:
            continue
        res[i] = lst[j]
        visited[j] = True
        f(i+1)
        visited[j] = False


N = int(input())
lst = list(map(int, input().split()))
visited = [False]*N
res = [0]*N
ans = 0
f(0)
print(ans)