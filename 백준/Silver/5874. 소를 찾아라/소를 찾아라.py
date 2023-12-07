def Main():
    green = input()
    back = 0
    ans = 0
    for i in range(1,len(green)):
        if green[i-1:i+1] == '((':
            back+= 1
        elif green[i-1:i+1] == '))':
            ans += back
    print(ans)
Main()