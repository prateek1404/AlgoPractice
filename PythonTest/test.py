class ABC(object):
	def __init__(self,id,name):
		self.name=name
		self.id = id
	def __hash__(self):
		return hash(self.id)+hash(self.name)

	def __eq__(self,other):
		if  self.id==other.id and self.name==other.name:
			return True
		else:
			return False
a = ABC(1,2)
d={}
d[a]= "exists"
b = ABC(1,2)

if b in d:
	print "key exists in dict"
else:
	print "key doesnt exist in dic"

