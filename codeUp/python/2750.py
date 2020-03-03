def calc(num, equ):
    sum = 0
    i = 0
    while i < len(equ):
        sum += pow(num, equ[i][1]) * equ[i][0]
        i += 1
    return sum

def main():
    equation = input()
    a = float(input())
    arreq = []
    sign = 0
    square = 0
    i = 0
    while i < len(equation):
        if equation[i] == '+':
            sign = 1
        else:
            sign = -1
        sign *= int(equation[i + 1])
        square = int(equation[i + 5])
        arreq.append([sign, square])
        i += 6

    iterate = 0.0
    flag = 0
    while True:
        if calc(a + iterate, arreq) <= 0.001:
            flag = 1
            break
        elif calc(a - iterate, arreq) <= 0.001:
            flag = -1
            break
        iterate += 0.001
    print(round(a + iterate * flag, 3))

main()