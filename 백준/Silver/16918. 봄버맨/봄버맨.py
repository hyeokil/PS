R,C,N=map(int,input().split())
arr = [input() for _ in range(R)]
ans = [["O"]*C for _ in range(R)]
for i in range(R):
    for j in range(C):
        if arr[i][j] == "O":
            ans[i][j] = "."
            for di, dj in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                ni, nj = i + di, j + dj
                if 0 <= ni < R and 0 <= nj < C:
                    ans[ni][nj] = "."
if N==1:
    for i in arr:
        print(i)
elif N%2==0:
    for i in range(R):
        print("O"*C)
elif N%4==1:
    nans = [["O"] * C for _ in range(R)]
    for i in range(R):
        for j in range(C):
            if ans[i][j] == "O":
                nans[i][j] = "."
                for di, dj in ((1, 0), (-1, 0), (0, 1), (0, -1)):
                    ni, nj = i + di, j + dj
                    if 0 <= ni < R and 0 <= nj < C:
                        nans[ni][nj] = "."
    for i in nans:
        print("".join(i))
else:
    for i in ans:
        print("".join(i))
