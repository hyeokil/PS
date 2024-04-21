import sys
input = sys.stdin.readline

def Main():
    N = int(input())
    arr = [input().rstrip() for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if arr[i][j] == "*":
                print(i+2,j+1)
                a,b,c,d,e=0,0,0,0,0
                x,yd,ye=0,j-1,j+1
                for k in range(j-1,-1,-1):
                    if arr[i+1][k]=="*":
                        a+=1
                    else:
                        break
                for k in range(j+1,N):
                    if arr[i+1][k]=="*":
                        b+=1
                    else:
                        break
                for k in range(i+2,N):
                    if arr[k][j]=="*":
                        c+=1
                    else:
                        x=k
                        break
                for k in range(x,N):
                    if arr[k][yd] == "*":
                        d += 1
                    if arr[k][ye] == "*":
                        e += 1
                print(a,b,c,d,e)
                sys.exit()
Main()