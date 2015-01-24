# Enter your code here. Read input from STDIN. Print output to STDOUT
T = input()
while T>0:
    word = raw_input()
    wordList = list(word)
    end= len(wordList)-1
    found = False
    while end>=0:
        i = end
        al = wordList[i]
	i-=1
        while i>=0:
            if wordList[i]<al:
                temp = wordList[i]
                wordList[i]=al
                wordList[end]=temp
                break
            i-=1
        if ''.join(wordList)==word:
	    end-=1
            continue
        else:
            found =True
            print ''.join(wordList[:i+1]+sorted(wordList[i+1:]))
            break;
        if found ==True:
            break
        end-=1
    if found ==False:
        print "no answer"
    T-=1
