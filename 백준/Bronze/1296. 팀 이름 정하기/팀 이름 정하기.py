S = input()
N = int(input())
lst = [input() for _ in range(N)]
lst.sort()
mx = -1
ans =""
for i in range(N):
    res = {"L":0,"O":0,"V":0,"E":0}
    for j in ("L","O","V","E"):
        res[j]=(S+lst[i]).count(j)
    x = ((res["L"]+res["O"])*(res["L"]+res["V"])*(res["L"]+res["E"])*(res["O"]+res["V"])*(res["O"]+res["E"])*(res["V"]+res["E"]))%100
    if mx < x:
        mx = x
        ans = lst[i]
print(ans)

