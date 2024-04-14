import sys


def Main():
    input = sys.stdin.readline
    N = int(input())
    *arr, = map(int, input().split())
    mx= max(arr)+1
    check = [False]*mx
    res = [0]*mx
    for i in arr:
        check[i]=True
    for a in arr:
        for i in range(a*2,mx,a):
            if check[i]:
                res[a]+=1
                res[i]-=1
    for i in range(N):
        if i==N-1:
            print(res[arr[i]],end="")
        else:
            print(res[arr[i]],end=" ")
Main()
