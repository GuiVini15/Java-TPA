public class Alturas {
    public static void main(String[] args) {
		float joao, pedro, n1 = 2.5f, n2 = 2;
		int i = 0;
		pedro = 145;
		joao = 134;
		while(joao<=pedro) {
			pedro += n2;
			joao += n1;
			i++;
		}
		System.out.println("Demorar�  "+i +" anos para Jo�o ficar mais alto que Pedro");
	}
}
