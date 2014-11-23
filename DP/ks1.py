weights=[1,2,3,4,5,6,7,8,9,10]
values=[3,7,6,5,1,2,9,10,4,8]
N= input()
dp = [[0 for row in range(0,N+1)] for col in range(0,10)]
print dp
for i in range(0,N):
 dp[0][i]=0
for i in range(0,10):
 dp[i][0]=0;

for i in range(0,10):
 for j in range(1,N+1): 
  if weights[i]<=j:
   dp[i][j] = max(dp[i-1][j],dp[i-1][j-weights[i]]+values[i])
   print "hello"
   print dp[i][j]
  else:
   dp[i][j] = dp[i-1][j]
print dp
print dp[9][N]

def max(a,b):
 if a>b:
  return a
 else:return b
