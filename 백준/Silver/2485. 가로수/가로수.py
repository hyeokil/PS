import sys
input = sys.stdin.readline

def gcd(a,b):
    while b > 0 :
        a,b = b,a%b
    return a
N = int(input())
lst = []
tmp = int(input())
for i in range(N-1):
    n = int(input())
    lst.append(n-tmp)
    tmp = n
res = lst[0]
for i in range(1,N-1):
    res = gcd(res,lst[i])
ans = 0
for i in range(N-1):
    ans += lst[i]//res-1
print(ans)