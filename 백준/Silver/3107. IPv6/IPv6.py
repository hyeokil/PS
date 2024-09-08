lst = list(input().split(":"))
tmp = 8
ans =""
for i in lst:
    if i!="":
        tmp-=1
flag = False
for i in lst:
    if i=="":
        if not flag:
            flag = True
            for j in range(tmp):
                ans+="0000:"
        continue
    for j in range(4-len(i)):
        ans+="0"
    ans+=i+":"
print(ans[:len(ans)-1])

