public class unorderDuplicate
{
    public static int[] duedupliate(int[] array) {
//       VALIDATION
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
//            SETUP
        int[] newArray = new int[array.length];
        int count = 0;

//            LOGIC
        int value = 0;
        for (int i = 0; i < array.length; i++) {
         if(!contains(array, value,count)) {
             newArray[count] = value;
             count++;
         }

        }
        shrink(newArray,count);
        return newArray;
    }

    public static boolean contains(int[] array, int value, int pos) {
//        VALIDATION
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        //int count = 0;
        if ( pos >= array.length) {
            throw new IndexOutOfBoundsException("Count cannot be less than 0");
        }
//     LOGIC
        for (int i = 0; i < pos; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
    public static int [] shrink(int[] array, int count ){
//        VALIDATION
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (count < 0 || count >= array.length) {
            throw new IndexOutOfBoundsException("Count cannot be less than 0");
        }

//    SETUP
        int [] newerArray = new int[count];

        for (int i = 0; i < newerArray.length; i++) {
            newerArray[i] = array[i];
        }
        return newerArray;
    }
}

