from collections import deque
N = int(input())
L = list(map(int,input().split()))
q =deque()
for i in range(N):
    q.append([i,L[i]])
cnt = 0
ans = [0]*N
while q:
    k,v = q.popleft()
    cnt+=1
    if v>1:
        q.append([k,v-1])
    else:
        ans[k] = cnt
print(*ans)