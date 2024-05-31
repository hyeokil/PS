def f(a):
    res = 0
    tmp = 1
    for i in range(1,8):
        if a[i]!=a[i-1]:
            res = max(res,tmp)
            tmp = 1
        else:
            tmp +=1
            if i==7:
                res = max(res,tmp)
    return res
for _ in range(3):
    A = input()
    print(f(A))
