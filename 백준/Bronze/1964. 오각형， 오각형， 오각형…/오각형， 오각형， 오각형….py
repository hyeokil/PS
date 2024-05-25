N = int(input())
ans = 1
for i in range(N):
    ans += (4+3*i)
print(ans%45678)