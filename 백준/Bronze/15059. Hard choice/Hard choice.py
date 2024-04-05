def f(a,b):
    if a<b:
        return b-a
    else:
        return 0
A,B,C = map(int,input().split())
D,E,F = map(int,input().split())
print(f(A,D)+f(B,E)+f(C,F))