def printBetween(node,left_val,right_val):
		if node == None:
			return
		if left_val<node.value:
			printBetween(node.left,left_val,right_val)
		if node.value>left_val and node.value<right_val:
			print node.value
		if right_val>node.value:
			printBetween(node.right,left_val,right_val)

found = False
def printBetween2(node,left_val,right_val):
		if node == None:
			return
		printBetween2(node.left,left_val,right_val)
		if node.value == left_val:
			found =True
		if node.value == right_val:
			found = False
			return
		if found == True:
			print node.value
		printBetween(node.right,left_val,right_val)
	
		
		
