score = input().split(' ')
arr = [[0]*10 for i in range(10)]

for i in range(10):
    j = 0
    while j < 10:
        if(int(score[i]) >= (j + 1) * 10):
            arr[9 - j][i] = 1
        else:
            break
        j += 1

for i in arr:
    for j in i:
        if(j == 0):
            print('  ', end='')
        else:
            print('# ',end='')
    print()