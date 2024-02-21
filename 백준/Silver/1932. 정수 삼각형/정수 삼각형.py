def Main():
    N= int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    for i in range(1,N):
        for j in range(i+1):
            a,b=0,0
            if j==0 :a=arr[i-1][j]
            elif j==i:a=arr[i-1][j-1]
            else:
                a=arr[i-1][j-1]
                b=arr[i-1][j]
            arr[i][j] += max(a,b)
    print(max(arr[N-1]))
Main()