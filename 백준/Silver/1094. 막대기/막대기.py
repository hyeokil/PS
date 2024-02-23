N = int(input())
X= 64
ans=0
while N>0:
    ans+=N//X
    N%=X
    X//=2
print(ans)