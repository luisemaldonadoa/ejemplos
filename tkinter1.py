# -*- coding: utf-8 -*-
#nota: si no se coloca la linea 1, al ejecutar en windows este codigo, ocurre un error de codificacion.
#se esta utilizando TKinter para version 2.7 de python para la version 3 al parecer solo cambia el nombre de
#TKinter a tkinter
#este codigo muestra una ventana simple en tkinter
#tambien recibe parametros y son impresos en consola por medio de sys.argv
#para imprimir los parametros enviados es necesario importar: import sys
#para hacer una ventana es necesario importar TKinter: from TKinter import *
#Ejemplos de uso:
#python tkinter1.py 'saludo de luis parametro'
#python tkinter1.py
import sys
from Tkinter import *
print sys.getdefaultencoding() #imprime la codificacion por default
if len(sys.argv) > 1:
	print sys.argv[1] 
else:
	print sys.argv[0]
ventana=Tk()
texto=Label(ventana,text="¡Hola Mundo!, se muestran los parametros en consola, \n use el comando: python tkinter1.py 'saludo de luis parametros'")
texto.pack()
ventana.mainloop()