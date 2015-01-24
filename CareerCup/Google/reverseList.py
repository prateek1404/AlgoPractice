def reverseList(n):
	prev = None
	current = n
	while current!=None:
		right = current.right
		current.right = prev
		prev = current
		current = right
	return current
		
