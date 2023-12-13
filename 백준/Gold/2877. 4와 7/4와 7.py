def Main():
    N = int(input())
    square = 0
    num = 0
    while num < N :
        square += 1
        num += 2**square
    num -= 2**square
    N-=num
    ans = ''
    while square > 0 :
        if N > (2**square)//2 :
            ans += '7'
            N-=(2**square)//2
        else:
            ans += '4'
        square-=1
    print(ans)
Main()