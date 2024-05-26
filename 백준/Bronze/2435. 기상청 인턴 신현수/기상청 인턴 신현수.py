import sys
input = sys.stdin.readline

N,K = map(int,input().split())
lst = list(map(int,input().split()))
prefix = [0]
ans = -float('inf')
for i in range(N):prefix.append(prefix[-1]+lst[i])
for i in range(K,N+1):ans = max(ans,prefix[i]-prefix[i-K])
print(ans)