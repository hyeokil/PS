def Main():
    N,L = map(int,input().split())
    lst = list(map(int,input().split()))
    lst.sort()
    for i in range(N):
        if L>=lst[i]:L+=1
        else:break
    print(L)
Main()