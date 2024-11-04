import sys
from collections import deque
input = sys.stdin.readline

def bfs(a,b):
    visited = [[0]*N for _ in range(N)]
    q=deque([(a,b)])
    visited[a][b] = 1
    tmp = []
    while q:
        x,y = q.popleft()
        if space[x][y]!=0 and space[x][y] < size:
            tmp.append((visited[x][y]-1,x,y))
        for dx,dy in [(-1,0),(0,-1),(0,1),(1,0)]:
            nx,ny = x+dx,y+dy
            if nx<0 or ny<0 or nx>=N or ny>=N or visited[nx][ny]!=0 or space[nx][ny]>size: continue
            visited[nx][ny] = visited[x][y]+1
            q.append((nx,ny))
    tmp.sort()
    if tmp:
        return (tmp[0][1],tmp[0][2],tmp[0][0])
    else:
        return (-1,-1,-1)

def Main():
    global N,space,size
    N = int(input())
    space = [list(map(int,input().split())) for _ in range(N)]
    ans = 0
    sx,sy=0,0
    lst = [0]*7
    for i in range(N):
        for j in range(N):
            if space[i][j] ==0: continue
            if space[i][j] == 9:sx,sy=i,j
            else:lst[space[i][j]]+=1
    size,eat,can= 2,0,lst[1]
    while can>0:
        space[sx][sy] = 0
        sx,sy,res = bfs(sx,sy)
        if sx==-1:break
        can-=1
        eat+=1
        if eat==size:
            size+=1
            eat=0
            if size<8:
                can+=lst[size-1]
        ans+=res
    print(ans)
Main()