N = int(input())
lst = list(map(int, input().split()))
ans = 0
tmp = 0
for i in range(N-1):
    if lst[i] < lst[i+1]:
        tmp += lst[i+1]-lst[i]
    else:
        if ans < tmp :
            ans = tmp
        tmp = 0
if ans < tmp :
    ans = tmp
print(ans)

