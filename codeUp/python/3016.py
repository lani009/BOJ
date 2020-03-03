N = int(input())
student = []
for i in range(N):
    student.append(input().split(' '))

index = 0
j = 0
for i in student:
    if(int(student[index][1]) < int(i[1])):
        index = j
    j += 1

second = N
third = N

for i in student:
    
    if(i == student[index]):
        continue
    if(int(i[2]) <= int(student[index][2])):
        second -= 1

for i in student:
    if(i == student[index]):
        continue
    if(int(i[3]) <= int(student[index][3])):
        third -= 1

print(student[index][0], second, third)