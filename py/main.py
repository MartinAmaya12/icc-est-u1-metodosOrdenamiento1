from sortSelection import SortSelection
def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Nombre: Martin Amaya")
    print("Original: ", numeros)

    #Instanciar clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado ", numeros)

    selection.sort_decendente(numeros)
    print("Ordenado descendente ",numeros)
if __name__=="__main__":
    main()
