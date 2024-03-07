for tc in range(int(input())):
    a,b = input().split()
    b = int(b)
    if 97<=b<=100:
        ans = "A+"
    elif 90<=b<=96:
        ans = "A"
    elif 87<=b<=89:
        ans = "B+"
    elif 80<=b<=86:
        ans = "B"
    elif 77<=b<=79:
        ans = "C+"
    elif 70<=b<=76:
        ans = "C"
    elif 67<=b<=69:
        ans = "D+"
    elif 60<=b<=66:
        ans = "D"
    else:
        ans = "F"
    print(a,ans)

