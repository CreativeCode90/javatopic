class method{
  public void data(String strdata){
    System.out.println(strdata);
  } 
  public void data(int intdta){
    System.out.println(intdta);
  }
  public void name(){

  }
}

class m1 extends method{
  @Override
  public void name(){
    System.out.println("this is override method in normal class");
  }
}

interface use{
  public void filecreate(String filename);
}

class apply implements use{
  String filename ;
@Override
  public void filecreate(String filename){
    this.filename = filename;
    System.out.println("File is Created "+filename);
  }
}

public class Code{

	public static void main(String[] args){
		String newfile = "index.html";
    apply a =  new apply();
    a.filecreate(newfile);
		/*method m = new method();
    m1 l = new m1();
    l.name();
    m.data("hello world");
    m.data(29);
    */
	}
}
