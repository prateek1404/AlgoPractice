def coinGame(arr):
	playerA = [ [-1 for i in range(0,len(arr))] for j in range(0,len(arr))]
	playerB = [[-1 for i in range(0,len(arr))] for j in range(0,len(arr))]
	print playerA
	print playerB
	print generate(0,len(arr)-1,arr,playerA,playerB,True)

def generate(start,end,arr,playerA,playerB,myTurn):
	if start>= end or start>=len(arr) or end>=len(arr) or start<0:
		return 0
	else:
		if myTurn==True:
			if playerA[start][end]!=-1:
				return playerA[start][end]
			else:
				option1 = arr[start]+generate(start+1,end,arr,playerA,playerB,False)
				option2= arr[end]+generate(start,end-1,arr,playerA,playerB,False)
				if option1>option2:
					playerA[start][end]= option1
				else:
					playerA[start][end]= option2
			return playerA[start][end]
		else:
			if playerB[start][end]!=-1:
				return playerB[start][end]
			else:
				option1= generate(start+1,end,arr,playerA,playerB,True)
				option2 = generate(start,end-1,arr,playerA,playerB,True)
				if option1>option2:
					playerB[start][end]= option1
				else:
					playerB[start][end]= option2
			return playerB[start][end]	
			

coinGame([1,2,3,4,5])
