def fibo(N):
	result =1
	a =1
	b= 0
	for i in range(0,N):
		result = a+b
		a = b
		b = result
	return result

def fiboRecurse(N):
	if N<=2:
		return 1
	else:
		return fiboRecurse(N-1)+fiboRecurse(N-2)

def fact(N):
	if N<=1:
		return 1
	else:
		return N*fact(N-1)

print fact(input())
