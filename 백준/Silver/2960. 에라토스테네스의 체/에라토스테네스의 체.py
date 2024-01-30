import sys

def Main():
    N,K = map(int,input().split())
    check = [False]*(N+1)
    for i in range(2,N+1):
        if not check[i]:
            for j in range(i,N+1,i):
                if check[j]:
                    continue
                check[j] = True
                K-=1
                if K == 0:
                    print(j)
                    sys.exit()
Main()