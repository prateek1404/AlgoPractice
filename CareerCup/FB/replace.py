def remove_letters(word):
	result =[]
	for i in word:
		if isLetter(i):
			result.append(i)
	return ''.join(result)

def isLetter(ch):
	if ch>='a' and ch<='z':
		return True
	if ch>='A' and ch<='Z':
		return True
	
	return False
	
print remove_letters(raw_input())
