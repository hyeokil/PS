N,R,C = map(int,input().split())
def f(r,c):
    if r==0 and c==0:
        return 0
    add = (2*(r%2))+(c%2)
    return 4*f(r//2,c//2)+add
print(f(R,C))