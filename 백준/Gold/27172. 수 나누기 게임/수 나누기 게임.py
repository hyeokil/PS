import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = list(map(int, input().split()))
    mx= max(arr)+1
    check = [[False,0] for _ in range(mx)]
    for i in arr:
        check[i][0]=True
    for a in arr:
        for i in range(a*2,mx,a):
            if check[i][0]:
                check[a][1]+=1
                check[i][1]-=1
    for i in range(N):
        if i==N-1:
            print(check[arr[i]][1],end="")
        else:
            print(check[arr[i]][1],end=" ")
Main()
