m = input()
n = input()

print m
print n

A = {}
for i in xrange(0,m+1):
 A[i] = {}
 for j in xrange(0,n+1):
  if i ==0 and j ==0:
   A[i][j]=0;
  elif j==0:
   A[i][j] =1;
  elif i==0:
   A[i][j]=1
  else:
   A[i][j] = A[i-1][j] +A[i][j-1]
print A[m-1][n-1]
  
