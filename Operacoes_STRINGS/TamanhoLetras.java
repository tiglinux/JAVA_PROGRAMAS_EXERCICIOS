/*
    Desenvolvido por : Tiago Ribeiro Santos
    Data : 06/03/2018
    email : tiago.programador@hotmail.com


 */
package EstudosStrings;

import javax.swing.JOptionPane;

public class TamanhoLetras {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha "
                + " com no minimo 6 caracteres...");
        try {
            if (senha == null) {
                throw new Exception("erro!");   //Exceçao disparada!
            } else if (senha.length() < 6) {
                throw new Exception("Senha menor que 6 caracteres!"); // Excec Disparada. 
            } else if (senha.length() > 0 && senha.length() > 6) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!");
                System.exit(0); // Fim do programa apenas para nao consumir memória!
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ERRO!" + JOptionPane.ERROR_MESSAGE
            );
            System.exit(0); //end programm.
        }
    }
}
