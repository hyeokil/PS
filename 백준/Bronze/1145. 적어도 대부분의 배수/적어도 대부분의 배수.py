import math
lst = list(map(int, input().split()))
lst.sort()
ans = float('inf')
for i in range(3):
    for j in range(i+1,4):
        for k in range(j+1,5):
            ans = min(ans,math.lcm(lst[i],lst[j],lst[k]))
print(ans)