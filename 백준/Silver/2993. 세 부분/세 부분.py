S = input()
L = len(S)
ans = []
for i in range(1,L-1):
    for j in range(i+1,L):
        a=S[:i]
        b=S[i:j]
        c=S[j:]
        a=a[::-1]
        b=b[::-1]
        c=c[::-1]
        ans.append(a+b+c)
ans.sort()
print(ans[0])
