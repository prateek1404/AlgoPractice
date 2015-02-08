def random_triplet(ar,index,hash):
	if index==3:
		isvalid(ar[:3],hash)
	else:
		for i in range(index,len(ar)):
			swap(ar,index,i)
			random_triplet(ar,index+1,hash);
			swap(ar,index,i)

def swap(ar,a,b):
	temp =ar[a]
	ar[a] =ar[b]
	ar[b] = temp

def isvalid(ar,hash):
	if hash[ar[0]]< hash[ar[1]]<hash[ar[2]]:
		print ''.join(ar)

word = raw_input()
hash ={}
for i in range(0,len(word)):
	if word[i] not in hash:
		hash[word[i]]=i
random_triplet(list(word),0,hash)
