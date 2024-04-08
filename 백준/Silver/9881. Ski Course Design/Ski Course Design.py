import sys
input = sys.stdin.readline

N=int(input())
hills=[0]*101
for i in range(N):
    hills[int(input())]+=1
ans =float('inf')
for i in range(84):
    tmp=0
    for j in range(i):
        if hills[j] >0:
            tmp+=hills[j]*(i-j)**2
    for j in range(i+17,101):
        if hills[j] >0:
            tmp+=hills[j]*(j-(i+17))**2
    ans= min(ans,tmp)
print(ans)
