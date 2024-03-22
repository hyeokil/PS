import sys
input = sys.stdin.readline


N = int(input())
L = [int(input()) for _ in range(N)]
now = L[-1]
ans = 1
for i in range(N-2,-1,-1):
    if now <L[i]:
        ans+=1
        now = L[i]
print(ans)