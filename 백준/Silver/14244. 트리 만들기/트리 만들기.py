import sys
input = sys.stdin.readline

N,M = map(int,input().split())
tmp = 1
for i in range(1,N):
    if i <=M:
        print(0,i)
    else:
        print(tmp,i)
        tmp = i

