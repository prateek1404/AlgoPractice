class Item:
	def __init__(self,keys,val):
		self.keys=keys
		self.value= val
		for i in keys:
			ItemOperator.keyvalMap[i]=val
			if val in valkeyMap:
				valkeyMap[val].append(i)
			else:
				valkeyMap[val]=[]
				valkeyMap[val].append(i)

class ItemOperator:
	keyvalMap={}
	valkeyMap={}	
	def __init__(self):
		print "Initializing"
	def search(key):
		return keyvalMap[key]
	
	def delete(key):
		#should delete an Item object
		val = keyvalMap[key]
		for key in valkeyMap[val]:
			del keyvalMap[key]
		del valkeyMap[val]
				
	def insert(key,item):
					

