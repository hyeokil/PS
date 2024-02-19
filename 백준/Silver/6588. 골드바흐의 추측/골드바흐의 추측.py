import sys
input = sys.stdin.readline

def Main():
    check = [True]*1000001
    check[0],check[1]=False,False
    for i in range(2,int(1000001**0.5)+1):
        if check[i]:
            for j in range(i+i,1000001,i):
                check[j]=False
    while True:
        N = int(input())
        if N==0:
            break
        for i in range(3,N//2+1,2):
            if check[i] and check[N-i]:
                print(f"{N} = {i} + {N-i}")
                break
        else:print("Goldbach's conjecture is wrong.")
Main()
