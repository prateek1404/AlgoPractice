# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
def DFS(visited,i,count):
	visited[i]= True
	sccCount[count]+=1
	for j in adjList[i]:
		if visited[j]==False:
			DFS(visited,j,count)

N,l = map(int,raw_input().split())
adjList = []
visited = []
for i in range(0,N):
    adjList.append([])   
    visited.append(False)

for i in xrange(l):
    a,b = map(int,raw_input().split())
    # Store a and b in an appropriate data structure
    adjList[a].append(b)
    adjList[b].append(a)

sccCount=[]
count=0
for i in range(0,N):
	if visited[i] == False:
		sccCount.append(0)
		DFS(visited,i,count)
		count+=1
#print visited
#print sccCount
sumel =0
sum2=0

for i in range(0,len(sccCount)):
	sumel+=sccCount[i]
	sum2 += math.pow(sccCount[i],2)
result=0
for i in range(0,len(sccCount)):
	result += (sccCount[i]*sumel)

result-=sum2
result = result/2
print int(result)
#for i in range(0,len(sccCount)-1):
	#for j in range(i+1,len(sccCount)):
	#	sum+=(sccCount[i]*sccCount[j])

#print sum


