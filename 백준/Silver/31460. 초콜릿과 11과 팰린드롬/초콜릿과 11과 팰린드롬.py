def Main():
    for tc in range(int(input())):
        N = int(input())
        ans = ''
        if N>1:
            for i in range(N):
                if i==0 or i==N-1:ans+='1'
                else:ans+='2'
            print(ans)
        else:print(0)
Main()