import random
doit = ["술먹어", "바람펴", "놀러가", "때려", "담배펴", "투정부려"]
ans = '여자친구:'
fail = ['똑바로 대답 안해?', "똑바로 말해.", "대답이 왜 그래?", "대답 못해?"]
print("여자친구: 나 화났어")
print("1) 미안해")
a = input()
print()
if(a == '1'):
    print("여자친구: 뭐가 미안한데?")
else:
    print(ans, fail[random.randrange(0, len(fail))])
while True:
    print("1) 몰라  2) " + doit[random.randrange(0, len(doit))] + "서 미안해")
    k = input()
    print()
    if(k == '1'):
        print("여자친구: 모르면서 미안해?")
    elif(k == '2'):
        print("여자친구: 알면서 그래?")
    else:
        print(ans, fail[random.randrange(0, len(fail))])
    print("1) 잘못했어")
    k = input()
    print()
    if(k == '1'):
        print("여자친구: 뭘 잘못했는데??")
    else:
        print(ans, fail[random.randrange(0, len(fail))])