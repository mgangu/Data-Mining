package com.tm.bus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class BusinessProcess {
	

	public ArrayList al=null;
	
	
	
	
	
	Scanner scanner=null;
	 Map<String, Integer> map = null;
	 
	 
	 final static  String[] root_words_trades={"Ad sales boost Time Warner profit","biggest investors",
			"advert sales","quarter sales","internet business","market regulators","charges","finance",
			"production","assets","debts","downfall","tax","shares","Financial","bid","purchase",
			"market value","G7","trade policies","G20","floating exchange","exchange rate","tobacco",
			"companies"	};
	
	
final static  String[] root_words_eco={"euro","household savings","finance",
			"Federal Reserve","budget","deficit","credit","company","shares",
			"Financial","recession","annual growth","domestic","gross"};
	
final static  String[] root_words_transport={"production","assets",
			"Airway","airline","revenue","full year","full-year",
			"aircraft","Airbus","takeover","goods","domestic","Labor","jobseekers","margin",
			"crop production","Organisation","survival programme","million",};
	
final static String[] root_words_celebrations={"Gallery","Christmas tree","Britain art","Christmas","decorating",
			"photography","Crown Prince","ambassador","shows","Awards","Theatre","Measure"};
	
final static String[] root_words_films={"film","Gallery","musical","movie","Poppins","actor","actress",
			"Producer","Theatre"};
	
final static String[] root_words_entoters={"book","awards","Novelist","win","magazine","designer","playwright",
			"lousy history","translated","Monologues","organisers","show","author","stories"};
	
final static String[] root_words_parliament={"Democrats","Cabinet","Parliament","minister","Labour chooses Manchester","political",
			"Blackpool","Brown ally rejects Budget spree","Budget","election","government","Prime Minister",
			"Fox attacks Blair's Tory 'lies'","hard right agenda","country","policies","Liberal Democrats",
			"Crucial decision","gambling","National Party"};
	
final static String[] root_words_controvertial={"Democrats","e-mail deletions","Cabinet","minister","e-mail",
			"destruction","political","election","political culture","government","Women MPs reveal sexist taunts",
			"sexist abuse","MPs pretended to juggle","hostility","Campbell: E-mail row 'silly fuss'","e-mail was revealed",
			"controversy","mistake"};
	
final static String[] root_words_politicsothers={"Labour plans","maternity pay","Democrats","voters","minister",
			"government","career sexism","political","Budget","election","'Errors' doomed first Dome sale",
			"National","NAO report","Prime Minister","committee"};

final static String[] root_words_spachievements={"sports","cricket","Edwards","Madrid","triple jump","GB",
			"Birmingham","Collins","indoors","Commonwealth 100m","indoor","Olympic Games","Indoor Championships",
			"Athens Olympics","Hansen","European champion","Chepkemei","Radcliffe","Masai","O'Sullivan","Carroll","hansen","world record","long jump","Bekele","Bekele"};

final static String[] root_words_spothers={"sports","cricket","adidas","Olympic","championship","Athletics",
			"McIlroy","Madrid","Isinbayeva","Maurice",
			"Isinbayeva","IAAF","athletics family","sport clean","world title"};
	
final static String[] root_words_computer={"computer","software","power cable","Microsoft","faulty cables","console","website","turn off their Xboxes",
				"Microsoft said","Linux push","Linux software","handheld computers","business applications","cafe","ink",
				"corporate networks","open source software","Apple laptop","greatest gadget","portable computers","gadget"};

final static String[] root_words_science={"science","software","digital film network","digital cinema","digital",
			"digital projectors","portable hard drive","computer server","With digital prints","Google's toolbar",
			"Search engine","Amazon.com","publisher of the page","Smart Tags","click through","Microsoft","instant messaging",
			"Messenger","program","Digital guru","digital","laptop","children laptops","anti-virus",};

final static String[] root_words_othertech={"technology","software patent law","software patents","technology companies",
			"software patents","software","computer inventions","TV downloads","illegally downloading","Web tracking company",
			"sharing program","television show","science","software","programme is downloading","TV program","connection via cable","Christmas e-mail",
			"electronic Christmas","malicious","Christmas","virus","Wi-fi web","computer centres","community","Farmers",
			"hi-tech","installation","creativ","technologi","computer","software"};
//final static String[] root_words_spothers[]={""};



	public ArrayList fileProcess() throws FileNotFoundException, UnsupportedEncodingException
	{
		
		al=new ArrayList<String>();
		
		PrintWriter writer = new PrintWriter("D:\\do not delete\\the-file-name.txt", "UTF-8");
		File file= new File("E:\\text mining\\data sets");
		File[] all_files = file.listFiles();
	
		
		
	/*	for(File f : all_files)
		{
			scanner=new Scanner(f);*/
	
		String root_word=null;
			//trades
		for(File f2 : all_files)
		{
			
			
			int root_words_trades_number=0;
			int root_words_transport_count=0;
			int root_words_eco_count=0;
			int root_words_celebrations_count=0;
			int root_words_films_count=0;
			int root_words_entoters_count =0;
			
			int root_words_controvertial_count=0;
			int root_words_politicsothers_count=0;
			int  root_words_spachievements_count=0;
			int root_words_spothers_count=0;
			int root_words_computer_count=0;
			int root_words_science_count=0;
			int root_words_othertech_count=0;
		//	scanner=new Scanner(f2);
			//trade words
			for(int i=0; i<(root_words_trades.length);i++)
			{
						
				root_word=root_words_trades[i];
					scanner=new Scanner(f2);
					while(scanner.hasNextLine())
					{
						int index=0;
						String target=scanner.nextLine();
						for(int j=0; j<=target.length(); j++)
						{
							index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
							if(index==-1) break; 
							else 
								root_words_trades_number++;
						}
					}
			}
					
		//economy			
		for(int i=0; i<(root_words_eco.length);i++)
					{
								
						root_word=root_words_eco[i];
							scanner=new Scanner(f2);
							while(scanner.hasNextLine())
							{
								int index=0;
								String target=scanner.nextLine();
								for(int j=0; j<=target.length(); j++)
								{
									index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
									if(index==-1) break; 
									else 
										root_words_eco_count++;
								}
							}
					}
		
		//others (trans)
		for(int i=0; i<(root_words_transport.length);i++)
		{
					
			root_word=root_words_transport[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_transport_count++;
					}
				}
		}
		
		//celebrations
		for(int i=0; i<(root_words_celebrations.length);i++)
		{
					
			root_word=root_words_celebrations[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_celebrations_count++;
					}
				}
		}
		
	//films	
		for(int i=0; i<(root_words_films.length);i++)
		{
					
			root_word=root_words_films[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_films_count++;
					}
				}
		}
		
	// enter .... others	
		for(int i=0; i<(root_words_entoters.length);i++)
		{
					
			root_word=root_words_entoters[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_entoters_count++;
					}
				}
		}
		
		int root_words_parliament_count=0;
		//parliament
		for(int i=0; i<(root_words_parliament.length);i++)
		{
					
			root_word=root_words_parliament[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_parliament_count++;
					}
				}//System.out.println(root_words_parliament_count);
		}
		
		//politics controvertial
		for(int i=0; i<(root_words_controvertial.length);i++)
		{
					  
			root_word=root_words_controvertial[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_controvertial_count++;
					}
				}
		}
		
		//politics others
		for(int i=0; i<(root_words_politicsothers.length);i++)
		{
					
			root_word=root_words_politicsothers[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_politicsothers_count++;
					}
				}
		}
		
		//sports achievements
		for(int i=0; i<(root_words_spachievements.length);i++)
		{
					
			root_word=root_words_spachievements[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_spachievements_count++;
					}
				}
		}
		
		
		for(int i=0; i<(root_words_spothers.length);i++)
		{
					
			root_word=root_words_spothers[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_spothers_count++;
					}
				}
		}
		
		
		for(int i=0; i<(root_words_computer.length);i++)
		{
					
			root_word=root_words_computer[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_computer_count++;
					}
				}
		}
		
		
		for(int i=0; i<(root_words_science.length);i++)
		{
					
			root_word=root_words_science[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_science_count++;
					}
				}
		}
		
		
		for(int i=0; i<(root_words_othertech.length);i++)
		{
					
			root_word=root_words_othertech[i];
				scanner=new Scanner(f2);
				while(scanner.hasNextLine())
				{
					int index=0;
					String target=scanner.nextLine();
					for(int j=0; j<=target.length(); j++)
					{
						index=target.toLowerCase().indexOf(root_word.toLowerCase(),index+root_word.length());
						if(index==-1) break; 
						else 
							root_words_othertech_count++;
					}
				}
		} 
		
		
		System.out.println(f2.getName()+" "+root_words_trades_number+" "+root_words_eco_count+" "
				+root_words_transport_count+" "+root_words_celebrations_count+" "+root_words_films_count+" "
				+root_words_entoters_count+" "+root_words_parliament_count+" "+root_words_controvertial_count+" "
				+root_words_politicsothers_count+" "+root_words_spachievements_count+" "+root_words_spothers_count
				+" "+root_words_computer_count+" "+root_words_science_count+" "+root_words_othertech_count);
		
		
		al.add(f2.getName()+" "+root_words_trades_number+" "+root_words_eco_count+" "
				+root_words_transport_count+" "+root_words_celebrations_count+" "+root_words_films_count+" "
				+root_words_entoters_count+" "+root_words_parliament_count+" "+root_words_controvertial_count+" "
				+root_words_politicsothers_count+" "+root_words_spachievements_count+" "+root_words_spothers_count
				+root_words_computer_count+" "+root_words_science_count+" "+root_words_othertech_count);
				
		writer.write("\\");
		}
		return al;
		}
	}
			
				
		/*		
				while(scanner.hasNextLine())
				{
					if(root_words_trades[i].equalsIgnoreCase(scanner.nextLine().trim()))
					{
						root_words_trades_number ++;
					}
				}
				
			}
			
			// transport counting		
			for(int k=0; k<(root_words_transport.length);k++){
					
					while(scanner.hasNextLine())
					{
						if(root_words_transport[k].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							root_words_transport_cout ++;
						}
					}
			
			}
			
			
			// economy counting				
			for(int j=0; j<(root_words_eco.length);j++)
			{
						
						while(scanner.hasNextLine())
						{
							if(root_words_eco[j].equalsIgnoreCase(scanner.nextLine().trim()))
							{
								root_words_eco_count ++;
							}
						}	
			}		
						
			//celebration counting			
			for(int l=0; l<(root_words_celebrations.length);l++){
							
						while(scanner.hasNextLine()){
							if(root_words_celebrations[l].equalsIgnoreCase(scanner.nextLine().trim()))
							{
								root_words_celebrations_count ++;
							}
						}	
			}
			
			
			// films
			for(int m=0; m<(root_words_films.length);m++)
			{
							
						while(scanner.hasNextLine()){
							if(root_words_films[m].equalsIgnoreCase(scanner.nextLine().trim()))
							{
								root_words_films_count ++;
							}
				}
						
			}	
			
			
			// enter other	
			for(int n=0; n<(root_words_entoters.length);n++)
			{
					
						while(scanner.hasNextLine())
						{
							if(root_words_entoters[n].equalsIgnoreCase(scanner.nextLine().trim()))
							{
								root_words_entoters_count ++;
							}
						}
			}	
			
		
			// parliament						
			for(int o=0; o<(root_words_parliament.length);o++)
			{
						
				while(scanner.hasNextLine())
				{
						if(root_words_parliament[o].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							root_words_parliament_count ++;
						}
				}
			}
			
		// controvercial	
			for(int o=0; o<(root_words_controvertial.length);o++)
			{
						
				while(scanner.hasNextLine())
				{
						if(root_words_controvertial[o].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							root_words_controvertial_count ++;
						}
				}
			}
			
			
			for(int o=0; o<(root_words_politicsothers.length);o++)
			{
						
				while(scanner.hasNextLine())
				{
						if(root_words_politicsothers[o].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							root_words_politicsothers_count ++;
						}
				}
			}
			
			for(int o=0; o<( root_words_spachievements.length);o++)
			{
						
				while(scanner.hasNextLine())
				{
						if( root_words_spachievements[o].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							 root_words_spachievements_count ++;
						}
				}
			}
			
			for(int o=0; o<(root_words_spothers.length);o++)
			{
						
				while(scanner.hasNextLine())
				{
						if(root_words_spothers[o].equalsIgnoreCase(scanner.nextLine().trim()))
						{
							root_words_spothers_count ++;
						}
				}*/
		//	}
			
			
		//	writer.print(root_words_trades_number);
			/*writer.print(root_words_transport_cout);
			writer.print(root_words_eco_count);
			writer.print(root_words_celebrations_count);
			//writer.print(root_words_celebrations_count);
			writer.print(root_words_films_count);
			writer.print(root_words_entoters_count);
			writer.print(root_words_parliament_count);
			writer.print( root_words_controvertial_count);
			writer.print(root_words_politicsothers_count);
			writer.print(root_words_spachievements_count);
			writer.print(root_words_spothers_count);
			writer.println("");
			*/
			
		//}
	//	System.out.println(root_words_trades_number); 
	
	 
//}
	 
