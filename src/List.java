public class List {

    private int[] numberList;
    private int indexArray = 0;

    // Costruttore che passa come parametro un array di interi

    public List(int[] numberList) {
        this.numberList = numberList;
    }

    // Costruttore che non passa alcun dato

    public List() {

    }

    // Metodo che ritorna la lunghezza dell'Array

    public int getNumberListLenght() {
        return numberList.length;
    }

    // Metodo per avere il valore di indexArray

    public int getIndexArray() {
        return indexArray;
    }

    // Metodo per settare a 0 il valore di indexArray

    public void setResetIndexArray() {
        indexArray = 0;
    }

    // Metodo per avere il valore successivo all'interno dell'Array

    public int getElementoSuccessivo() {
        this.indexArray++;
        if (this.numberList.length >= indexArray) {
            return this.numberList[-1 + indexArray];
        } else {
            this.indexArray--;
            return this.numberList[-1 + indexArray];
        }
    }

    // Metodo per sapere se è presente l'elemento successivo all'interno dell'Array

    public boolean hasAncoraElementi() {
        boolean result = false;
        if (this.numberList.length >= this.indexArray + 1) {
            result = true;
        }
        return result;
    }

    // Metodo per aggiungere un valore all'interno dell'Array

    public void setAddElemento(int number) {
        int[] newArray = new int[this.numberList.length + 1];
        int numberListLenght = this.numberList.length;
        for (int i = 0; i < numberListLenght; i++) {
            newArray[i] = this.numberList[i];
        }
        newArray[numberListLenght] = number;

        this.numberList = newArray;

    }

}
