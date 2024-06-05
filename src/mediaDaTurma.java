import java.util.Scanner;

public class mediaDaTurma {
    public static void main(String[] args) {
        
    String[] alunos = {"braga", "rubens", "heitor"}; 
    
    Scanner scan = new Scanner(System.in); 
    
Double media = calcularMedia(alunos, scan);   

if (media > 0) {System.out.printf("a média da turma é %.1f", media);
} 

else { System.out.println("Operação cancelada"); 

} 

    }

public static Double calcularMedia(String[] alunos, Scanner scan) { 
    Double soma = 0.0; 
    Double nota;
    try{
    for (String aluno : alunos){ 
  
    System.out.printf("digite a nota de %s \n", aluno); 
  nota = scan.nextDouble (); 
  soma += nota;
}

}
catch(java.util.InputMismatchException e) { 
System.out.println("Digite apenas números");

}

return soma / 3; 

}

}









