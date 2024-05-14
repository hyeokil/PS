import sys
input = sys.stdin.readline

N,X = map(int,input().split())
lst = list(map(int,input().split()))
prefix = [0]
for i in lst:
    prefix.append(prefix[-1]+i)
ans = 0
cnt = 0
for i in range(X,N+1):
    if ans <prefix[i]-prefix[i-X]:
        cnt = 1
        ans = prefix[i]-prefix[i-X]
    elif ans== prefix[i]-prefix[i-X]:
        cnt+=1
if ans==0:
    print("SAD")
else:
    print(ans)
    print(cnt)

