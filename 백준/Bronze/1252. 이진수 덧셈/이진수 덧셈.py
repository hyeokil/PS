import sys
input = sys.stdin.readline

b1,b2 = input().split()
print(bin(int(b1,2)+int(b2,2))[2:])