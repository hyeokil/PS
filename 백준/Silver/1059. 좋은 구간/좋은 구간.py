import sys
input = sys.stdin.readline


L = int(input())
lst = list(map(int, input().split()))
N=int(input())
lst.sort()
ans = 0
for i in range(L):
    if lst[i] > N:
        if i==0:
            ans += (lst[i]-N)*N-1
        else:
            ans += (lst[i]-N)*(N-lst[i-1])-1
        break
    elif lst[i]==N:
        break
print(ans)