def Main():
    N = int(input())
    dic = {}
    for i in range(N):
        S= input()
        if S not in dic:
            dic[S] = 1
        else:dic[S]+=1
    res = max(dic.values())
    ans = []
    for i in dic.keys():
        if dic[i]==res:
            ans.append(i)
    ans.sort()
    print(ans[0])
Main()