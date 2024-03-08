import sys
input = sys.stdin.readline

n, k = list(map(int, input().rstrip().split()))
s = list(map(int, input().rstrip().split()))

odd = 0
end = 0
res = 0
tmp = 0

for start in range(n):
    while (odd <= k) and (end < n):
        if s[end] % 2:
            odd += 1
        else:
            tmp += 1
        if (start == 0) and (end == n):
            res = tmp
            break
        end += 1
    res = max(res, tmp)
    if s[start] % 2:
        odd -= 1
    else:
        tmp -= 1

print(res)