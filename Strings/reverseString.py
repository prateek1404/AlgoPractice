def reverseString(string):
	if len(string)==1:
		return string
	else:
		return reverseString(string[1:])+string[0]

print reverseString("hello")
