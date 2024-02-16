def Main():
    N=int(input())
    M=int(input())
    lst =list(map(int,input().split()))
    ans = max(lst[0],N-lst[M-1])
    for i in range(1,M):
        ans = max(ans,(lst[i]-lst[i-1]+1)//2)
    print(ans)
Main()