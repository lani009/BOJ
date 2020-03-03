hour, minute, sec = input().split(' ')
hour = int(hour)
minute = int(minute)
sec = int(sec)

time = int(input())

sec += time

while(sec >= 60):
    sec -= 60
    minute += 1

while(minute >= 60):
    minute -= 60
    hour += 1

hour %= 24  

print(hour, minute, sec)