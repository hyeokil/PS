import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int,input().split()))
ans = 0
for i in range(N):
    cnt = 0
    tmp = 0
    for j in range(i-1,-1,-1):
        gradient = (lst[i]-lst[j])/(i-j)
        if j==i-1 or tmp>gradient:
            cnt+=1
            tmp=gradient
    for j in range(i+1,N):
        gradient=(lst[j]-lst[i])/(j-i)
        if j==i+1 or tmp<gradient:
            cnt+=1
            tmp=gradient
    ans = max(ans,cnt)
print(ans)