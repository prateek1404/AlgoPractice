def fibonacci(n):
	a =1
	b =1
	i=2
	while i<n:
		result = a+b
		print result
		a = b
		b = result
		i+=1	

fibonacci(5)
