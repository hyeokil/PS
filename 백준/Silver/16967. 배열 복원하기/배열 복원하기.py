H,W,X,Y=map(int,input().split())
arr = [list(map(int,input().split())) for i in range(H+X)]
for i in range(H):
    for j in range(W):
        if i>=X and j>=Y:
            arr[i][j] -= arr[i-X][j-Y]
            print(arr[i][j],end="")
        else:
            print(arr[i][j],end="")
        if j==W-1:
            print(sep="\n")
        else:
            print(end=" ")