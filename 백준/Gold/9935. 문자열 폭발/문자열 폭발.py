def Main():
    S = input()
    bomb = input()
    bomb_size=len(bomb)
    st = []
    for s in S:
        st.append(s)
        if ''.join(st[-bomb_size:]) == bomb :
            del st[-bomb_size:]
    if st :
        print(''.join(st))
    else:
        print('FRULA')
Main()