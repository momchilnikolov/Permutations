package Permutations;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        if(args.length == 1){
            StringPermutation permute = new StringPermutation();
            permute.permutation(args[0]);
        } else if(args.length > 1)
        {
            HeapAlgo obj = new HeapAlgo(); 
            obj.heapPermutation(args, args.length, args.length);
        } else {
            System.out.println("Please enter a single word or a sentence to permutate."); 
        }
    }

}
