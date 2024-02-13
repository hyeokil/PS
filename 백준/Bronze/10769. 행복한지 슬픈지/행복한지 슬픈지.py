S = input()
happy = S.count(":-)")
sad = S.count(":-(")
if happy ==0 and sad == 0:print("none")
else:
    if happy == sad: print("unsure")
    elif happy > sad:print("happy")
    elif sad>happy :print("sad")