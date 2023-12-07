def Main():
    green = input()
    back = []
    front = []
    ans = 0
    for i in range(1,len(green)):
        if green[i-1:i+1] == '((':
            back.append(i)
        elif green[i-1:i+1] == '))':
            front.append(i)
    fl = len(front)
    for i in back:
        for j in range(fl) :
            if i < front[j] :
                ans += fl - j
                break
    print(ans)
Main()