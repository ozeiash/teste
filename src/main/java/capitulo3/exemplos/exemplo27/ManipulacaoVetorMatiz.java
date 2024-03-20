/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo3.exemplos.exemplo27;

/**
 *
 * @author ozeias
 * @date 25/02/2024
 * @brief Class ManipulacaoVetorMatiz
 */
public class ManipulacaoVetorMatiz {

    public static void main(String[] args) {

        int[] idadeAlunos = new int[10];
        float[][] notasAlunos = new float[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Encotre a idade do " + i + 1 + " aluno: ");
            idadeAlunos[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com a nota da AV" + (j + 1) + " do " + (i + 1) + " aluno");
                notasAlunos[i][j] = new java.util.Scanner(System.in).nextFloat();

            }
        }

    }

}
