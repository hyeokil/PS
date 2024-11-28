import sys
input = sys.stdin.readline

def Main():
    while True:
        N = input().rstrip()
        if N =='0': break
        while len(N)>1 :
            res = 0
            for n in N:
                res+= int(n)
            N = str(res)
        print(N)
Main()

