lst = list(input())
s = ''
lst1 = []

for i in range(len(lst)):
    if lst[i] not in '+-':
        if i == len(lst)-1:
            s+=lst[i]
            lst1.append(s)
        s+=lst[i]
    else:
        lst1.append(s)
        lst1.append(lst[i])
        s=''
for i in range(len(lst1)):
    if lst1[i] not in '+-':
        lst1[i] = int(lst1[i])
lst2 = []
while lst1 :
    for i in range(len(lst1)):
        if lst1[i] == '+':
            ss =lst2.pop()
            ss += lst1[i+1]
            lst2.append(ss)
            lst1.pop(0)
            lst1.pop(0)
            break
        else:
            lst2.append(lst1[i])
            lst1.pop(0)
            break
lst3 = []
while lst2 :
    for i in range(len(lst2)):
        if lst2[i] == '-':
            ss =lst3.pop()
            ss -= lst2[i+1]
            lst3.append(ss)
            lst2.pop(0)
            lst2.pop(0)
            break
        else:
            lst3.append(lst2[i])
            lst2.pop(0)
            break
print(*lst3)
