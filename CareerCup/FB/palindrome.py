def palindrome(string):
	i=0
	j= len(string)-1
	isPalindrome=True
	while i <=j:
		while string[i].isalnum()!=True:
			i+=1
		while string[j].isalnum()!=True:
			j-=1
		if string[i]!=string[j]:
			isPalindrome=False
			break
		i+=1
		j-=1
	return isPalindrome

print palindrome('ab$$$$cba dfdsf')


