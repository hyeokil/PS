def Main():
    check = [True]*10001
    for i in range(1,10001):
        if check[i]:
            print(i)
            while True:
                i+= sum(list(map(int,str(i))))
                if i>10000:break
                check[i]=False
Main()