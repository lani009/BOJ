origin = input()
shift = 3
word = ''
for i in range(len(origin)):
    if (ord(origin[i]) == ord(' ')):
        word += ' '
        continue
    
    if (ord(origin[i]) <= ord('z') and ord(origin[i]) >= ord('a')):
        #소문자인경우
        if (ord(origin[i]) + shift) > ord('z'):
            word += chr(ord('a') + ord(origin[i]) + shift - (ord('z')) - 1)
        else:
            word += chr(ord(origin[i]) + shift)
    else:
        #대문자인 경우
        if (ord(origin[i]) + shift) > ord('Z'):
            word += chr(ord('A') + ord(origin[i]) + shift - (ord('Z')) - 1)
        else:
            word += chr(ord(origin[i]) + shift)

print(word)