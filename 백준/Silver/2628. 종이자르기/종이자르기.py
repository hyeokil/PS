X,Y, = map(int,input().split())
N = int(input())
XL = [0]
YL = [0]
for _ in range(N):
    a,b = map(int,input().split())
    if a==0:
        YL.append(b)
    else:
        XL.append(b)
XL.append(X)
YL.append(Y)
XL.sort()
YL.sort()
ans = 0
for i in range(1,len(XL)):
    for j in range(1,len(YL)):
        ans = max(ans,(XL[i]-XL[i-1])*(YL[j]-YL[j-1]))
print(ans)