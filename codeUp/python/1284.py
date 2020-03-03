def primeNum(number): #소수를 판별해주는 함수 소수면 1 아니면 0
    i = 3
    if number == 2:
        return 1
    if(number % 2 == 0):
        return 0
    
    while i < number:
        if number % i == 0:
            return 0
        i += 2
    return 1

c = 1
n = int(input())
i = 2
while i < n:
    if primeNum(i):
        if(primeNum(n / i) and (n % i == 0) and c):
            print(i, int(n / i))
            c -= 1
        elif not c:
            break
    i += 1
if c:
    print("wrong number")