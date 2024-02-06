import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lstA = list(map(int, input().split()))
    lstB = list(map(int, input().split()))
    lst = [[0,0]for _ in range(N)]
    for i in range(N):
        lst[i][0] = lstB[i]
        lst[i][1] = lstA[i]
    lst.sort()
    tmp = lst[0][0]
    rest = lst[0][1]
    ans = 0
    for i in range(N):
        if tmp > lst[i][1]:
            res = (tmp - lst[i][1]) // 30
            if (tmp - lst[i][1]) % 30:res += 1
            lst[i][1] += res * 30
            ans += res
        rest=max(rest,lst[i][1])
        if i+1<N and lst[i][0] != lst[i+1][0]:
            tmp = max(rest,lst[i+1][0])
    print(ans)
Main()