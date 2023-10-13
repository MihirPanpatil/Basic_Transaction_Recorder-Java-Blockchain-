import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BlockMethods blockMethods = new BlockMethods();
        int ch;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("\n1. Add a Record.\n2. Display all Amount values.\n3. Display all the Names.\n4. Display Hash list.\n5. Check chain Validity.\n6. Exit.\nChoose an option : ");
            ch = sc.nextInt();
            switch(ch){
                case 1 : {
                    
                    sc.nextLine();
                    System.out.print("\nEnter your Name : ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Amount : ");
                    String data = sc.nextLine();

                    blockMethods.addBlock(data, name);
                    
                    break;
                    
                }
                case 2 : {
                    blockMethods.displayValues();
                    break;
                }
                case 3 : {
                    blockMethods.displayName();
                    break;
                }
                case 4 : {
                    blockMethods.displayHash();
                    break;
                }
                case 5 : {
                    if(blockMethods.isChainValid() == true){
                        System.out.println("\nMAIN : The Chain has not been Tampered with. All Systems safe.");
                    }
                    else
                    {
                        System.out.println("\nWARNING : System Hash Changes detected. Data is not safe!");
                    }
                    break;
                }
                case 6 : {
                    System.exit(0);
                    break;
                }

                default : {
                    System.out.println("INVALID INPUT!");
                }
            }
        }  
    }
}
