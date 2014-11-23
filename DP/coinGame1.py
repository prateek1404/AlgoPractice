def coinGame(ar):
	player1Starts=[[-1 for i in range(0,len(ar))] for i in range(0,len(ar))]
	player2Starts=[[-1 for i in range(0,len(ar))] for i in range(0,len(ar))]
	print player1Starts
	print player2Starts
	print generate(ar,0,len(ar)-1,player1Starts,player2Starts,True)

def generate(ar,start,end,player1Starts,player2Starts,firstStarts):
	if start>=end or start>=len(ar) or end>=len(ar) or start<0:
		return 0
	else:
		if firstStarts==True:
			if player1Starts[start][end]!=-1:
				return player1Starts[start][end]
			else:
				option1 = ar[start]+ generate(ar,start+1,end,player1Starts,player2Starts,False)
				option2= ar[end]+ generate(ar,start,end-1,player1Starts,player2Starts,False)
				if option1>option2:
					player1Starts[start][end]= option1
				else:
					player1Starts[start][end]= option2
				return player1Starts[start][end]
		else:
			if player2Starts[start][end]!=-1:
				return player2Starts[start][end]
			else:
				option1 = ar[start]+generate(ar,start+1,end,player1Starts,player2Starts,True)
				option2 = ar[end]+generate(ar,start,end-1,player1Starts,player2Starts,True)
				if option1>option2:
					player2Starts[start][end]= option1
				else:
					player2Starts[start][end]= option2
				return player2Starts[start][end]			

coinGame([1,2,3,4,5])
