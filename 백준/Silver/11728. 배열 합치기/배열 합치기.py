def Main():
    N,M =map(int,input().split())
    lstA=list(map(int,input().split()))
    lstB=list(map(int,input().split()))
    lst = lstA+lstB
    lst.sort()
    print(*lst)
Main()