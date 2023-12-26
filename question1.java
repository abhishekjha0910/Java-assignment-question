/*Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct. */
public class question1 {
    public static boolean similarity(int num1[]){
        for(int i = 0 ; i<num1.length ; i++){
            for(int j = i+1 ; j<num1.length ; j++){
                if(num1[1] == num1[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num1[] = {1,2,3,1};
        System.out.println(similarity(num1));
    }
}
