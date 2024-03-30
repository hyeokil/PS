N = int(input())
ans = 0
while True:
    if N==1:
        break
    if N%2==0:
        N//=2
    else:
        N+=1
    ans+=1
print(ans)