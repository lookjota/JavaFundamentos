

package excecoes;

import pessoa.Pessoa;

public class Excecoes {
    
    // Checked exceptions
    
    // Unchecked exceptions

    public static void main(String[] args) {
        // // try / catch
        // try {
        //     validarNumero();
        // } catch (Exception e) {
        //     System.out.println("Deu ruim");
        //     e.printStackTrace();
        // }
        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if(numero < 100) {
            throw new Exception("O numero eh menor que 100");
        }
        // NullPointerException
    }

}
