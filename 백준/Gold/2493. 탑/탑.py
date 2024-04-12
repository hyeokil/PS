N = int(input())
lst = list(map(int, input().split()))
st = []
for i in range(N):
    while st:
        if lst[i] >= st[-1][0]:
            st.pop()
        else:
            print(st[-1][1],end=" ")
            st.append([lst[i],i+1])
            break
    else:
        print(0, end=" ")
        st.append([lst[i],i+1])
