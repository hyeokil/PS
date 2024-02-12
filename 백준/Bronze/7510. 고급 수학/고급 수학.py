for tc in range(int(input())):
    lst= list(map(int,input().split()))
    lst.sort()
    print(f"Scenario #{tc+1}:")
    if lst[2]**2 == lst[0]**2+lst[1]**2:print("yes")
    else:print("no")
    print()


