def Main():
    N = int(input())
    ans = 0
    for i in range(1,N+1):
        if i < 100 :
            ans += 1
        elif i != 1000:
            s = str(i)
            s1 = int(s[0]) - int(s[1])
            s2 = int(s[1]) - int(s[2])
            if s1 == s2 :
                ans += 1
    print(ans)
Main()