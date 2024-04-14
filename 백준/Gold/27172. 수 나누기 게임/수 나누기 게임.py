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
    ans =""
    for i in range(N):
        if i==N-1:
            ans += str(res[arr[i]])
        else:
            ans += str(res[arr[i]])+" "
    print(ans)
Main()
