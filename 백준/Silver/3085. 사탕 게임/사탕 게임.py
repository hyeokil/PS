def f(lst):
    global ans
    for i in range(N):
        resA = 1
        resB = 1
        for j in range(1, N):
            if arr[i][j - 1] == arr[i][j]:
                resA += 1
            else:
                ans = max(ans, resA)
                resA = 1
            if arr[j - 1][i] == arr[j][i]:
                resB += 1
            else:
                ans = max(ans, resB)
                resB = 1
        ans = max(ans, resA, resB)


N = int(input())
arr= [list(input()) for _ in range(N)]
ans = 0
for i in range(N):
    resA = 1
    resB = 1
    for j in range(1,N):
        if arr[i][j-1] == arr[i][j]:
            resA += 1
        else:
            ans = max(ans,resA)
            resA = 1
        if arr[j-1][i] == arr[j][i]:
            resB+=1
        else:
            ans = max(ans,resB)
            resB=1
    ans = max(ans, resA,resB)
for i in range(N):
    for j in range(N):
        if i+1<N:
            arr[i][j],arr[i+1][j] =arr[i+1][j],arr[i][j]
            f(arr)
            arr[i][j], arr[i + 1][j] = arr[i + 1][j], arr[i][j]
        if j+1<N:
            arr[i][j],arr[i][j+1]=arr[i][j+1], arr[i][j]
            f(arr)
            arr[i][j], arr[i][j + 1] = arr[i][j + 1], arr[i][j]
print(ans)
