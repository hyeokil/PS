def f(t,i):
    global flag
    if i == L :
        if t == S:
            flag = True
        return
    if t[-1] == 'A':
        f(t[:-1],i-1)
    if t[0] == 'B':
        f(t[:0:-1],i-1)

S,T = input(),input()
L = len(S)
flag = False
f(T,len(T))
if flag:print(1)
else:print(0)
