def ranger(ar,key,start,end):
	start1=0
	start2=0
	end1=len(ar)-1
	end2 = len(ar)-1
	foundLeft = False
	foundRight = False
	while foundLeft==False and start1<=end1:
		mid1= (start1+end1)/2
		print "current mid1", mid1
		if ar[mid1]==key:
			if mid1==0:
				foundLeft==True
			else:
				if ar[mid1-1]!=key:
					foundLeft=True
				else:
					end1= mid1-1	
		else:
			if ar[mid1]>key:
				end1 = mid1-1
			else:
				print "updating start1"
				start1 = mid1+1

	print "found left", mid1

	while foundRight==False:
		mid2 = (start2+end2)/2
		if ar[mid2]==key:
			if mid2==len(ar)-1:
				foundRight=True
			else:
				if ar[mid2+1]!=key:
					foundRight=True
				else:
					start2=mid2+1	
		else:
			if ar[mid2]>key:
				end2= mid2-1
			else:
				start2 = mid2+1
			
	print mid1,mid2	

ar=map(int,[1,23,4123,11,32,3,23,432,23,423,423,4])
ar = sorted(ar)
print ar
ranger(ar,23,0,len(ar)-1)
