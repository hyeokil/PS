import sys
input = sys.stdin.readline

N,M = map(int,input().split())
ans = -1
cnt = 0
while N>0 and M>0:
    if cnt%2 == 0:
        N-=1
    else:
        M-=1
    cnt+=1
    ans +=1
print(ans)




