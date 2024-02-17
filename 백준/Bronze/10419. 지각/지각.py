for tc in range(int(input())):
    N = int(input())
    n = int(N**0.5)
    while N < n**2+n:
        n-=1
    print(n)