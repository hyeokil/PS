def f(k,curV):
    global ans
    if curV<500:
        return
    if k==N:
        ans+=1
        return
    for i in range(N):
        if not visited[i]:
            visited[i]=True
            f(k+1,curV+L[i]-K)
            visited[i]=False



N,K = map(int,input().split())
L = list(map(int,input().split()))
visited=[False]*N
ans =0
f(0,500)
print(ans)