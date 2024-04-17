import sys
from collections import deque
input = sys.stdin.readline
N,K = map(int, input().split())
q = deque()
q.append((N,0))
visited = [False]*100001
while q:
    x,y = q.popleft()
    if x == K :
        print(y)
        break
    for i in (x-1, x+1, 2*x):
        if 0<=i<=100000 and visited[i] == False:
            q.append((i,y+1))
            visited[i] = True


