public class PrimeiroTeste {

	public static void main (String[] args){
		System.out.println("Wello, Word");

		if(args.length == 5){
		String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]);
		float salario = Float.valueOf(args[3]);
		boolean java = Boolean.valueOf(args[4]);

		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.println(salario);
		System.out.println(java);
		} else {
		System.out.println("Deu Ruim");
		}
	}
		
}