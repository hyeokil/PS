def par(i,k,curS):
    if k==N :
        res =0
        for s in curS:
            if s in {'a','e','i','o','u'}:
                res += 1
        if 1<=res<=N-2 :
            print(curS)
        return
    if i==M:
        return
    par(i+1,k+1,curS+lst[i])
    par(i+1,k,curS)
N,M = map(int,input().split())
lst = input().split()
lst.sort()
par(0,0,'')