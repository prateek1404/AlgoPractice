def nextBinary(num):
	mask=1
	found1=False
	counter=0
	ans= num
	while(found1==False):
		print "hello"
		if num&mask!=0:
			ans= num-2**counter
			found1=True
			break
		else:
			mask=mask<<1
		counter= counter+1

	if found1==True:
		mask2=1<<counter
		while num&mask==0:
			mask= mask<<1
			counter+=1
		ans= ans+2**counter
	return ans

ans=nextBinary(6)
print ans

				
					
