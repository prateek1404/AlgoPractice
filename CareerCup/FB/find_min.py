import sys
def find_min(source,target):
	map={}
	for i in target:
		if i not in map:
			map[i]=1
		else:
			map[i]=map[i]+1
	min_diff = sys.maxint
	found_start = False
	start_index = 0
	for i in range(0,len(source)):
		if source[i] in map:
			if  not found_start:
				found_start=True
				start_index = i
			map[source[i]]-=1
			if check_all_zero(map):
				min_diff = i-start_index
				break
	print map
	print i
	print start_index
	start =start_index 
	end =i
	while start_index!=len(source):
		missing_char = source[start_index]
		start_index+=1
		while start_index!=len(source) and source[start_index] not in map:
			start_index+=1
		if start_index==len(source):
			break
		
		while i<len(source) and source[i]!= missing_char:
			i+=1
		if i==len(source):
			break
		if start_index!=len(source) and i-start_index<min_diff:
			min_diff = i-start_index
			start = start_index
			end = i
	print source[start:end+1]
	return min_diff+1

def check_all_zero(map):
	for i in map:
		if map[i]!=0:
			return False
	return True
print find_min(raw_input(),raw_input());		
