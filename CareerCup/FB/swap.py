def swap(a,b):
	a = a^b
	b = a^b
	a = a^b
	return (a,b)
	
(a,b) =swap(10,11)
print a,b

