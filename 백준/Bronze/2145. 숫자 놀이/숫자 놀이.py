while True:
    S = input()
    if S == "0":
        break
    while len(S) >1:
        res = 0
        for s in S:
            res +=int(s)
        S = str(res)
    print(S)