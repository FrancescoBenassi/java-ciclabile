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

    // Metodo per leggere tutti i valori all'interno dell'Array numberList

    public int[] writeAndGetTuttiElementi(){
        for (int i = 0; i < this.numberList.length; i++) {
            System.out.println(this.numberList[i]);
        }
        return this.numberList;
    }

    // Metodo che ritorna la lunghezza dell'Array

    public int getNumberListLenght() {
        return this.numberList.length;
    }

    // Metodo per avere il valore di indexArray

    public int getIndexArray() {
        return this.indexArray;
    }

    // Metodo per settare a 0 il valore di indexArray

    public void setResetIndexArray() {
        this.indexArray = 0;
    }

    // Metodo per avere il valore successivo all'interno dell'Array

    public int getElementoSuccessivo() {
        int el = this.numberList[indexArray];
        this.indexArray++;
        return el;
        // this.indexArray++;
        // if (this.numberList.length >= indexArray) {
        //     return this.numberList[-1 + indexArray];
        // } else {
        //     this.indexArray--;
        //     return this.numberList[-1 + indexArray];
        // }
    }

    // Metodo per sapere se è presente l'elemento successivo all'interno dell'Array

    public boolean hasAncoraElementi() {
        if(this.numberList.length == 0) return false;
        return this.indexArray < this.numberList.length;
        // if (this.numberList.length >= this.indexArray + 1) {
        //     return true;
        // }
        // return false;
    }

    // Metodo per aggiungere un valore all'interno dell'Array

    public void addElemento(int number) {
        int[] newArray = new int[this.numberList.length + 1];
        int numberListLength = this.numberList.length;
        for (int i = 0; i < numberListLength; i++) {
            newArray[i] = this.numberList[i];
        }
        newArray[numberListLength] = number;

        this.numberList = newArray;

    }

}
