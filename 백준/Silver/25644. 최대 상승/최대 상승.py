import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int,input().split()))
ans = 0
tmp = lst[0]
for i in lst:
    tmp = min(tmp,i)
    ans = max(i-tmp,ans)
print(ans)