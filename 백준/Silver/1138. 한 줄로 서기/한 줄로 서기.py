N = int(input())
lst = list(map(int,input().split()))
ans = [float("inf")]*(N+1)
for i in range(1,N+1):
    v = lst[i-1]
    for j in range(1,N+1):
        if v==0 and ans[j]==float("inf"):
            ans[j] = i
            break
        elif ans[j] > i:
            v-=1
print(*ans[1:])