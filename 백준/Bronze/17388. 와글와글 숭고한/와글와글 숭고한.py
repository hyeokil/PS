l = list(map(int,input().split()))
if sum(l)>=100:print("OK")
else:
    if min(l) == l[0]:print("Soongsil")
    elif min(l) == l[1]:print("Korea")
    else:print("Hanyang")