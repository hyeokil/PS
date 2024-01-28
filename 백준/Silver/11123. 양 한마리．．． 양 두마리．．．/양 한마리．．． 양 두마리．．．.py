from collections import deque

def Main():
    for tc in range(int(input())):
        N,M = map(int,input().split())
        arr = [list(input()) for _ in range(N)]
        ans = 0
        for i in range(N):
            for j in range(M):
                if arr[i][j] == '#':
                    ans+=1
                    q = deque()
                    q.append((i, j))
                    arr[i][j] = '.'
                    while q:
                        x,y = q.popleft()
                        for dx,dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
                            nx,ny = x+dx, y+dy
                            if 0 <= nx < N and 0 <= ny < M and arr[nx][ny] =='#':
                                arr[nx][ny] = '.'
                                q.append((nx, ny))
        print(ans)
Main()