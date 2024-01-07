def f(n,s,m,e):
    if n == 1:
        print(s,e)
        return
    f(n-1,s,e,m)
    print(s,e)
    f(n-1,m,s,e)
N = int(input())
print(2**N-1)
f(N,1,2,3)