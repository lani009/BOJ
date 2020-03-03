#todo: 시바 너무 귀찮다. 일단은 나중에 하기. 재미도 드럽게 없네
#todo: 2019.12.30 union에서 중복되는 것  insec통해서 빼기. 그 후 뺀 자리 밀어넣기
input()
a = input().split(' ')
a.pop()
input()
b = input().split(' ')
b.pop()

insec = []

for i in a:
    for j in b:
        if(i == j):
            insec.append(i)
            break

union = a + b
for i in insec:

    if(i == union)