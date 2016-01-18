#domino con cadenas
print 'dominocadenas.py'
def jugardomino(ficha1,ficha2):
	fichaa=ficha1.split('-',1)
	fichab=ficha2.split('-',1)
	#print fichaa[1]
	posible='Si es posible'
	noposible='No es posible'
	print fichaa[0]
	if (fichaa[0]==fichab[0]):
		print posible
	elif (fichaa[0]==fichab[1]):
		print posible
	elif (fichaa[1]==fichab[0]):
		print posible
	else:
		print noposible
	#print ficha1,ficha2

ficha1='3-1'
ficha2='36-2'
jugardomino(ficha1,ficha2)