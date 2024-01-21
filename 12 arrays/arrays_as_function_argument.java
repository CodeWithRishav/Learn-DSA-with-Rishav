public class arrays_as_function_argument {

    public static void update_marks(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {

        int marks[] = {99,98,97};
        for(int i=0; i<marks.length;i++){
        System.out.print(" " + marks[i] + " ");
    }
    System.out.println();

        // calling update_marks function
        update_marks(marks);
        System.out.println("updated marks = ");
        for(int i=0 ; i<marks.length; i++){
            System.err.print(marks[i] + " ");
        }
        System.out.println();
    }
    
}
