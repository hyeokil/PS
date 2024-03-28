
flag = True
cal = "+"
ans =0
while True:
    if flag:
        if cal == "+":ans+=int(input())
        elif cal == "-":ans-=int(input())
        elif cal == "/":ans//=int(input())
        else:ans*=int(input())
        flag=False
    else:
        cal = input()
        flag=True
        if cal == "=":
            break
print(ans)