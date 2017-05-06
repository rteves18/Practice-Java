import static java.lang.System.*;



class Fresh {
	enum FreshSize{SMALL, MEDIUM, LARGE } 
	FreshSize size;
	char a = 'b';	
}

public class ex {

	public static void main(String []args){
		Fresh juice = new Fresh();
		juice.size = Fresh.FreshSize.SMALL;
		System.out.println("Size:" + juice.size);
	}
}
