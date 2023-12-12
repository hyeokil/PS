from collections import deque
import sys
input = sys.stdin.readline
def Main():
    while True:
        W,H = map(int,input().split())
        if W == 0 and H == 0 :
            break
        arr = [list(map(int,input().split())) for _ in range(H)]
        ans = 0
        for i in range(H):
            for j in range(W):
                if arr[i][j] == 1 :
                    q = deque()
                    q.append((i,j))
                    arr[i][j] = 0
                    while q :
                        x,y = q.popleft()
                        for dx,dy in [(1,0),(-1,0),(0,1),(0,-1),(1,1),(1,-1),(-1,1),(-1,-1)]:
                            nx,ny = dx+x,dy+y
                            if 0<=nx<H and 0<=ny<W and arr[nx][ny] == 1:
                                arr[nx][ny] = 0
                                q.append((nx,ny))
                    ans += 1
        print(ans)
Main()