N = int(input())
S,E = input().split('*')
Ls,Le = len(S),len(E)
for i in range(N):
    s = input()
    if len(s)>=Ls+Le and S == s[:Ls] and E == s[-Le:]:
        print('DA')
    else:print('NE')

        