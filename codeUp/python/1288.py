def factorial(n):
    if(n == 1):
        return 1
    return n * factorial(n - 1)

n, r = input().split(' ')
if(n == r):
    print(1)
else:
    print(factorial(int(n)) // factorial(int(r)) // factorial(int(n) - int(r)))