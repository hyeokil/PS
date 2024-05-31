N,L = map(int,input().split())
L = str(L)
ans = 0
while N>0:
    ans +=1
    if not L in set(str(ans)):
        N-=1
print(ans)
