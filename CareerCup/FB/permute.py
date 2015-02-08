def permute(word,map,index):
	if index==len(word):
		print ''.join(word)
	else:
		backup = word[index]
		for ch in map[word[index]]:
			word[index]=ch
			permute(word,map,index+1)
			word[index]= backup

map={}
map['a'] =['a','A','@']
map['b'] = ['b','B',';']
map['c'] = ['c','C']
map['d'] = ['d','D']
permute(list("bda"),map,0)
