from Tkinter import *

def saludar():
	lblSaludar=Label(ventana,text="hola "+entradaU.get(),
					font=("Agency FB",14)).place(x=10,y=110)

ventana=Tk()
ventana.geometry("500x300+100+100")
ventana.title("Ejemplo con botones")
lblUsuario=Label(text="Usuario:",font=("Agency FB",14)).place(x=10,y=10)
#Campo de texto
entradaU=StringVar()
#entradaU.set("algo")
txtUsuario=Entry(ventana,textvariable=entradaU).place(x=70,y=20)
lblNombre=Label(text="Nombre:",font=("Agency FB",14)).place(x=10,y=50)
#creando campo de texto para Nombre
entradaN=StringVar()
#entradaN.set("luis E")
txtNombre=Entry(ventana,textvariable=entradaN).place(x=70,y=60)
btnSaludar=Button(ventana,command=saludar,text="Saludar",font=("Agency FB",14),width=10).place(x=300,y=70)
btnDespedir=Button(ventana,
					#command=despedir,
					text="Despedir",
					font=("Agency FB",14),
					width=10).place(x=300,y=120)
ventana.mainloop()