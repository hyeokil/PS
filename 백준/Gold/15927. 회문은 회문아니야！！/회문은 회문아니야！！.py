def Main():
    S = input()
    L = len(S)
    if S == S[-1]*L:
        print(-1)
    elif S == S[::-1]:
        print(L-1)
    else:
        print(L)
Main()