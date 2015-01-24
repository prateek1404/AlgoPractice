T = input()
while T>0:
    word = raw_input()
    wordList = list(word)
    i= len(wordList)-2
    al = wordList[-1]
    while i>=0:
        if wordList[i]<al:
            temp = wordList[i]
            wordList[i]=al
            wordList[-1]=temp
            break
        i-=1
     
    if ''.join(wordList)==word:
        print "no answer"
    else:
        print ''.join(wordList[:i+1]+sorted(wordList[i+1:]))
    
    T-=1
