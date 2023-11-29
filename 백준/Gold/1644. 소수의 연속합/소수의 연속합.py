def Main():
    N = int(input())
    check = [False]+[True]*N
    check[1] = False
    for i in range(N+1):
        if check[i] == True:
            for j in range(i*2,N+1,i):
                check[j] = False
    sum_lst = [0]
    for i in range(N+1):
        if check[i] == True:
            sum_lst.append(sum_lst[-1]+i)
    s,e = 0,1
    ans = 0
    while s< len(sum_lst)-1 and e < len(sum_lst) :
        V =sum_lst[e]-sum_lst[s]
        if V == N:
            ans += 1
            e+= 1
        elif V < N :
            e+=1
        else:
            s+=1
    print(ans)
Main()