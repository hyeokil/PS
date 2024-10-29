import sys
input = sys.stdin.readline

def f(n,x,y):
    res = ""
    flag = True
    for i in range(n):
        if not flag : break
        for j in range(n):
            if arr[x+i][y+j] != arr[x][y]:
                flag = False
                break
    if flag: res+=arr[x][y]
    else:
        nn = n//2
        res+="("
        res+=f(nn,x,y)+f(nn,x,y+nn)+f(nn,x+nn,y)+f(nn,x+nn,y+nn)
        res+=")"
    return res


N = int(input())
arr = [list(input().rstrip()) for _ in range(N)]
ans = f(N,0,0)
print(ans)