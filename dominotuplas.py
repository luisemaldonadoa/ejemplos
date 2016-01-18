def jugardomino(ficha1,ficha2):
	posible='Si es posible'
	noposible='No es posible'
	print ficha1[0]
	if (ficha1[0]==ficha2[0]):
		print posible
	elif (ficha1[0]==ficha2[1]):
		print posible
	elif (ficha1[1]==ficha2[0]):
		print posible
	else:
		print noposible

	#print ficha1,ficha2
ficha=(2,1)
ficha2=(3,4)
#print ficha, ficha2
jugardomino(ficha,ficha2)

