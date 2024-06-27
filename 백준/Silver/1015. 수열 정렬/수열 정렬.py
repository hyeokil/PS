N = int(input())
lst1 = list(map(int,input().split()))
lst2= sorted([*lst1])
ans = [-1]*N
for i in range(N):
    for j in range(N):
        if lst2[i]==lst1[j] and ans[j] == -1:
            ans[j]=i
            break
print(*ans)
