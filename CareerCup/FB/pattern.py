def func(string):
	ar = list(string)
	output=[]
	if(len(ar))==0:
		return
	else:
		count=1
		current = ar[0]
		i=1
		while(i<len(ar)):
			if ar[i]==current:
				count+=1
			else:
				output.append(str(count))
				output.append(str(current))
				count=1
				current = ar[i]
			i+=1
		output.append(str(count))
		output.append(str(current))
	return "".join(output)


N= input()
print 1
N-=1
prev= str(1)
while(N>0):
	next = func(prev)
	print next
	prev = next
	N-=1 
