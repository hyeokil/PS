def Main():
    N = input()
    se = set(N)
    ninetosix = 1
    maxC= 0
    for i in range(len(N)):
        if N[i] == '9' or N[i] == '6' :
            ninetosix+=1
        elif maxC < N.count(N[i]):
            maxC = N.count(N[i])
    ninetosix = ninetosix//2
    ans = 0
    if maxC > ninetosix :
        ans = maxC
    else:
        ans = ninetosix
    print(ans)
Main()