board = input()
ans = ""
tmp = 0
for i in board:
    if i=="X":
        tmp+=1
    else:
        if tmp%2==1:
            ans = -1
            break
        elif tmp==2:
            ans+="BB"
            tmp=0
        ans+="."
    if tmp == 4:
        ans+="AAAA"
        tmp=0
if ans!=-1:
    if tmp==2:
        ans+="BB"
    if tmp%2==1:
        ans = -1
print(ans)

