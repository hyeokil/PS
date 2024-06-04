import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int, input().split()))
lst.sort()
ans = 0
for i in range(N):
    s=0
    e=N-1
    while s<=e:
        mid = (s+e)//2
        if lst[mid]*9>lst[i]*10:
            e=mid-1
        else:
            s=mid+1
    ans += (e-i)
print(ans)