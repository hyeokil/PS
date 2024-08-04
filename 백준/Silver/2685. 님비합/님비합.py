import sys
input = sys.stdin.readline
def f(B,X):
    res = []
    while X:
        res.append(X%B)
        X//=B
    return res
def nimBsum(B,X,Y):
    if X>Y:
        X,Y=Y,X
    x = f(B,X)
    y = f(B,Y)
    for i in range(len(x)):
        y[i] = (x[i]+y[i])%B
    res=0
    b=1
    for i in range(len(y)):
        res+=y[i]*b
        b*=B
    return res
for i in range(int(input())):
    B,X,Y = map(int,input().split())
    print(nimBsum(B,X,Y))
