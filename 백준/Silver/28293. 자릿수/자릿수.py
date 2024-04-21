import math

def digit_count_of_power(a, b):
    # 거듭제곱 계산
    power = b * math.log10(a)
    # 결과의 자릿수 계산
    digits = int(power) + 1
    return digits

# 입력 받기
a, b = map(int, input().split())

# 결과 출력
print(digit_count_of_power(a, b))
