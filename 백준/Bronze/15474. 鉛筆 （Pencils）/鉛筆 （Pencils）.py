N,A,B,C,D = map(int,input().split())
AT = N//A
if N%A>0:
    AT +=1
CT = N//C
if N%C>0:
    CT+=1
print(min(AT*B,CT*D))
