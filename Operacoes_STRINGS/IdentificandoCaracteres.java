/*
    Desenvolvido por : Tiago Ribeiro Santos
    Data : 06/03/2018
    email : tiago.programador@hotmail.com



 */
package EstudosStrings;

import javax.swing.JOptionPane;

public class IdentificandoCaracteres {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase:");
        try {
            if (frase.charAt(0) == 't' || frase.charAt(0) == 'T') {
                JOptionPane.showMessageDialog(null, "Voce digitou algo com T inicial!");
            } else {
                throw new Exception("Erro! nao encontrei nenhum t ou T");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            System.exit(0);
        }
    }
}
