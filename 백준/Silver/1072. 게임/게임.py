import sys
input = sys.stdin.readline

def Main():
    X,Y=map(int,input().split())
    Z = Y*100//X
    s,e=0,10**9
    while s<=e:
        mid = (s+e)//2
        if (((Y+mid)*100)//(X+mid))==Z:
            s=mid+1
        else:
            e=mid-1
    if e==10**9:
        print(-1)
    else:
        print(s)

Main()
