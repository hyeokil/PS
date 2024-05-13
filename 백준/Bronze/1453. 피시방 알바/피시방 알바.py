N = int(input())
lst = list(map(int,input().split()))
visited= [False]*101
ans = 0
for i in lst:
    if visited[i]:
        ans+=1
    else:
        visited[i] =True
print(ans)
