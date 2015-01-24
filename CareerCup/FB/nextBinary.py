def nextBinary(num):
	mask=1
	found1=False
	counter=0
	ans= num
	while(found1==False):
		if num&mask!=0:
			ans= num-(2**counter)
			found1=True
			break
		else:
			mask=mask<<1
		counter= counter+1
	if found1==True:
		mask2=1<<counter
		while num&mask2!=0:
			mask2= mask2<<1
			counter+=1
		ans= ans+2**counter
	return ans

def previousBinary(num):
	mask=1
	counter=0
	while num&mask!=0:
		counter=counter+1
		mask = mask<<1
	num= num+2**counter
	mask= mask<<1
	while num&mask!=1:
		counter= counter+1
		mask= mask<1
	num = num-2**counter
	return num
ans=nextBinary(12)
ans1= previousBinary(12)
print ans
print ans1
				
					
