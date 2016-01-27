#while
print "\nWhile: \n"
x=0
while x<20:
	x=x+1
	print x

print "\n total: "+str(x)+ "\n"

#for
print "\nFor1: \n"
for i in range(-9,10):
	if i==0:
		continue
	if i==8:
		break
	print i

print "\nFor2: \n"
#for
word=""
count=0
for letter in "Python":
	count+=1
	#print len("Python")
	if len("Python")==count:
		word=word+letter
	else:
		word=word+letter+"_"
	
print word