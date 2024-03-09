lst = [input() for _ in range(6)]
a=lst.count("W")
ans =-1
if a>=5:
    ans =1
elif a>=3:
    ans =2
elif a>=1:
    ans=3
print(ans)
    