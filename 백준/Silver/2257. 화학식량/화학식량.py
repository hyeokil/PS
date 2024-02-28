def Main():
    S = input()
    st = []
    dic = {"H":1,"C":12,"O":16}
    ans = 0
    for i in range(len(S)):
        if S[i]=="(":
            st.append(0)
        elif S[i]==")":
            res = 0
            while True:
                a = st.pop()
                if a == 0:
                    break
                res+=a
            st.append(res)
        elif S[i].isnumeric():
            b = st.pop()
            st.append(b*int(S[i]))
        else:
            st.append(dic[S[i]])
    print(sum(st))
Main()