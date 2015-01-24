import sys
def bubbleSort(ar):

	for i in range(0,len(ar)):
		for j in range(0,len(ar)-i-1):
			if ar[j]>ar[j+1]:
				ar=swap(ar,j,j+1)
	return ar

def swap(ar,i,j):
	temp = ar[i]
	ar[i]= ar[j]
	ar[j]= temp
	return ar
sys.argv.pop(0)
print bubbleSort(map(int,sys.argv))
