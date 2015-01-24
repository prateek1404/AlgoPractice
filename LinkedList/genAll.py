def gen(ar,n):
	if n==len(ar):
		print ar
	else:
		for i in range(n,len(ar)):
			swap(ar,0,i)
			gen(ar,n+1)
			swap(ar,0,i)

def swap(ar,a,b):
	temp = ar[a]
	ar[a]= ar[b]
	ar[b] =temp

ar = [0,1,2,3]
gen(ar,0)






