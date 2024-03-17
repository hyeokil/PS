N = int(input())
L = [input() for _ in range(N)]
ans = ""
tmp =0
for i in range(N):
    if L[i]=="KBS1":
        ans += "4"*i
        tmp = i
        break
    ans+="1"
for i in range(N):
    if L[i]=="KBS2":
        if tmp > i : ans+="14"
        ans +="4"*(i-1)
        break
    ans+="1"
print(ans)


