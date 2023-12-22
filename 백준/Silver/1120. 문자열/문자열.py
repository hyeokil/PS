def Main():
    A,B = input().split()
    ans =100
    for i in range(len(B)-len(A)+1):
        res = 0
        for j in range(len(A)):
            if A[j] != B[j+i]:
               res+= 1
        if res < ans :
            ans = res
    print(ans)
Main()