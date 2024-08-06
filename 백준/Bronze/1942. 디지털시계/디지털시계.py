def six(h, m, s):
    return 60 * 60 * h + 60 * m + s


def ten(t):
    h = t // 3600
    m = t % 3600 // 60
    s = t % 60
    return h * 10000 + m * 100 + s


for _ in range(3):
    start, end = input().split()

    sh, sm, ss = map(int, start.split(':'))
    eh, em, es = map(int, end.split(':'))

    sp = six(sh, sm, ss)
    ep = six(eh, em, es)
    if sp > ep:
        ep += six(24, 0, 0)
    cnt = 0
    # print(ep-sp)
    for i in range(sp, ep + 1):
        # print(ten(i))
        if ten(i) % 3 == 0:
            cnt += 1

    print(cnt)