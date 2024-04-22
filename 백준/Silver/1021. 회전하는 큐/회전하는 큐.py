import sys
from collections import deque
input = sys.stdin.readline

N,M = map(int,input().split())
lst = list(map(int,input().split()))
q = deque([i for i in range(1,N+1)])
ans = 0
for l in lst:
    for i in range(len(q)):
        if q[i]==l:
            if i<=len(q)//2:
                while True:
                    x = q.popleft()
                    if x == l:
                        break
                    q.append(x)
                    ans+=1
            else:
                while q[0] != l:
                    x = q.pop()
                    q.appendleft(x)
                    ans+=1
                q.popleft()
            break
print(ans)
