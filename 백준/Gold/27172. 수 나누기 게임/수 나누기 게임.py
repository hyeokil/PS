import sys
input = sys.stdin.readline

def f(a):
    cnt = 0
    if a==1:
        return 0
    for j in range(1,int(a**0.5)+1):
        if a%j==0 :
            if check[j][0]:
                check[j][1]+=1
                cnt+=1
            if j!=1 and j*j !=a and check[a//j][0]:
                check[a//j][1]+=1
                cnt+=1
    return cnt

N = int(input())
arr = list(map(int, input().split()))
check = [[False,0] for _ in range(max(arr)+1)]
for i in arr:
    check[i][0]=True
for i in range(N):
    check[arr[i]][1]-=f(arr[i])
for i in range(N):
    if i==N-1:
        print(check[arr[i]][1],end="")
    else:
        print(check[arr[i]][1],end=" ")