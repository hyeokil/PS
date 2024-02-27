N = int(input())
lst = list(input().split())
lst.sort()
dic = {}
for i in lst:
    dic[i] = 0
for i in range(N):
     l=list(input().split())
     for j in l:
         dic[j]+=1
lst = list(dic.items())
lst.sort(key=lambda x:x[1], reverse=True)
for a,b in lst:
    print(a,b)