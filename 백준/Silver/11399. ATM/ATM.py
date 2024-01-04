N = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst1= [lst[0]]

for i in range(1,N):
    lst1.append(lst[i]+lst1[i-1])
print(sum(lst1))
