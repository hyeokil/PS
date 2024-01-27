def f(x,y,S):
    if len(S)==6:
        se.add(S)
        return
    for dx,dy in [(-1,0),(0,-1),(1,0),(0,1)]:
        nx,ny=dx+x,dy+y
        if 0<=nx<5 and 0<=ny<5:
            f(nx,ny,S+str(arr[nx][ny]))

arr = [list(map(int,input().split())) for _ in range(5)]
se = set()
for i in range(5):
    for j in range(5):
        f(i,j,str(arr[i][j]))
print(len(se))