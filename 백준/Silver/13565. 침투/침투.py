import sys
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
arr = [list(input().rstrip()) for _ in range(N)]
flag = False
for i in range(M):
    if flag: break
    if arr[0][i] == "0":
        q = deque()
        q.append((0, i))
        arr[0][i] = "1"
        while q:
            x, y = q.popleft()
            if x == N - 1:
                flag = True
                break
            for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                nx=x+dx
                ny=y+dy
                if 0 <= nx < N and 0 <= ny<M and arr[nx][ny] == "0":
                    arr[nx][ny] = "1"
                    q.append((nx,ny))
if flag:
    print("YES")
else:
    print("NO")
