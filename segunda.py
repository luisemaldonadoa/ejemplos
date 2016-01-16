# -*- coding: utf-8 -*-
import sys
from Tkinter import *
def hacer_click():
	print 'sin argumentos'
	try:
		print 'entro'
	except ValueError:
		print 'error'

app=Tk()
app.title('Segunda aplicacion')
boton=Button(app,text='boton',command=hacer_click)
boton.pack()
app.mainloop()