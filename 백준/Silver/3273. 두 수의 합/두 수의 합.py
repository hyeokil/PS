def Main():
    N= int(input())
    lst = list(map(int, input().split()))
    M = int(input())
    lst.sort()
    s,e=0,N-1
    ans = 0
    while s<e :
        V = lst[s]+lst[e]
        if V == M :
            ans +=1
            s+=1
            e-=1
        elif V < M:
            s+=1
        else:
            e-=1
    print(ans)
Main()