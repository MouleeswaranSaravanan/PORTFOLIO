def spiralOrder(arr):
    ans=[]
    while arr:
        ans+=arr.pop(0)
        arr= (list(zip(*arr)))[::-1]
    return ans
arr=[]
n,m=map(int,input().split())
for i in range(n):
    arr.append(list(map(int,input().split())))
print(*spiralOrder(arr))