import copy
import sys
sys.setrecursionlimit(10000)
def grow(mapO, civil, N, temp):
    for i in range(len(civil)):
        if(int(civil[i][0]) + 1 < N):
            if(mapO[int(civil[i][1]) - 1][int(civil[i][0])] != 1):
                mapO[int(civil[i][1]) - 1][int(civil[i][0])] = 1
                temp.append([int(civil[i][0]) + 1, int(civil[i][1])])

        if(int(civil[i][1]) + 1 < N):
            if(mapO[int(civil[i][1])][int(civil[i][0]) - 1] != 1):
                mapO[int(civil[i][1])][int(civil[i][0]) - 1] = 1
                temp.append([int(civil[i][0]), int(civil[i][1]) + 1])

        if(int(civil[i][0]) - 1 > 0):
            if(mapO[int(civil[i][1]) - 1][int(civil[i][0]) - 2] != 1):
                mapO[int(civil[i][1]) - 1][int(civil[i][0]) - 2] = 1
                temp.append([int(civil[i][0]), int(civil[i][1]) - 1])

        if(int(civil[i][1]) - 1 > 0):
            if(mapO[int(civil[i][1]) - 2][int(civil[i][0]) - 1] != 1):
                mapO[int(civil[i][1]) - 2][int(civil[i][0]) - 1] = 1
                temp.append([int(civil[i][0]) - 1, int(civil[i][1])])

def check(mapCopy, x, y, N):
    if(mapCopy[y][x] == -1):
        return
    mapCopy[y][x] = -1
    if(y + 1 < N and mapCopy[y + 1][x] != 0 and mapCopy[y + 1][x] != -1):
        check(mapCopy, x, y + 1, N)
    if(x + 1 < N and mapCopy[y][x + 1] != 0 and mapCopy[y][x + 1] != -1):
        check(mapCopy, x + 1, y, N)
    if(y - 1 >= 0 and mapCopy[y - 1][x] != 0 and mapCopy[y - 1][x] != -1):
        check(mapCopy, x, y - 1, N)
    if(x - 1 >= 0 and mapCopy[y][x - 1] != 0 and mapCopy[y][x - 1] != -1):
        check(mapCopy, x - 1, y, N)

def checker(origin, mapCopy, x, y, N):
    check(mapCopy, x, y, N)
    for i in range(N):
        for j in range(N):
            if(origin[i][j] != mapCopy[i][j] * (-1)):
                return True
    return False

N, K = input().split(' ')
N = int(N)
K = int(K)
civil = []
for i in range(K):
    civil.append(input().split(' '))

mapO = [[0] * N for i in range(N)]

#marking
year = 0
first = True
for i in range(K):
    #맵에 마킹
    mapO[int(civil[i][1]) - 1][int(civil[i][0]) - 1] = 1

while(checker(mapO, copy.deepcopy(mapO), int(civil[0][1]) - 1, int(civil[0][0]) - 1, N)):
    year += 1
    temp = []
    grow(mapO, civil, N, temp)
    civil = temp

print(year)
