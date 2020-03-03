decimal = int(input())
bin = []
if decimal == 0:
    print(0)
    exit()
while True:
    bin.append(decimal % 2)
    decimal = int(decimal / 2)
    if(decimal == 0):
        bin.append(decimal)
        break
if bin[len(bin) - 1] == 0:
    bin.pop()

for i in range(len(bin)):
    print(bin.pop(), end="") 