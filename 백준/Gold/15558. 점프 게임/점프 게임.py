import sys
input = sys.stdin.readline
from collections import deque

def Main():
    N,K = map(int,input().split())
    arr = [list(input()) for _ in range(2)]
    visited = [[False]*N for _ in range(2)]
    q = deque()
    q.append((0,0,0))
    flag = False
    while q:
        x,y,t = q.popleft()
        for nx,ny in [(abs(x-1),y+K),(x,y+1),(x,y-1)]:
            if ny >= N:
                flag = True
                break
            if t<ny<N and arr[nx][ny]=="1" and not visited[nx][ny]:
                q.append((nx,ny,t+1))
                visited[nx][ny] = True
    if flag:print(1)
    else:print(0)
Main()