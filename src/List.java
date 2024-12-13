public class List {

    protected int[] numberList = {1,2,3,4,5,6,7,8};
    int i = 0;
    
    public int getElementoSuccessivo(){
        i++;
        return numberList[-1 + i];
    }

    

}
