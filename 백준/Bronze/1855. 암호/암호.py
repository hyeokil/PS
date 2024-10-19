import sys
input = sys.stdin.readline

N = int(input())
S = input().rstrip()
arr =[[0]*N for i in range(len(S)//N)]
idx = 0
for i in range(len(S)//N):
    if i%2==0:
        for j in range(N):
            arr[i][j] = S[idx]
            idx += 1
    else:
        for j in range(N-1,-1,-1):
            arr[i][j] = S[idx]
            idx += 1

ans = ""
for i in range(N):
    for j in range(len(S)//N):
        ans+=arr[j][i]
print(ans)




