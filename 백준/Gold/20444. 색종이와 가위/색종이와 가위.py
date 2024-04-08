N,K = map(int,input().split())
s = 0
e = N//2
while s<=e:
    x = (s+e)//2
    y = N-x
    cnt = (x+1)*(y+1)
    if K==cnt:
        print("YES")
        break
    elif K<cnt:
        e=x-1
    else:
        s=x+1
else:
    print("NO")