def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    res = float('inf')
    ans =0
    isDone = False
    for i in range(N-2):
        if isDone:
            break
        now = lst[i]
        s,e=i+1,N-1
        while s<e:
            V = now + lst[s] + lst[e]
            if abs(V) < res:
                res = abs(V)
                ans = [now, lst[s], lst[e]]
            if V == 0 :
                ans = [now, lst[s], lst[e]]
                isDone =True
                break
            elif V < 0:
                s+=1
            else:
                e-=1
    ans.sort()
    print(*ans)
Main()