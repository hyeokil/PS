import sys
input = sys.stdin.readline


N = int(input())
ans = list(input().rstrip())
L = len(ans)
for i in range(1,N):
    S = input().rstrip()
    for j in range(L):
        if ans[j]!=S[j]:
            ans[j]="?"
print(''.join(ans))