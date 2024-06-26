N=int(input())
for i in range(N,3,-1):
    v=str(i)
    if v.count("4")+v.count("7")==len(v):
        print(i)
        break