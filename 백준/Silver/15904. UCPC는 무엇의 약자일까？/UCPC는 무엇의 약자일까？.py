S = input()
C = "UCPC"
i = 0
for s in S:
    if s==C[i]:
        i+=1
        if i==4:
            break
if i==4:print("I love UCPC")
else:print("I hate UCPC")