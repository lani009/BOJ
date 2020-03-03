tunnel = input().split(' ') #3개 리스트로 저장

flag = -1 #플래그를 선언

for i in tunnel:
    if int(i) <= 170:
        flag = i
        break

if flag == -1:
    print("PASS")
else:
    print("CRASH", flag)