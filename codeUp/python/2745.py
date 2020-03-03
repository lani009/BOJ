a, b, c = input().split(' ')
a = int(a)
b = int(b)
c = int(c)

count = (a-b)//(b-c)
if (a-b)%(b-c) == 0:
    count += 1
else:
    count += 2
print(count)