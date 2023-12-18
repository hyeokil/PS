import sys
input = sys.stdin.readline
from collections import deque
def Main():
    N= int(input())
    K= int(input())
    board = [[False]*N for _ in range(N)]
    for k in range(K):
        a,b = map(int,input().split())
        board[a-1][b-1] = True
    L = int(input())
    lst = []
    for l in range(L):
        T,C = input().split()
        lst.append((int(T),C))
    q = deque()
    q.append((0,0))
    d = deque([(0,1),(1,0),(0,-1),(-1,0)])
    ans =0
    idx = 0
    while q:
        x,y = q[0]
        dx,dy = d[0]
        nx,ny = dx+x,dy+y
        ans += 1
        if 0>nx or 0>ny or N<=nx or N<=ny :
            break
        if (nx,ny) in q :
            break
        q.appendleft((nx,ny))
        if board[nx][ny] :
            board[nx][ny] = False
        else:
            q.pop()
        if idx <L and ans == lst[idx][0]:
            if lst[idx][1] == 'D':
                ax,ay = d.popleft()
                d.append((ax,ay))
            else:
                ax, ay = d.pop()
                d.appendleft((ax, ay))
            idx+=1
    print(ans)
Main()