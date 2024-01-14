def Main():
    S= input()
    ans = ''
    res = ''
    L = len(S)
    for i in range(L) :
    
        if res and res[0] != '<':
            if S[i] == ' ':
                ans += res[::-1]+' '
                res = ''
                continue
        if S[i] == '<':
            ans += res[::-1]
            res = ''
        res += S[i]
        if S[i] == '>':
            ans += res
            res = ''
            continue
        if i == L-1:
            ans += res[::-1]
    print(ans)
Main()