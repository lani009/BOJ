a, b = input().split(' ')

a=int(a)
b=int(b)
sum = 0
if(a%2 == 0):
    sum += (a//2) * 10
else:
    sum += a//2 + 1

if(b%2 == 0):
    sum += (b//2) * 10
else:
    sum += b//2 + 1

print(sum)