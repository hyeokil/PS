while True :
    S = input()
    if S == "*":
        break
    check = [0]*26
    for s in S:
        if s!=" " and check[ord(s)-97]==0:
            check[ord(s) - 97]=1
    if sum(check)==26:
        print("Y")
    else:
        print("N")