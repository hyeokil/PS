N = int(input())
S = input()
lst = [int(input()) for i in range(N)]
st = []
for s in S :
    if s not in "+-/*":
        st.append(lst[ord(s)-65])
    else:
        b = st.pop()
        a = st.pop()
        if s=="+":
            st.append(b+a)
        elif s=="-":
            st.append(a-b)
        elif s== "*":
            st.append(b*a)
        else:
            st.append(a/b)
print(f"{st[0]:.2f}")



