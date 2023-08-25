import java.util.InputMismatchException;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);
        
		try {
            System.out.print("Digite o primeiro parâmetro = ");
            int parametroUm = terminal.nextInt();
    
            System.out.print("Digite o segundo parâmetro = ");
            int parametroDois = terminal.nextInt();
            
            contar(parametroUm, parametroDois);

		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
        terminal.close();
		
	}
	/**
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
     * Removi a operacão => int contagem = parametroDois - parametroUm / pois no momento não encontrei uma forma de fazer acontagem do valor inicial
     * até  valor final sem comecar do zero(0) que é representado pelo contador(i).
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if(parametroUm < parametroDois){
               // int contagem = parametroDois - parametroUm;
                int i = parametroUm;
                while(i <= parametroDois){
                    System.out.print(i + " ");
                    i++;
                }return;
           
            }
            throw new ParametrosInvalidosException();
        }
		
		
	}