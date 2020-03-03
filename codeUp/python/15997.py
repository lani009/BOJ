a, b, c, d = input().split(' ')
a, b, abw, ab, abl = input().split(' ')
d, c, dcw, dc, dcl = input().split(' ')
d, a, daw, da, dal = input().split(' ')
b, c, bcw, bc, bcl = input().split(' ')
a, c, acw, ac, acl = input().split(' ')
b, d, bdw, bd, bdl = input().split(' ')
#출력값 총합은 2 
# a가 이길 확률들 abw, dal, acw  3 /3
# b가 이길 확률들 abl, bcw, bdw  0
# c가 이길 확률들 bcl, dcl, acl  1.5
# d가 이길 확률들 dcw, daw, bdl  1.5  6

# ab가 비길 확률 ab
# dc가 비길 확률 dc
# da가 비길 확률 da
# bc가 비길 확률 bc
# ac가 비길 확률 ac
# bd가 비길 확률 bd

def draw(x, y, z):
    #return float(y)/(float(x)+float(z)) + float(x)
    return float(x)/(float(x)+ float(z))

abw = draw(abw, 0, abl)
abl = draw(abl, 0, abw)
dcw = draw(dcw, 0, dcl)
dcl = draw(dcl, 0, dcw)
daw = draw(daw, 0, dal)
dal = draw(dal, 0, daw)
bcw = draw(bcw, 0, bcl)
bcl = draw(bcl, 0, bcw)
acw = draw(acw, 0, acl)
acl = draw(acl, 0, acw)
bdw = draw(bdw, 0, bdl)
bdl = draw(bdl, 0, bdw)


aswin = (abw + dal + acw)/3
bswin = (abl + bcw + bdw)/3
cswin = (bcl + dcl + acl)/3
dswin = (dcw + daw + bdl)/3

print(aswin)
print(bswin)
print(cswin)
print(dswin)
