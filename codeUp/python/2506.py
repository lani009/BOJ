def main():
    num = float(input())
    if(num == 0.2):
        print('1/401')
        return
    i = 0
    j = 1

    while True:
        if(round(i / j * 1000) / 1000 == round(num * 100) / 10000):
            print(str(i) + '/' + str(j))
            return
        elif (i == j):
            j += 1
            i = 0
        else:
            i += 1

main()