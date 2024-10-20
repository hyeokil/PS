a = float(input())
while 1:
    b = float(input())
    if b == 999:
        break
    print("%.2f" % (b-a))
    a = b