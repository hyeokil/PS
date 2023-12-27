def Main():
    S = input()
    bomb = list(input())
    bomb_size=len(bomb)
    last_b = bomb[-1]
    st = []
    for s in S:
        st.append(s)
        if st[-1] == last_b and st[-bomb_size:] == bomb :
            del st[-bomb_size:]
    if st :
        print(''.join(st))
    else:
        print('FRULA')
Main()