import sys
input = sys.stdin.readline
from collections import deque

N,M,L = map(int,input().split())
ans=0
q =deque([i for i in range(1,N+1)])
visited = [0]*(N+1)
while True:
    visited[q[0]]+=1
    now = visited[q[0]]
    if now == M:
        break
    ans+=1
    if now%2==1:
        for _ in range(L):
            a = q.popleft()
            q.append(a)
    else:
        for _ in range(L):
            a= q.pop()
            q.appendleft(a)
print(ans)