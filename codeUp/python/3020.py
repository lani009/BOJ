N1 = int(input())
Q1 = input().split(' ')
N2 = int(input())
Q2 = input().split(' ')

answer = []
for i in Q2:
    flag = -1
    k = 0
    for j in Q1:
        if(j == i):
            flag = k + 1
            break
        k += 1
    answer.append(flag)

for i in answer:
    print(str(i) + ' ', end='')