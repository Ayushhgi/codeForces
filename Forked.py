from math import sqrt
def  helper(a,b,k_a,k_b,q_a,q_b):
    cnt=0
    moves = {
        (a, b), (-a, -b), (-a, b), (a, -b),
        (b, a), (-b, a), (b, -a), (-b, -a)
    }
    for dx,dy in moves:
        x=k_a+dx
        y=k_b+dy
        hypo1=(x-k_a)**2+(y-k_b)**2

        hypo2=(x-q_a)**2+(y-q_b)**2

        if hypo1==hypo2:
            cnt+=1

    return cnt



t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    k_a, k_b = map(int, input().split())
    q_a, q_b = map(int, input().split())
    
    print(helper(a, b, k_a, k_b, q_a, q_b))