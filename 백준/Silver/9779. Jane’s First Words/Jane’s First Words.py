import sys
import re


pattern = re.compile(r'da+dd?(i|y)')

def process_input():
    input_lines = sys.stdin.read().strip().split()
    for word in input_lines:
        if pattern.fullmatch(word):
            print("She called me!!!")
        else:
            print("Cooing")

if __name__ == "__main__":
    process_input()
