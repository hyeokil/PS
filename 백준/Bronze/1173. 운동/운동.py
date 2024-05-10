import sys
input = sys.stdin.readline

N,m,M,T,R = map(int,input().split())
v = m
n=0
res = 0
while True:
    res+=1
    if v+T <= M:
        v+=T
        n+=1
        if n==N:
            break
    else:
        if v==m:
            res = -1
            break
        v=max(v-R,m)
print(res)