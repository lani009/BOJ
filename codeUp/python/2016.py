N = int(input())
num = input()
for i in range(N):
    if((N - i) % 3 == 0 and i != 0):
        print(',', end='')
    print(num[i], end='')