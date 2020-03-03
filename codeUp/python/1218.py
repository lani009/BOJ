import io, sys
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf8')
#코드업에서 한글 출력시 사용해야 함
a, b, c = input().split(' ')
a = int(a)
b = int(b)
c = int(c)

if(a + b <= c):
    print('삼각형아님')
elif(a == b and b == c):
    print('정삼각형')
elif(a*a + b*b == c*c):
    print('직각삼각형')
elif(a == b or b == c or a == c):
    print('이등변삼각형')
else:
    print('삼각형')