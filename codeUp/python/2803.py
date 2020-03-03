import math
x1, y1, r1 = input().split(' ')
x2, y2, r2 = input().split(' ')

distance = math.sqrt(pow(int(x1) - int(x2), 2) + pow(int(y1) - int(y2), 2))

if(distance < (int(r1) + int(r2))):
    print("overlapped")
else:
    print("not overlapped")