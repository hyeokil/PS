def Main():
    N,M = map(int,input().split())
    arr = [list(input()) for i in range(N)]
    se = set()
    for i in range(N):
        res1= ''
        for j in range(M):
            if arr[i][j] == '#':
                if len(res1) >1:
                    se.add(res1)
                res1 = ''
            else:
                res1+=arr[i][j]
            if j==M-1 and len(res1)>1:
                se.add(res1)

    for i in range(M):
        res2=''
        for j in range(N):
            if arr[j][i]=='#':
                if len(res2) >1:
                    se.add(res2)
                res2 = ''
            else:
                res2+=arr[j][i]
            if j==N-1 and len(res2)>1:
                se.add(res2)
    lst = sorted(list(se))
    print(lst[0])
Main()