def Main():
    S = input()
    ans = 0
    res = 0
    for i in range(len(S)):
        if S[i] == '(':
            res+=1
        else:
            if S[i-1]=='(':
                res-=1
                ans+=res
            else:
                res-=1
                ans+=1
    print(ans)
Main()