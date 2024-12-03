//make a generic class

clsss Cmd<T>{
	public void makefile(T filename){
		System.out.println("your new file name: "+filename );
	}
	public <T> echo(T type){
		return type;
	}
}

public class Main{
	static <t> println(T printdata){
		System.out.println(printdata);
	}
	public static void main(String[] args){
		String filename = "helloNvChad.java";
		Cmd<String> file = new Cmd<String>();
		file.makeFile(filename);
		String print = file.echo(filename);
		println(print);
	}
	
}

