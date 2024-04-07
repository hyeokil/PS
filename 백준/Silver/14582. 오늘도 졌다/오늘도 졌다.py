L1 = list(map(int, input().split()))
L2 = list(map(int, input().split()))
A,B=0,0
flag = False
for i in range(9):
    A+=L1[i]
    if A > B:
        flag = True
        break
    B+=L2[i]
if flag :
    print("Yes")
else:
    print("No")