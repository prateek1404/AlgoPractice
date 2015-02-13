def minRoute(grid):
	M = len(grid)
	N = len(grid[0])
	dp = [[0 for i in range(0,len(grid[0]))] for j in range(0,len(grid))]
	dp[0][0] = grid[0][0]
	for i in range(0,M):
		for j in range(0,N):
		  if i==0 or j==0:
			if i==0:
				dp[i][j] = dp[i][j-1]+grid[i][j]
			if j==0:
				dp[i][j] = dp[i-1][j]+grid[i][j]
		  else:
			dp[i][j] = grid[i][j]+min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])
	print dp
	print dp[M-1][N-1]	
			
			
		




M = input()
N = input()
grid = []
for i in range(0,M):
	grid.append(map(int,raw_input().split(' ')))
minRoute(grid)
