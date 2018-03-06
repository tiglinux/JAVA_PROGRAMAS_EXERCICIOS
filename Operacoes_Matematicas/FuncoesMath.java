package estudosjava;

/*
    Desenvolvido por : Tiago Ribeiro Santos
    Data : 06/03/2018
    email : tiago.programador@hotmail.com


 */
import javax.swing.JOptionPane;

public class FuncoesMath {

    public static void main(String[] args) {
        String a, b;

        try {
            a = JOptionPane.showInputDialog("Digite um valor : ");
            b = JOptionPane.showInputDialog("Digite um valor : ");

            if (a == null && b == null) {    //Se o usuario clica em "Cancel' fim programa.
                throw new Exception("Erro!! Não pdoe cancelar!"); //Exceção forçada! disparada entra no catch
            } else {
                double conver_A, conver_B;  //Variaveis convertidas

                conver_A = Double.parseDouble(a);
                conver_B = Double.parseDouble(b);

                //Math.ceil arredonda o numero para maior!
                JOptionPane.showMessageDialog(null, Math.ceil(conver_A));
                JOptionPane.showMessageDialog(null, Math.ceil(conver_B));

                //Math.floor arredonda o numero para menor!
                JOptionPane.showMessageDialog(null, Math.floor(conver_A));
                JOptionPane.showMessageDialog(null, Math.floor(conver_B));

                //Math.max (maior num) Math.min(menor num)
                JOptionPane.showMessageDialog(null, "O maior num é :" + Math.max(conver_A, conver_B));
                JOptionPane.showMessageDialog(null, "O menor num é :" + Math.min(conver_A, conver_B));

                //Math.sqrt(raizquadrada) mostra a raiz de um NUM;
                JOptionPane.showMessageDialog(null, "Raiz quadrada de A :" + Math.sqrt(conver_A));
                JOptionPane.showMessageDialog(null, "Raiz quadrada de B :" + Math.sqrt(conver_B));

                //Gerando numeros aleatorios em inteiro;
                int numA = (int) (Math.random() * 101);   //Numero entre 0 a 100;
                int numB = (int) (Math.random() * 101);

                JOptionPane.showMessageDialog(null, "O numero aleatorio de A é :" + numA);
                JOptionPane.showMessageDialog(null, "O numero aleatorio de B é :" + numB);

                //Logo após,encerro o programa com a função System.exit(0);
                //Mas ela não é necessária...ficando a critério do programador.
                System.err.println("Bye.. ^  ^");

                System.exit(0);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro!Você nao pode cancelar!",
                    "ERRO!!", JOptionPane.ERROR_MESSAGE);
            System.exit(0); //Fim do programa
        }
    }
}
