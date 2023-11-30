def Main():
    N, S = map(int,input().split())
    lst = list(map(int,input().split()))
    sum_lst = [0]
    ans = float('inf')
    s,e=0,1
    for i in range(N):
        sum_lst.append(sum_lst[-1]+lst[i])
    while s < N and e < N+1 :
        V = sum_lst[e] - sum_lst[s]
        if V >= S:
            tmp = e-s
            s += 1
            if ans > tmp:
                ans = tmp
        else:
            e += 1
    if ans == float('inf'):
        print(0)
    else:
        print(ans)
Main()