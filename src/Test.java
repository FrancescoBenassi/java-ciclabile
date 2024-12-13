public class Test {

    public static void main(String[] args) {
        int[] numberList = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
        List numberListArrayList = new List(numberList);
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        numberListArrayList.setAddElemento(30);
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());
        numberListArrayList.setAddElemento(17);
        System.out.println(numberListArrayList.getElementoSuccessivo());
        System.out.println(numberListArrayList.hasAncoraElementi());

        // Ciclo per leggere tutti i valori all'interno dell'Array numberListArrayList

        if (numberListArrayList.getIndexArray() != 0) {
            numberListArrayList.setResetIndexArray();
            for (int i = 0; i < numberListArrayList.getNumberListLenght(); i++) {
                System.out.println(numberListArrayList.getElementoSuccessivo());
            }
        } else {
            for (int i = 0; i < numberListArrayList.getNumberListLenght(); i++) {
                System.out.println(numberListArrayList.getElementoSuccessivo());
            }
        }
    }
}
