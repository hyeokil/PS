T = int(input())
for k in range(1, T + 1):
    n, d, f, l = map(int, input().split())

    quotient = n // d
    remainder = n % d
    result = ''
    cnt = 0
    while True:
        quotient, remainder = remainder * 7 // d, remainder * 7 % d
        if f <= cnt <= l:
            result += str(quotient)
        if cnt == l:
            break
        cnt += 1

    print(f'Problem set {k}: {n} / {d}, base 7 digits {f} through {l}: {result}')