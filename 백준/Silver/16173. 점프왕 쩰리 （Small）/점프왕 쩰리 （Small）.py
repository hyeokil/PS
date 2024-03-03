from collections import deque

N=int(input())
arr = [list(map(int,input().split())) for _ in range(N)]
q = deque()
q.append((0,0))
ans = "Hing"
while q:
    x,y = q.popleft()
    if arr[x][y] == -1:
        ans = "HaruHaru"
        break
    for dx,dy in [(1,0),(0,1)]:
        if arr[x][y]==0:
            continue
        nx = x+dx*arr[x][y]
        ny = y+dy*arr[x][y]
        if 0<=nx<N and 0<=ny<N:
            q.append((nx,ny))
print(ans)