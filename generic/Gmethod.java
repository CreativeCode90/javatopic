public class Gmethod {
    // Generic method to print any type of data
    static <T> void print(T print) { // Add <T> before the return type to declare the generic type
        System.out.println(print);
    }
	
    static void console(String str){
	System.out.println(str);
    }
    public static void main(String[] args) {
        print("vim editor "+"hello world");
         console("hello console "+"this is not java"+34);
	 String name = "Sarthak";
	 int age = 19;
	 boolean valid = true;
	 float height = 5.11f;
	 print("my name is "+name+" my age is "+age+" is valid "+valid + " my height "+height);
    }
}
 
