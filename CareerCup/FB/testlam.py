import random
ranking =[]

for i in range(0,26):
	ranking.append((chr(ord('a')+i),int(random.random()*100)))

for i in ranking:
	print i

ranking =sorted(ranking,key=lambda rank:rank[1])
for i in ranking:
	print i

