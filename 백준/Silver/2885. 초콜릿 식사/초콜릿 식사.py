import sys
input = sys.stdin.readline

K = int(input())
N = 1
while N<K:
    N<<=1
ans = N
cnt = 0
while K>0:
    if K>=N:
        K-=N
    else:
        N//=2
        cnt+=1
print(ans,cnt)