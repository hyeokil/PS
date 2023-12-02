# 수가 이미 나왔는지 확인 할 필요가 없었다,,
def Main():
    N = int(input())
    lst = list(map(int, input().split()))
    dp = [0]*(N+1)
    for i in lst:
        dp[i] = dp[i-1] +1
    print(N-max(dp))

Main()