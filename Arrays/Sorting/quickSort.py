
def partition_fn(ar,start,end):
	print ar, start, end
        pivot = ar[start]
        starti= start
        while start<=end and start<len(ar) and end>=0 :
		print start, end
                while start<len(ar) and ar[start]<=pivot:
                        start+=1
                while end>=0 and ar[end]>pivot :
                        end-=1
                if start<=end:
                        swap(ar,start,end)
			start+=1
	                end-=1
                else:
                        break
	swap(ar,starti,end)
        return end

def swap(ar,a,b):
        temp = ar[a]
        ar[a]= ar[b]
        ar[b]= temp

def quick_sort(ar,start,end):
	if start>=end:
		return
	else:
		partition = partition_fn(ar,start,end)
		if start<partition-1:
			quick_sort(ar,start,partition-1)
		if end>partition+1:
			quick_sort(ar,partition+1,end)


import sys
sys.argv.pop(0)
a= map(int,sys.argv[:])
quick_sort(a,0,len(a)-1)
for i in a:
	print i
