# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys
sys.setrecursionlimit(1000000)
# Enter your code here. Read input from STDIN. Print output to STDOUT
def isPalindrome(word):
    for i in range(0,len(word)/2):
        if word[i]!=word[len(word)-i-1]:
            return False
        
    return True

def removeWord(word,i):
    if isPalindrome(word):
        return -1
    while i<len(word):
        if isPalindrome(word[:i]+word[i+1:]):
            return i
        else:
            i+=1
    return -1

def removeRecurse(word,i,j):
    if i>=j:
        return -1
    else:
        if word[i]==word[j]:
            return removeRecurse(word,i+1,j-1)
        else:
            if removeRecurse(word,i+1,j)==-1:
                return i
            else:
                return j

def removeWord2(word,k):
    if isPalindrome(word):
        return -1
    i=0
    j=len(word)-1
    while i<j:
        if word[i]==word[j]:
            i+=1
            j-=1
        else:
            if i+1<len(word) and word[i+1]==word[j]:
                return i
            else:
                return j
        i+=1
        j-=1
            
    return -1
       
       
word = open("test1").read().replace('\n','')
#index = removeWord2(word,0)
index = removeRecurse(word,0,len(word)-1)
print index
