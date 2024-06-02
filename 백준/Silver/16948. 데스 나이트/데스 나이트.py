from collections import deque
N = int(input())
chess = [[float('inf')]*N for _ in range(N)]
ans = float('inf')
s1,s2,e1,e2=map(int,input().split())
q = deque()
q.append((s1,s2,0))
while q :
    x,y,cnt = q.popleft()
    if cnt > ans:
        continue
    if x == e1 and y==e2:
        ans = min(ans,cnt)
        continue
    if chess[x][y]<=cnt:
        continue
    chess[x][y]=cnt
    for dx,dy in ((-2,-1),(-2,1),(0,-2),(0,2),(2,-1),(2,1)):
        nx = x+dx
        ny = y+dy
        if 0<=nx<N and 0<=ny<N and chess[nx][ny]>cnt+1:
            q.append((nx,ny,cnt+1))
if ans !=float('inf'):print(ans)
else:print(-1)