public class List {

    protected int[] numberList = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int indexArray = 0;

    // public int getTuttiElementi(){
    // for (int number : numberList) {
    // return numberList[number];
    // }

    // }

    public int getElementoSuccessivo() {
        indexArray++;
        if (numberList.length >= indexArray) {
            return numberList[-1 + indexArray];
        } else {
            indexArray--;
            return numberList[-1 + indexArray];
        }
    }

    public boolean hasAncoraElementi() {
        boolean result = false;
        if (numberList.length >= indexArray + 1) {
            result = true;
        }
        return result;
    }

}
