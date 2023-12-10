import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    lst = [int(input()) for _ in range(N)]
    st = []
    ans = 0
    for i in range(N):
        while st and lst[st[-1]] > lst[i] :
            x = st.pop()
            if st :
                L = i-st[-1]-1
            else:
                L = i
            ans = max(ans,L*lst[x])
        st.append(i)

    while st:
        x = st.pop()

        if st:
            L = N-st[-1]-1
        else:
            L = N
        ans = max(ans, L*lst[x])
    print(ans)
Main()