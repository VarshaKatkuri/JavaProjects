package Week4;

public class Test {
	/*public static void method1(int n, int m) {
		n += m;
		method2(3);
	}*/	

public static int method2(int n) {
	if (n > 0) return 1;
	else if (n == 0) return 0;
	else if (n < 0) return -1;
	else return 0;
 }
/*public static void main(String[] args) {
int max = 0;
max(1, 2, max);
System.out.println(max);
}*/
public static void max(
int value1, int value2, int max) {
if (value1 > value2)
max = value1;
else
max = value2;
}
public static void main(String[] args) {
int i = 1;
while (i <= 6) {
method1(i, 2);
i++;
}
}
public static void method1(
int i, int num) {
for (int j = 1; j <= i; j++) {
System.out.print(num + " ");
num *= 2;
}
System.out.println();
}

}