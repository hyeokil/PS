N = int(input())
for _ in range(N):
    b1,b2 = input().split()
    print(bin(int(b1,2)+int(b2,2))[2::])