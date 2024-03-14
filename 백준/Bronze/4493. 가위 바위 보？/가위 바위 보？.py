import sys
input = sys.stdin.readline

T =int(input())
for i in range(T):
    N = int(input())
    P1 = 0
    P2 = 0
    for j in range(N):
        A,B = input().rstrip().split()
        if A=="R":
            if B=="S":
                P1+=1
            elif B=="P":
                P2+=1
        elif A=="S":
            if B=="R":
                P2+=1
            elif B=="P":
                P1+=1
        else:
            if B=="R":
                P1+=1
            elif B=="S":
                P2+=1
    if P1>P2:
        print("Player 1")
    elif P1<P2:
        print("Player 2")
    else:
        print("TIE")