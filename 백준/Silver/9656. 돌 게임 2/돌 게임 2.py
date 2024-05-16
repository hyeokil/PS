N = int(input())
if N//3%2==0:
    if N%3==1:print("CY")
    else:print("SK")
else:
    if N%3==1:print("SK")
    else:print("CY")