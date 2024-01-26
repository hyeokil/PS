def f(i,S):
    if i == N:
        curS = S.replace(' ','')
        tmp = ''
        cal = '+'
        ans = 0
        for s in curS:
            if s == '+' :
                if cal == '+':
                    ans+=int(tmp)
                else: ans-=int(tmp)
                cal = '+'
                tmp=''
            elif s=='-':
                if cal == '+':
                    ans+=int(tmp)
                else: ans-=int(tmp)
                cal = '-'
                tmp=''
            else:tmp+=s
        if cal == '+':
            ans += int(tmp)
        else:
            ans -= int(tmp)
        if ans == 0:
            print(S)
        return
    f(i + 1, S + f" {i + 1}")
    f(i + 1, S + f"+{i + 1}")
    f(i + 1, S + f"-{i + 1}")



for tc in range(int(input())):
    N = int(input())
    f(1,'1')
    print()
