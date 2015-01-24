# Enter your code here. Read input from STDIN. Print output to STDOUT

N,M = map(int,raw_input().split(" "))
A = map(int, raw_input().split(" "))
B = map(int, raw_input().split(" "))

dp = [[0 for j in range(0,M+1)] for i in range(0,N+1)]
for i in range(0,N+1):
    for j in range(0,M+1):
        if i==0 or j ==0:
            dp[i][j]=0
        else:
            if dp[i-1]==dp[j-1]:
                dp[i][j] = 1+ dp[i-1][j-1]
            else:
                dp[i][j] = max(dp[i][j-1],dp[i-1][j])

print dp                
i = N
j= M
seq = []
while i>0 and j>0:
    if dp[i][j] == dp[i-1][j-1]+1:
        seq.insert(0,A[i-1])
        i= i-1
        j= j-1
    else:
        if dp[i][j]==dp[i-1][j]:
            i = i-1
        else:
            j = j-1
    
print seq


