N = int(input())
arr= [[0]*10 for _ in range(N)]

for i in range(N):
    for j in range(10):
        if i==0 and j!=0:
            arr[i][j]=1
        elif i!=0:
            if j-1>=0:
                arr[i][j]+=arr[i-1][j-1]
            if j+1<10:
                arr[i][j] += arr[i - 1][j + 1]
print(sum(arr[N-1])%1000000000)