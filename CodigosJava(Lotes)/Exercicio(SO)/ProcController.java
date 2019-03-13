package controller;

import java.util.Properties;

import javax.swing.JOptionPane;

import java.io.*;
import java.util.*;

public class ProcController 
{
	public ProcController ()
	{
		super();
	}
	
	public String os ()
	{
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void propriedades ()
	{
		Properties prop = System.getProperties();
		Set<Object> keys = prop.keySet();
		for (Object key : keys)
		{
			String chave = key.toString();
			System.out.println(chave);
			System.out.println(" ======> ");
			String propriedade = System.getProperty(chave);
			System.out.println(propriedade);
		}
	}
	
	public void ChamaProcesso (String caminhoProcesso)
	{
		try 
		{
			Runtime.getRuntime().exec(caminhoProcesso);
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(),
					"ERRO", JOptionPane.ERROR_MESSAGE);
			
			if (e.getMessage().contains("740"))
			{
				
				StringBuffer buffer = new StringBuffer();
				buffer.append("cmd.exe /c");
				buffer.append(" ");
				buffer.append(caminhoProcesso);
				
				try 
				{
					Runtime.getRuntime().exec(buffer.toString());
				} 
				
				catch (IOException e1) 
				{
					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage(),
							"ERRO", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
			else
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, e.getMessage(),
						"ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void leProcesso (String caminhoProcesso)
	{
		try 
		{
			Process p = Runtime.getRuntime().exec(caminhoProcesso);
			InputStream fluxo = p.getInputStream();
			InputStreamReader Leitor  = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader (Leitor);
			String linha = buffer.readLine();
			
			while (linha !=null)
			{
				System.out.println(linha);
				linha = buffer.readLine();
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
	
	public void mataProcesso (String processo)
	{
		
		String cmdPid = "TASKKILL /PID";
		String cmdNome = "TASKKILL /IM";
		int pid  = 0;
		StringBuffer buffer = new StringBuffer();
		
		
		try 
		{
			pid = Integer.parseInt(processo);
			buffer.append(cmdPid);
			buffer.append(pid);
			
		} 
		
		catch (NumberFormatException e)
		{
			buffer.append(cmdNome);
			buffer.append(processo);
		}
		ChamaProcesso(buffer.toString());
	}
	
}
