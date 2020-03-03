number = int(input())
cnt = 0
cnt1 = 0
for i in range(number):
    for j in range(number):
        if i*j == number:
            for a in range(1,i+1):
                if i % a ==0:
                    cnt = cnt+1
            for b in range(j,j+1):
                if j%a == 0:
                    cnt1 = cnt1+1