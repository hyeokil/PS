res_li = []
for _ in range(int(input())):
    lst = list(map(int, input().split()))
    st = len(set(lst))
    if st == 1:
        res_li.append(50000 + lst[0] * 5000)
    elif st == 2:
        count = lst.count(max(lst))
        if count == 1:
            res_li.append(min(lst) * 1000 + 10000)
        elif count == 3:
            res_li.append(max(lst) * 1000 + 10000)
        elif count == 2:
            res_li.append(max(lst) * 500 + min(lst) * 500 + 2000)
    elif st == 3:
        for p in lst:
            if lst.count(p) == 2:
                res_li.append(p * 100 + 1000)
                break
    else:
        res_li.append(max(lst) * 100)
print(max(res_li))