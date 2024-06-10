import sys
input = sys.stdin.readline

N,M = map(int,input().split())
K = int(input())
now = M
ans = 0
for i in range(K):
    n = int(input())
    if now < n:
        ans += n-now
        now = n
    elif now-M >= n:
        ans += now-M+1-n
        now -= now-M+1-n
print(ans)