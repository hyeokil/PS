import sys
input = sys.stdin.readline

def Main():
    A,B,C,N = map(int,input().split())
    flag = False
    for a in range(0,N+1,A):
        if flag: break
        for b in range(0,N+1-a,B):
            if (N-b-a)%C==0 :
                flag = True
                break
    if flag:print(1)
    else:print(0)
Main()
