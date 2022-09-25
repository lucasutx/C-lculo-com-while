package exercicios_avulsos;

import java.util.Scanner;

public class calculo_pesquisa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opc,op1=0,op2=0,op3=0,op4=0,op5=0,op6=0,total;
		System.out.println("Qual o melhor SO para os servidores?"
				+ "Digite 1 - para Windows \n"
				+ "Digite 2 - para Unix \n"
				+ "Digite 3 - para Linux\n"
				+ "Digite 4 - para Netware\n"
				+ "Digite 5 - para Mac OS\n"
				+ "Digite 6 - para Outro\n"
				+ "Digite 7 - para para sair\n");
		opc=teclado.nextInt();
		
		while(opc!=7) {
			
			if(opc==1) {
				op1++;
			}else if(opc==2) {
				op2++;
			}else if(opc==3) {
				op3++;
			}else if(opc==4) {
				op4++;
			}else if(opc==5) {
				op5++;
			}else if(opc==6) {
				op6++;
			}
			System.out.println("Qual o melhor SO para os servidores?"
					+ "Digite 1 - para Windows \n"
					+ "Digite 2 - para Unix \n"
					+ "Digite 3 - para Linux\n"
					+ "Digite 4 - para Netware\n"
					+ "Digite 5 - para Mac OS\n"
					+ "Digite 6 - para Outro\n"
					+ "Digite 7 - para para sair\n");
			opc=teclado.nextInt();
			
			
		}
		total=op1+op2+op3+op4+op5+op6;
		System.out.println("A quatidade da opcão 1 é:"+op1);
		System.out.println("A quatidade da opcão 2 é:"+op2);
		System.out.println("A quatidade da opcão 3 é:"+op3);
		System.out.println("A quatidade da opcão 4 é:"+op4);
		System.out.println("A quatidade da opcão 5 é:"+op5);
		System.out.println("A quatidade da opcão 6 é:"+op6);
		System.out.println("A porcentagem da opcão 1 é:"+op1*100/total+"%");
		System.out.println("A porcentagem da opcão 2 é:"+op2*100/total+"%");
		System.out.println("A porcentagem da opcão 3 é:"+op3*100/total+"%");
		System.out.println("A porcentagem da opcão 4 é:"+op4*100/total+"%");
		System.out.println("A porcentagem da opcão 5 é:"+op5*100/total+"%");
		System.out.println("A porcentagem da opcão 6 é:"+op6*100/total+"%");
		
		
		teclado.close();
	}

}
