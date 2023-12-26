def Main():
    S = input()
    one = 0
    zero = 0
    if S[0] == '0':
        zero += 1
    else:
        one += 1
    for i in range(1,len(S)):
        if S[i] != S[i-1]:
            if S[i] == '0':
                zero += 1
            else:
                one +=1
    print(min(one,zero))
Main()