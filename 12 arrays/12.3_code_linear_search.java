public class code_linear_search {
    public static int linearSearch(int marks[], int key){
        for(int i=0; i<marks.length; i++){
            if (marks[i]==key) {
                System.out.println("key found at index " + i);
                
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {14,25,36,96,85,74};
        int key = 96;
        int index = linearSearch(marks, key);

        
        if(index== -1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index = " + index);
        }

        
    }
    
}
