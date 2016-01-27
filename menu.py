from Tkinter import *
def abrir():
	#messagebox.shoinfo(title="ehhh",message="click en abrir")
	ventAbrir=Tk()
	ventAbrir.geometry("400x200+100+100")
	ventAbrir.title("otra ventana")
	ventAbrir.mainloop()

ventana=Tk()
ventana.geometry("600x300+0+0")
ventana.title("menus")
##Receta para crear menus##
#paso 1 Barra de menus
barraMenu=Menu(ventana)
#paso 2 Crear los menus
mnuArchivo=Menu(barraMenu)
mnuEdicion=Menu(barraMenu)
#paso 3 crear los comandos de los menus
mnuArchivo.add_command(label="Abrir",command=abrir)
mnuArchivo.add_command(label="Nuevo")
mnuArchivo.add_command(label="Guardar")
mnuArchivo.add_command(label="Cerrar")
mnuArchivo.add_separator()
mnuArchivo.add_command(label="Salir",command=ventana.destroy)
########
mnuEdicion.add_command(label="Copiar")
mnuEdicion.add_command(label="Pegar")
mnuEdicion.add_separator()
mnuEdicion.add_command(label="Deshacer")
mnuEdicion.add_command(label="Rehacer")
#Paso 4 Agregar menus a la barra de menus
barraMenu.add_cascade(label="Archivo",menu=mnuArchivo)
barraMenu.add_cascade(label="Edicion",menu=mnuEdicion)
#Paso 5 Indicar que la barra de menus estara en la ventana
ventana.config(menu=barraMenu)
ventana.mainloop()
