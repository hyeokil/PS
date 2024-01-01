def Main():
    N,M = map(int,input().split())
    lst = list(map(int,input().split()))
    s,e = 0,max(lst)
    ans = 0
    while s<e:
        mid = (s+e)//2
        res = 0
        for i in lst:
            if i >= mid :
                res += i-mid
        if res == M :
           ans = mid
           break
        elif res< M :
            e = mid
        else:
            if ans <mid :
                ans = mid
            s = mid+1
    print(ans)
Main()