import sys
input = sys.stdin.readline

N =int(input())
while True:
    A = int(input())
    if A==0:break
    if A%N:print(A,f"is NOT a multiple of {N}.")
    else:print(A,f"is a multiple of {N}.")
