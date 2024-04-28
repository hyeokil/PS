import sys
input = sys.stdin.readline

L,R = input().rstrip().split()
if len(L)!=len(R):print(0)
else:
    ans = 0
    for i in range(len(L)):
        if L[i]==R[i]:
            if L[i]=="8":
                ans+=1
        else:
            break
    print(ans)