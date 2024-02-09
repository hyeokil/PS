lst = list(map(int,input().split()))
lst.sort()
S = input()
for s in S:
    if s == 'A':print(lst[0],end=' ')
    elif s=='B':print(lst[1],end=' ')
    else: print(lst[2], end=' ')