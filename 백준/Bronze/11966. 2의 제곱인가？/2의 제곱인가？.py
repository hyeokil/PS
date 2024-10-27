N = int(input())
ans = 0
for i in range(31):
    if 2**i == N:
        ans = 1
        break
    if N < 2**i:
        break
print(ans)