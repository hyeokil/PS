def f(k,i,curV):
    if k==M:
        if check[curV]:
            ans.add(curV)
        return
    if i==N:
        return
    f(k+1,i+1,curV+lst[i])
    f(k,i+1,curV)

N,M = map(int,input().split())
lst = list(map(int,input().split()))
S = sum(lst)
check = [True]*(S+1)
check[0],check[1] = False,False
for i in range(2,int(S**0.5)+1):
    if check[i]:
        for j in range(i+i,S+1,i):
            check[j]=False
ans = set()
f(0,0,0)
if len(ans)==0:
    print(-1)
else:
    ans=sorted(list(ans))
    print(*ans)