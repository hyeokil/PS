for tc in range(int(input())):
    N = int(input())
    ans = []
    for i in range(1,11):
        for j in range(i+1,12):
            if N == i+j :
                ans.append((i,j))

    if ans:
        print(f"Pairs for {N}: ", end='')
        for i in range(len(ans)-1) :
            print(f'{ans[i][0]} {ans[i][1]}, ',end='')
        print(f'{ans[-1][0]} {ans[-1][1]}')
    else:
        print(f"Pairs for {N}:")