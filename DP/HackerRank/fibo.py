import math
A,B,N= map(int,raw_input().split(" "))

dp = [0 for i in range(0,N)]
dp[0]=A
dp[1]=B
for i in range(2,N):
    dp[i] = long(math.pow(dp[i-1],2)) +dp[i-2]
print dp
print dp[N-1]
