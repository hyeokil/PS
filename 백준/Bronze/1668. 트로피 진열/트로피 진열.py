def f(arr):
    res=1
    tmp=arr[0]
    for i in range(1,N):
        if arr[i] > tmp:
            res+=1
            tmp=arr[i]
    return res

N=int(input())
lst = [int(input()) for _ in range(N)]
print(f(lst))
lst.reverse()
print(f(lst))