for tc in range(1,int(input())+1):
    print(f"Data Set {tc}:")
    N= int(input())
    L = [input() for _ in range(N)]
    S = input().lower()
    Sl=len(S)
    ans = []
    for i in range(len(L)):
        idx = 0
        for j in range(len(L[i])):
            if L[i][j].lower() == S[idx]:
                idx+=1
                if idx == Sl:
                    ans.append(L[i])
                    break
    for i in ans:
        print(i)

