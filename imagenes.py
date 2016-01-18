#agregar imagenes con tkinter
from Tkinter import *
ventana=Tk()
ventana.geometry("700x600+0+0")
ventana.config(bg="blue")#background
ventana.title("ejemplo imagenes")
#creamos la imagen
#usando la clase photoimage de tkinter, solo .gif, .pgm o .ppm, no acepta jpg u otro
imagenL=PhotoImage(file="img/img1.gif")
lblImagen=Label(ventana,image=imagenL).place(x=100,y=100)
ventana.mainloop()