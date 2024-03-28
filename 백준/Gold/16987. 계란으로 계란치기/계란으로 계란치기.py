def f(k,cnt):
    global ans
    ans = max(ans,cnt)
    if k==N:return
    s1=arr[k][0]
    if s1 <= 0 :
        f(k+1,cnt)
        return
    for i in range(N):
        if i==k:continue
        if arr[i][0]<=0:continue
        tmp=0
        s2=arr[i][0]
        arr[k][0]-=arr[i][1]
        arr[i][0]-=arr[k][1]
        if arr[k][0]<=0: tmp+=1
        if arr[i][0]<=0: tmp+=1
        f(k+1,cnt+tmp)
        arr[k][0] = s1
        arr[i][0] = s2

N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]
ans = 0
f(0,0)
print(ans)

