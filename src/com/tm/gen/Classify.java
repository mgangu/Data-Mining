package com.tm.gen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Classify {
	ArrayList<String> filesList=null;
	Scanner fileData=null;
	private StringTokenizer line=null;
	private ArrayList<Integer> weights=null;
	private ArrayList finalData=new ArrayList();
	int highestWeightIndex=0;
	String belongsTo=null;
	
	File file=new File("D:\\do not delete\\output.txt");
	public ArrayList<String> classifyIt() throws FileNotFoundException{
		filesList=new ArrayList<String>();
		fileData=new Scanner(file);
		
		while(fileData.hasNextLine())
		{
			line=new StringTokenizer(fileData.nextLine());
			int indexOfNumbers=0;
			weights=new ArrayList<Integer>();
			String filename=null;
			String file1=null;
			String file2=null;
			while(line.hasMoreTokens())
			{
				if(indexOfNumbers==0)
				{
					file1=line.nextToken();
				}
				if(indexOfNumbers==1)
				{
					file2=line.nextToken();
				}
				if(!((indexOfNumbers==0)||(indexOfNumbers==1)))
				{
					weights.add(Integer.parseInt(line.nextToken()));
				}
				indexOfNumbers++;
			}
			
			int maxVal=0;
			int maxIndex=0;
			if(weights.size()>0)
			{
				
				for(int i=0;i<weights.size();i++)
				{
					if(weights.get(i)>maxVal)
					{
						maxVal=weights.get(i);
						maxIndex=i;
					}
					
				}
				
			}
			if(maxIndex==0)
			{
				belongsTo="bs_trades";
			}
			if(maxIndex==1)
			{
				belongsTo="bs_eco";
			}
			if(maxIndex==2)
			{
				belongsTo="bs_others";
			}
			if(maxIndex==3)
			{
				belongsTo="ent_celeb";
			}
			if(maxIndex==4)
			{
				belongsTo="ent_films";
			}
			if(maxIndex==5)
			{
				belongsTo="ent_others";
			}
			if(maxIndex==6)
			{
				belongsTo="pol_parl";
			}
			if(maxIndex==7)
			{
				belongsTo="pol_contr";
			}
			if(maxIndex==8)
			{
				belongsTo="pol_others";
			}
			if(maxIndex==9)
			{
				belongsTo="sp_achv";
			}
			if(maxIndex==10)
			{
				belongsTo="sp_others";
			}
			if(maxIndex==11)
			{
				belongsTo="tech_comp";
			}
			if(maxIndex==12)
			{
				belongsTo="tech_science";
			}
			if(maxIndex==13)
			{
				belongsTo="tech_others";
			}
			filename=file1+" "+file2;
		//	highestWeightIndex=weights.;
			//if(){}
			finalData.add(belongsTo+" "+filename);
		}
		
		
		return finalData;
		
	}

}
