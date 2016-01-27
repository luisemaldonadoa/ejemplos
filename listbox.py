from Tkinter import *
def agregar():
	lista1.insert(END,"ENTRADA")
	#lista1.insert(END,)
def remover():
	lista1.delete(0,END)
ventana=Tk()
ventana.title("listbox")
ventana.geometry("700x400+10+10")
lista1=Listbox(ventana)
lista1.insert(1,"Python")
lista1.insert(2,"PHp")
lista1.insert(3,"java")
lista1.insert(4,"c++")
lista1.place(x=10,y=20)
btnAdd=Button(ventana,text="Agregar",command=agregar).place(x=140,y=20)
btnRemove=Button(ventana,text="Delete",command=remover).place(x=200,y=20)

ventana.mainloop()