N,M= map(int, input().split())
lst = [i for i in range(1,N+1)]
bit = [0]*(N+1)
def partial(x,k):
    if k == M :
        result = []
        for i in range(1,N+1):
            if bit[i] == 1:
                result.append(i)
        print(*result)
        return
    if x == N+1:
        return
    bit[x] = 1
    partial(x+1,k+1)
    bit[x]= 0
    partial(x+1,k)
partial(1,0)