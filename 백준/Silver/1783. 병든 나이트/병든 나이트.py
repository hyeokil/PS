N,M = map(int,input().split())
if N == 1:print(1)
elif N==2:
    if M<=6:print((M+1)//2)
    else:print(4)
else:
    if M<=6:print(min(4,M))
    else:print(M-2)