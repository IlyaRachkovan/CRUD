public class Redactor {

    public String[] create(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return arr;
            }
        }
        return arr;
    }

    public void read(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }


    public void read(String[] arr, int index) {
        System.out.println();
        if (checkIndex(arr, index)){
            System.out.println("Value: " + arr[index]);
        }

    }

    private boolean checkIndex(String[] arr, int index) {
        boolean checker = index < arr.length - 1 && index >= 0;
        if (!checker) System.out.println("Incorrect index " + index);
        return checker;
    }

    public String[] update (String[] arr, int index, String value){
        if (checkIndex(arr, index)){
            arr[index] = value;
        }
        return arr;
    }

    public String [] delete (String[] arr, int index){
        if (checkIndex(arr, index)){
            arr[index] = null;
        }
        return arr;
    }

}



