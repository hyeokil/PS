import sys
input = sys.stdin.readline

def f(n,x,y):
    global ansM,ans0,ansP
    flag = True
    for i in range(n):
        if not flag : break
        for j in range(n):
            if arr[x+i][y+j] != arr[x][y]:
                flag = False
                break
    if flag :
        if arr[x][y] == -1:
            ansM+=1
        elif arr[x][y] == 0:
            ans0+=1
        elif arr[x][y] == 1:
            ansP+=1
    if n== 1:
        return
    if not flag:
        for i in range(3):
            nx = x+i*(n//3)
            for j in range(3):
                ny =y+ j*(n//3)
                f(n//3,nx,ny)


global ansM,ans0,ansP,arr
N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]
ansM = 0
ans0 = 0
ansP = 0
f(N,0,0)
print(ansM)
print(ans0)
print(ansP)
