def Main():
    S = input()
    s,e = 0,len(S)-1
    while s<e:
        if S[s] != S[e] :
            return len(S)
        s+=1
        e-=1
    s,e = 0,len(S)-2
    while s<e:
        if S[s] != S[e] :
            return len(S)-1
        s+=1
        e-=1
    return -1
print(Main())