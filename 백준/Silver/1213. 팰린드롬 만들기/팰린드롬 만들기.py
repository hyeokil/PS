def Main():
    S = input()
    setS = list(set(S))
    setS.sort()
    cnt = []
    isPal = 0
    res = ''
    ans = ''
    for i in setS:
        cnt.append(S.count(i))
    for i in range(len(cnt)):
        if cnt[i]%2 == 1:
            isPal+=1
            res += setS[i]
    if isPal > 1 :
        print("I'm Sorry Hansoo")
    else:
        for i in range(len(cnt)):
            for j in range(cnt[i]//2):
                ans+=setS[i]
        ans += res +ans[::-1]
        print(ans)
Main()