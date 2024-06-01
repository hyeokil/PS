for tc in range(int(input())):
    N = int(input())
    S = N**2
    N=str(N)
    S=str(S)
    if S[-len(N):] ==N:
        print("YES")
    else:
        print("NO")