def f(k,curS):
    if k==N:
        print(curS)
        return
    for i in range(1,N+1):
        if visited[i]:continue
        visited[i]=True
        if k+1==N:f(k+1,curS+str(i))
        else:f(k+1,curS+str(i)+" ")
        visited[i]=False
N = int(input())
visited = [False]*(N+1)
f(0,"")