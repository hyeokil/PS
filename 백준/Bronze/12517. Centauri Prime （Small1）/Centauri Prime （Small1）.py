for tc in range(int(input())):
    S = input()
    if S[-1] in 'aeiou':
        print(f'Case #{tc+1}: {S} is ruled by a queen.')
    elif S[-1] == 'y':
        print(f'Case #{tc + 1}: {S} is ruled by nobody.')
    else:
        print(f'Case #{tc + 1}: {S} is ruled by a king.')

