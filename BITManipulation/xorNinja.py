# Enter your code here. Read input from STDIN. Print output to STDOUT

def allSubsets(ar,boolArray,subsets,i):
    if i==len(ar):
        return
    boolArray[i]=True
    subsets.append(returnSet(ar,boolArray))
    allSubsets(ar,boolArray,subsets,i+1)
    boolArray[i]=False
    allSubsets(ar,boolArray,subsets,i+1)

def allSubsets(ar,boolArray,subsets,i):
    if i==len(ar):
        return
    boolArray[i]=True
    subsets.append(returnSet(ar,boolArray))
    allSubsets(ar,boolArray,subsets,i+1)
    boolArray[i]=False
    allSubsets(ar,boolArray,subsets,i+1)
    

     
def returnSet(ar,boolArray):
    global totalSum
    singleset = []
    xor =0
    for i in range(0,len(boolArray)):
        if boolArray[i]==True:
            xor = xor^ar[i]
            singleset.append(ar[i])
    totalSum+=xor
    if len(singleset)==0:
        return None
    return singleset

totalSum=0
T = input()
while T>0:
    N = input()
    ar = map(int,raw_input().split(' '))
    subsets=[]
    boolArray = [False for i in range(0,N)]
    totalSum=0
    sum=0
    print totalSum
    T-=1

    
   
