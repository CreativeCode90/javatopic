import  java.util.*;

public class Main{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("sarthak");
    list.add("coder");
    list.add("tool");
    //System.out.println(list);
    //use forEach loop in list
    for(String i : list){
      System.out.println(i);

    }
    //get list element using get() method give index
    System.out.println(list.get(1));

    //set element in list 
    list.set(0 , "creative");
    System.out.println(list);
    // get the list size 
    System.out.println(list.size());
    //remove list element using index 
    list.add("demo"); //add new element in list 
    System.out.println(list); // show my list elements 
    //remove 
    list.remove(3); // 3 -> is indexing number of  demo element in list 
    System.out.println(list);


    //remove element in list by giving elment 
    list.add("data"); // new new element in list 
    System.out.println(list);
    list.remove("data"); // remove by givng element name 
    System.out.println(list);
    //Searching element in list 
    System.out.println(list.indexOf("tool"));

  }
}
