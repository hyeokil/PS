N,M = map(int,input().split())
lst = list(map(int,input().split()))
lst.sort()
now =0
ans=0
for i in range(N):
    if now < lst[i]:
        now = lst[i]+M-1
        ans+=1
print(ans)
