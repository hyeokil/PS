def gcd(x,y):
    if y==0:
        return x
    return gcd(y,x%y)

N = int(input())
for _ in range(N):
    a,b = map(int,input().split())
    print(a*b//gcd(a,b))