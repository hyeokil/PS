R,C,ZR,ZC = map(int,input().split())
arr =[input() for _ in range(R)]
ans = [""for _ in range(R*ZR)]
for i in range(R):
    for j in range(C):
        for k in range(ZR):
            for l in range(ZC):
                ans[i*ZR+k] += arr[i][j]
for i in ans:
    print(i)
