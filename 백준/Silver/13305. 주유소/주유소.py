def Main():
    N = int(input())
    way = list(map(int,input().split()))
    cost = list(map(int,input().split()))
    tmp = cost[0]
    cost = cost[1:]
    ans = 0
    for i in range(N-1):
        ans += tmp * way[i]
        if tmp > cost[i] :
            tmp = cost[i]
    print(ans)
Main()