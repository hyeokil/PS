def Main():
    S = input()
    bomb = input()
    bomb_size=len(bomb)
    st = []
    for s in S:
        st.append(s)
        if ''.join(st[-bomb_size:]) == bomb :
            for i in range(bomb_size):
                st.pop()
    if st :
        print(''.join(st))
    else:
        print('FRULA')
Main()