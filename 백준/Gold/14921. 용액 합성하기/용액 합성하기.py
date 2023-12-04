def Main():
    N= int(input())
    lst = list(map(int, input().split()))
    s,e=0,N-1
    ans = float('inf')
    while s<e :
        V = lst[s]+lst[e]
        if abs(V) < abs(ans) :
            ans = V
        if V == 0 :
            ans = 0
            break
        elif V < 0:
            s+=1
        else:
            e-=1
    print(ans)
Main()