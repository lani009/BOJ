def factor(num):
    arr = []
    for i in range(2, num // 2 + 1):
        if(num % i == 0):
            arr.append(i)
    arr.append(num)
    return arr

a, b = input().split(' ')
alpha = factor(int(a))
beta = factor(int(b))

flag = False
for i in alpha:
    for j in beta:
        if(i == j):
            flag = True

if(flag):
    print('no')
else:
    print('coprime')