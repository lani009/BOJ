def dfs(arr, x, y):
    for i in arr:
        for j in i:
            print(j, end='')
        print()
    print()
    if(arr[y][x] == '*'):
        return
    arr[y][x] = '*'
    if(y + 1 < 10 and arr[y + 1][x] != '*'):
        dfs(arr, x, y + 1)
    if(x + 1 < 10 and arr[y][x + 1] != '*'):
        dfs(arr, x + 1, y)
    if(y - 1 >= 0 and arr[y - 1][x] != '*'):
        dfs(arr, x, y - 1)
    if(x - 1 >= 0 and arr[y][x - 1] != '*'):
        dfs(arr, x - 1, y)
arr = []
for i in range(10):
    arr.append(list(input()))

x, y = input().split(' ')
x = int(x)
y = int(y)

dfs(arr, x, y)
for i in arr:
    for j in i:
        print(j, end='')
    print()
    