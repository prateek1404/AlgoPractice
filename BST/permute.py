def permute(word,i):
	if i==len(word)-1:
		print ''.join(word)
	else:
		for k in range(i,len(word)):
			swap(word,i,k)
			permute(word,i+1)
			swap(word,i,k)
	
def swap(ar,a,b):
	temp = ar[a]
	ar[a] = ar[b]
	ar[b] = temp

word = list("help")
permute(word,0)
