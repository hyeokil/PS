def Main():
    N = int(input())
    s,e=0,N
    while s<e:
        mid = (s+e)//2
        if mid**2 < N:
            s=mid+1
        else:e=mid
    print(e)
Main()