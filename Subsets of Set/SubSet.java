import java.util.*;
public class SubSet{
    public static void PrintSub(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " "); 
        }
        System.out.println();
    }
    
    public static void FindSub(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            return;
        }
        
        //to add
        subset.add(n);
        FindSub(n-1, subset);
        
        //not to add
        subset.remove(subset.size()-1);
        FindSub(n-1, subset);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        FindSub(n, subset);
    }
}