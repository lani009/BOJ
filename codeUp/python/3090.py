n = int(input())
k = int(input())

lft = 1
rgt = k

while lft<=rgt:
    mid = (lft + rgt) >> 1
    sum = 0
    i = 1
    while i<= n:
        sum += min(n, mid //i)
        i += 1
    if sum >= k:
        rgt = mid - 1
        ans = mid
    else:
        lft = mid + 1
print(ans)

