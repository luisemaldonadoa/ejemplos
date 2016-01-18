import Tkinter
def funcion():
    root.iconify()
    time.sleep(5)
    root.deiconify()

root=Tkinter.Tk()
boton=Tkinter.Button(root,text="nuevo",command=root.iconify)#minimiza la ventana de root
boton.pack()
root.mainloop()

root2 = Tkinter.Tk()
boton = Tkinter.Button(root, text="Minimizar", command=funcion)
boton.pack()
root.mainloop()