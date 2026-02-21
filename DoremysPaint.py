def helper(n,arr):
    dic={}
    for i,val in enumerate(arr):
        dic[val]=dic.get(val,0)+1
    if len(dic)>2:
        return "NO"
    if len(dic) == 1:
        return "YES"
    else:
        values = list(dic.values())
        diff = abs(values[0] - values[1])
        if diff <= 1:
            return "YES"
        else : 
            return "NO"
        
t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    print(helper(n,arr))
