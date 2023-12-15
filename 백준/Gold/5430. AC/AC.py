from collections import deque

def Main():
    for tc in range(int(input())):
        P = input()
        N = int(input())
        lst = input()
        isPos = False
        isR = False
        if lst != '[]':
            lst= deque(lst[1:len(lst)-1].split(','))
        else:
            lst = []
        for i in range(len(P)):
            if P[i] == 'R':
                if isR :
                    isR =False
                else:
                    isR = True
            else:
                if lst :
                    if isR:
                        lst.pop()
                    else:
                        lst.popleft()
                else:
                    isPos = True
                    break
        if isPos:
            print('error')
        else:
            if isR :
                lst.reverse()
                print('[' + ','.join(lst) + ']')
            else:
                print('[' + ','.join(lst) + ']')
Main()