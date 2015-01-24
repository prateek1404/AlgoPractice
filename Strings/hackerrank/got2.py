import math
string = raw_input()
 
found = False
# Write the code to find the required palindrome and then assign the variable 'found' a value of True or False
hashTable = {}
for i in string:
    if i in hashTable:
        hashTable[i]=hashTable[i]+1
    else:
        hashTable[i]=1
oddCount=0
#print hashTable
totalPairs=0
totalDifferent=0
peralpha=[]
for key in hashTable:    
    totalPairs+=(hashTable[key]/2)
    peralpha.append(hashTable[key]/2)
        
num = math.factorial(totalPairs)
num2=1
for i in peralpha:
    num2 = num2* math.factorial(i)
print (num/num2)%int(math.pow(10,9)+7)

