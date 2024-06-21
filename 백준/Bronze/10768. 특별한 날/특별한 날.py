M = int(input())
D = int(input())
if M<2:
    print("Before")
elif M==2:
    if D==18:
        print("Special")
    elif D<18:
        print("Before")
    else:
        print("After")
else:
    print("After")
