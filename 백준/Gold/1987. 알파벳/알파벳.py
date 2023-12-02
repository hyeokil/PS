import sys
input = sys.stdin.readline

def Main():
    N,M = map(int, input().split())
    arr = [input() for _ in range(N)]
    q = set()
    q.add((0,0,1,arr[0][0]))
    ans = 1
    while q :
        x,y,cnt,se = q.pop()
        if ans < cnt:
            ans = cnt
        for dx,dy in [(1,0),(0,1),(-1,0),(0,-1)]:
            nx,ny = dx+x,dy+y
            if 0<=nx<N and 0<=ny<M and arr[nx][ny] not in se:
                q.add((nx,ny,cnt+1,se+arr[nx][ny]))
    print(ans)
Main()