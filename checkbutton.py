from Tkinter import *
def lenguajes():
	c=selC.get()
	java=selJAVA.get()
	ruby=selRUBY.get()
	print "lenguaje C... "+str(c)
	print "lenguaje java... "+str(java)
	print "lenguaje ruby... "+str(ruby)
	global cadena
	cadena=""
	if c==1:
		cadena=cadena+ "C, "
	if java==1:
		cadena=cadena+ " java, "
	if ruby==1:
		cadena=cadena+" ruby, "
	print "Conoces:"+cadena
	
ventana=Tk()
ventana.geometry("700x300+0+0")
ventana.title("Ejemplo checkbutton")
lblPregunta=Label(ventana,text="Lenguajes de programacion que conoces: ").place(x=100,y=40)
selC=IntVar()
selJAVA=IntVar()
selRUBY=IntVar()
chkC=Checkbutton(ventana,text="C",variable=selC,onvalue=1,offvalue=0).place(x=100,y=70)
chkjava=Checkbutton(ventana,text="java",variable=selJAVA,onvalue=1,offvalue=0).place(x=100,y=90)
chkruby=Checkbutton(ventana,text="Ruby",variable=selRUBY,onvalue=1,offvalue=0).place(x=100,y=110)
boton=Button(ventana,text="Cuales seleccione?",command=lenguajes).place(x=100,y=140)
ventana.mainloop()