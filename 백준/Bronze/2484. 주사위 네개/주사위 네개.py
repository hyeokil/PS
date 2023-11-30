def Main():
    ans = []
    for _ in range(int(input())):
        lst = list(map(int, input().split()))
        st = len(set(lst))
        if st == 1:
            ans.append(50000 + lst[0] * 5000)
        elif st == 2:
            count = lst.count(max(lst))
            if count == 1:
                ans.append(min(lst) * 1000 + 10000)
            elif count == 3:
                ans.append(max(lst) * 1000 + 10000)
            elif count == 2:
                ans.append(max(lst) * 500 + min(lst) * 500 + 2000)
        elif st == 3:
            for p in lst:
                if lst.count(p) == 2:
                    ans.append(p * 100 + 1000)
                    break
        else:
            ans.append(max(lst) * 100)
    print(max(ans))
Main()