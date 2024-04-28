import sys,math
input = sys.stdin.readline


Ax,Ay,Bx,By,Cx,Cy = map(int,input().split())
big = 0
small = float('inf')
ans = 0
if (Ay-By)*(Ax-Cx)== (Ay-Cy)*(Ax-Bx) :
    print(-1.0)
else:
    A=(((Ax-Bx)**2+(Ay-By)**2)**0.5)*2+(((Ax-Cx)**2+(Ay-Cy)**2)**0.5)*2
    B=(((Bx-Ax)**2+(By-Ay)**2)**0.5)*2+(((Bx-Cx)**2+(By-Cy)**2)**0.5)*2
    C=(((Cx-Bx)**2+(Cy-By)**2)**0.5)*2+(((Cx-Ax)**2+(Cy-Ay)**2)**0.5)*2
    big=max(A,B,C)
    small=min(A,B,C)
    print(big-small)