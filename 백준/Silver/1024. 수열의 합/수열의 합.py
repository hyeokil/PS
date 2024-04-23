import sys
input = sys.stdin.readline


N,M = map(int,input().split())
for i in range(M,101):
    x= N-(i*(i+1)//2)
    if x%i==0:
        res=x//i
        if res+1>=0:
            print(*(i for i in range(res+1,res+i+1)))
            break
else:
    print(-1)