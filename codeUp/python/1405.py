N = int(input())
num = input().split(' ')

for i in range(N):
    print(num[i] + ' ', end = "")
print()

for i in range(N - 1):
    temp = num[0]
    for j in range(N - 1):
        num[j] = num[j + 1]
    num[N - 1] = temp
    for j in range(N):
        print(num[j] + ' ', end = "")
    print()