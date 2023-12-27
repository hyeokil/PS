def Main():
    S1,S2 = input(),input()
    L1,L2 = len(S1),len(S2)
    lst = [0]*L2
    for i in range(L1):
        tmp = 0
        for j in range(L2):
            if tmp < lst[j]:
                tmp = lst[j]
            elif S1[i] == S2[j] :
                lst[j] = tmp + 1
    print(max(lst))
Main()