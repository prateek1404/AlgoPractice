def paranthesis(left,right,str):
	if left==0 and right==0:
		print str
	if left>right:
		return
	if left>0:
		paranthesis(left-1,right,str+"(")
	if right>0:
		paranthesis(left,right-1,str+")")
	

paranthesis(4,4,"")
