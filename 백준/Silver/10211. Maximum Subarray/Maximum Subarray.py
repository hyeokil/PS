import sys
input = sys.stdin.readline

T = int(input())
for _ in range(T):
    N =int(input())
    lst = list(map(int,input().split()))
    prefix = [0]
    ans = -float('inf')
    for i in lst:
        prefix.append(prefix[-1]+i)
    for i in range(N):
        for j in range(i+1,N+1):
            if prefix[j]-prefix[i] > ans :
                ans = prefix[j]-prefix[i]

    print(ans)
