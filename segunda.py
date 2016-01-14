# -*- coding: utf-8 -*-
import sys
from Tkinter import *
def hacer_click():
	print 'sin argumentos'

app=Tk()
app.title('Segunda aplicacion')
boton=Button(app,text='boton',command=hacer_click)
boton.pack()
app.mainloop()