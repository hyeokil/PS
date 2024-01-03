T = int(input())
for _ in range(T):
    K,N = map(int, input().split())
    n = 1
    k = 1
    for i in range(1,K+1):
        n*=N
        N-=1
        k*=i
    print(n//k)