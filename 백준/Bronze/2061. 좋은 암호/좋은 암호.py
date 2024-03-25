N,K = map(int,input().split())
flag = False
ans = 0
for i in range(2,K):
    if N%i==0:
        flag=True
        ans = i
        break
if flag :print("BAD",ans)
else:print("GOOD")