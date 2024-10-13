
def Main():
    while True:
        try:
            A = input()
            B=input()
        except :
            break
        check1 = [0]*26
        check2 = [0]*26
        for c in A:
            check1[ord(c)-97]+=1
        for c in B:
            check2[ord(c)-97]+=1
        ans = ""
        for i in range(26):
            if check1[i] >0 and check2[i]>0:
                for j in range(min(check1[i],check2[i])):
                    ans+=chr(i+97)
        print(ans)
Main()