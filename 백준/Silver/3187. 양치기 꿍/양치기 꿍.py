import sys
from collections import deque

input = sys.stdin.readline

def Main():
    N, M = map(int, input().split())
    arr = [list(input().rstrip()) for _ in range(N)]
    sheep = 0
    wolf = 0
    for i in range(N):
        for j in range(M):
            if arr[i][j] == "v" or arr[i][j] =="k":
                q = deque()
                q.append((i,j))
                s = 0
                w = 0
                if arr[i][j] == "v":
                    w+=1
                elif arr[i][j] == "k":
                    s+=1
                arr[i][j] = "#"
                while q:
                    x, y = q.popleft()
                    for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
                        nx=x+dx
                        ny=y+dy
                        if 0 <= nx < N and 0 <= ny<M and arr[nx][ny] != "#":
                            if arr[nx][ny] == "v":
                                w += 1
                            elif arr[nx][ny] == "k":
                                s += 1
                            arr[nx][ny] = "#"
                            q.append((nx,ny))
                if s>w:
                    sheep+=s
                else:
                    wolf+=w
    print(sheep,wolf)
Main()