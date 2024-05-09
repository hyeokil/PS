import sys
input = sys.stdin.readline

N = int(input())
lst = list(set([input().rstrip() for _ in range(N)]))
lst.sort()
ans =1
for i in range(len(lst)-1):
    if lst[i]!=lst[i+1][:len(lst[i])]:
        ans+=1
print(ans)