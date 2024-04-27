import sys
input = sys.stdin.readline

def Main():
    D = {"R":(0,1),
         "L":(0,-1),
         "B":(-1,0),
         "T":(1,0),
         "RT":(1,1),
         "LT":(1,-1),
         "RB":(-1,1),
         "LB":(-1,-1)}

    K, S, N = input().rstrip().split()
    K = list(K)
    S=list(S)
    N = int(N)
    for _ in range(N):
        d = input().rstrip()
        y,x=D[d]
        tmpk0,tmpk1 = chr(ord(K[0])+x),chr(ord(K[1])+y)
        if "A"<=tmpk0<="H" and "1"<=tmpk1<="8":
            if tmpk0==S[0] and tmpk1==S[1]:
                tmps0,tmps1=chr(ord(S[0])+x),chr(ord(S[1])+y)
                if "A"<=tmps0<="H" and "1"<=tmps1<="8":
                    S[0],S[1]=tmps0,tmps1
                else:
                    continue
            K[0],K[1]=tmpk0,tmpk1
    print(''.join(K))
    print(''.join(S))
Main()
