# -*- coding: utf-8 -*-
import sys
from Tkinter import *
app = Tk()
app.title("Aplicacion grafica en python")
etiqueta = Label(app, text="Hola mundo!!!")
boton = Button(app, text="OK!!")
etiqueta2 = Label(app, text="otra etiqueta")
etiqueta.pack()#si no se agrega la etiqueta.pack() el controlo no se agrega a la ventana de tkinter
boton.pack()
etiqueta2.pack()
app.mainloop()#si no se coloca el mainloop no se muestra la ventana