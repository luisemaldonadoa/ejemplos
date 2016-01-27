class Antena(object): 
    color = "" 
    longitud = "" 
 
class Pelo(object): 
    color = "" 
    textura = "" 
 
class Ojo(object): 
    forma = "" 
    color = "" 
    tamanio = ""

class Objeto(object): 
    color = "blue" 
    tamanio = "grande" 
    aspecto = "feo" 
    antenas = Antena() # propiedad compuesta por el objeto objeto Antena
    ojos = Ojo()       # propiedad compuesta por el objeto objeto Ojo
    pelos = Pelo()     # propiedad compuesta por el objeto objeto Pelo
    def flotar(self):
        pass
        print "hola"
et=Objeto()
print et.color
print et.tamanio
print et.aspecto
print et.flotar()