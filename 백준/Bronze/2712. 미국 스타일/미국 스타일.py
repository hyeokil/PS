import sys
input = sys.stdin.readline
T = int(input())
for tc in range(T):
    n,c = input().split()
    n=float(n)
    if c == "kg":
        print(f"{n*2.2046:.4f} lb")
    elif c=="lb":
        print(f"{n*0.4536:.4f} kg")
    elif c=="g":
        print(f"{n*3.7854:.4f} l")
    else:
        print(f"{n*0.2642:.4f} g")
