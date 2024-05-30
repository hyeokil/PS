N = int(input())
S = input()
AP = { "A":"000000","B":"001111","C":"010011","D":"011100","E":"100110",
       "F":"101001","G":"110101","H":"111010}"}
ans = ""
for i in range(N):
    now = ""
    for a in "ABCDEFGH":
        res = 0
        for j in range(6):
            if AP[a][j] != S[i*6+j]:
                res+=1
            if res >1:
                break
        if res <= 1:
            now = a
            break
    if now!="":
        ans += now
    else:
        print(i+1)
        break
else:
    print(ans)

