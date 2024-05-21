def f(k,curV):
    global ans
    if len(curV)>0 :
        if int(curV) > N:
            return
        else:
            ans = max(ans, int(curV))
    for i in range(K):
        f(k+1,curV+Ks[i])

N,K = map(int,input().split())
Ks = list(input().split())
ans = 0
f(0,"")
print(ans)


