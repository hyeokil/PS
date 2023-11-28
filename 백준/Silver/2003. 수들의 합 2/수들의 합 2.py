import sys
input = sys.stdin.readline
def Main():
    N,M = map(int, input().split())
    lst = list(map(int, input().split()))
    lst_sum = [lst[0]]
    for i in range(1,N):
        lst_sum.append(lst_sum[i-1]+lst[i])
    lst_sum = [0]+lst_sum
    s,e = 0,1
    ans = 0
    while s < N and e <= N:
        v = lst_sum[e]-lst_sum[s]
        if v == M :
            ans += 1
            e+=1
        elif v < M :
            e+=1
        else:
            s+=1
    print(ans)
Main()