lst = ["zero", "one", "two", "three", "four", "five",
       "six", "seven", "eight", "nine"]
N,M = map(int,input().split())
res = []
for i in range(N,M+1):
    tmp = ""
    if i>9:
        tmp +=lst[i//10]+" "
    tmp+=lst[i%10]
    res.append([tmp,i])
res.sort()
for i in range(len(res)):
    if i!=0 and i%10==0:
        print()
    print(res[i][1],end=" ")



