import java.util.Scanner;
class ParametroInvalidoException extends Exception{
	public ParametroInvalidoException(String mensagem) {
		super(mensagem);
	}
}
public class controle {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("digite o primeiro número :");
			int parametro1 = scanner.nextInt();
			System.out.print("digite o segundo número : ");
			int parametro2 = scanner.nextInt();
			
			if(parametro1>parametro2) {
				throw new ParametroInvalidoException("o segundo parametro precisa ser maior que o primeiro");
			}
			for (int i = parametro1; i<= parametro2; i++) {
				System.out.print(i);
			}
		} catch (ParametroInvalidoException e) {
			System.out.println(e.getMessage());
			} finally {
				scanner.close();
		}
	}

}