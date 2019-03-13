package view;

import controller.ProcController;

public class Principal {

	public static void main(String[] args)
	{
		ProcController pCont = new ProcController();
		// String os =  pCont.os();
		//System.out.println(os);
		//pCont.propriedades();
		
		
		//String caminhoprocesso = "TRACERT www.fateczl.edu.br/";
		//pCont.ChamaProcesso(caminhoProcesso);
		//pCont.leProcesso(caminhoProcesso);
		
		String processo = "notepad.exe";
		pCont.mataProcesso(processo);
		//TASKLIST /FO TABLE

	}

}
