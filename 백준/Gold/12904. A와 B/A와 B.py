def Main():
    S = list(input())
    T = list(input())
    flag = False
    while T :
        if T[-1] == 'A' :
            T.pop()
        else:
            T.pop()
            T.reverse()
        if T == S :
            flag = True
            break
    if flag :
        print(1)
    else:
        print(0)
Main()