import sys
input = sys.stdin.readline

def f(x,y,cnt,apple):
    global ans
    if ans>0:
        return
    if cnt > 3:
        return
    if apple >=2:
        ans=1
        return
    for dx,dy in [(1,0),(-1,0),(0,1),(0,-1)]:
        nx,ny = x+dx,y+dy
        if 0<=nx<5 and 0<=ny<5 and arr[nx][ny]!= -1:
            if arr[nx][ny]==1:
                arr[nx][ny] = -1
                f(nx,ny,cnt+1,apple+1)
                arr[nx][ny] = 1
            else:
                arr[nx][ny] = -1
                f(nx,ny,cnt+1,apple)
                arr[nx][ny] = 0

arr = [list(map(int,input().split())) for _ in range(5)]
s1,s2=map(int,input().split())
ans = 0
arr[s1][s2]=-1
f(s1,s2,0,0)
print(ans)

