package Practice;
public class F {
int i;
static String s;
void imethod() {
}
static void smethod() {
}
public static void main(String[] args) {
	F f = new F();
	System.out.println(f.i);
	//System.out.println(f.s);
	f.imethod();
	f.smethod();
	//System.out.println(F.i);
	System.out.println(F.s);
//	F.imethod();
	F.smethod();
}
}
