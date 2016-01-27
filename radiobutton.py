from Tkinter import *
def estado():
	#print "estado funcionando"
	s=selec.get()
	messagebox.showinfo(title="ti diagnostico",message=s)#no funciona el messagebox

ventana=Tk()
ventana.geometry("700x300+0+0")
ventana.title("Ejemplo de Radio button")
selec=IntVar()#variable que agrupara los radio button
#Creando radio button
lblAnimo=Label(ventana,text="Como te sientes?").place(x=100,y=70)
rdBAnimoE=Radiobutton(ventana,text="Excelente",value=1,variable=selec,command=estado).place(x=100,y=110)
rdBAnimoB=Radiobutton(ventana,text="Bien",value=2,variable=selec,command=estado).place(x=100,y=130)
rdBAnimoM=Radiobutton(ventana,text="Mal",value=3,variable=selec,command=estado).place(x=100,y=150)
ventana.mainloop()
