while True:
    a,b,c = map(int,input().split())
    if a==0 and b==0 and c==0:
        break
    if a!=b and c-b == b-a:
        print('AP',2*c-b)
    elif a != 0 and b!=0 and b%a==0 and b//a==c//b:
        print('GP',c *(c//b))
        