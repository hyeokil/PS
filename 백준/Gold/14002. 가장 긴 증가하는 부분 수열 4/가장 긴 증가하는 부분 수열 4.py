import sys
input = sys.stdin.readline

N = int(input())
lst = [0]+list(map(int, input().split()))
dp = [0]*(N+1)
for i in range(N+1):
    for j in range(i+1,N+1):
        if lst[i] < lst[j]:
            dp[j] = max(dp[j],dp[i]+1)
tmp = max(dp)
ans = []
for i in range(N,-1,-1):
    if tmp == 0:
        break
    if tmp == dp[i]:
        ans.append(lst[i])
        tmp-=1
ans.reverse()
print(max(dp))
print(*ans)