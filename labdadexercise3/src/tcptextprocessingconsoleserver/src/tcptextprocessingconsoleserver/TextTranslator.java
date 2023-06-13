package tcptextprocessingconsoleserver.src.tcptextprocessingconsoleserver;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/*
 * This class provides data creation for storing translated text 
 * in different languages based on English text.
 * These languages including: Malay, Arabic and Korean
 * 
 * This class will also parse the translated text to the variable
 * where it will be sent back to client for display based on the input received
 * and the selected target language from client request.
 * 
 */
public class TextTranslator {
	
	/*
	 * This method mainly for create data to ready for text translation
	 */
	public void createData()
	{
		// Declaration of target storage
		String MalayStorage = "Malay.txt";
		String ArabicStorage = "Arabic.txt";
		String KoreanStorage = "Korean.txt";
		
		try
		{
			//	write in Malay
			//  2. Construct Writer object
			PrintWriter pwTranslateMalay = new PrintWriter(MalayStorage);
			
			pwTranslateMalay.write("Selamat pagi");
			pwTranslateMalay.write("Selamat malam");
			pwTranslateMalay.write("Apa khabar ?");
			pwTranslateMalay.write("Terima kasih");
			pwTranslateMalay.write("Selamat tinggal");
			pwTranslateMalay.write("Ada apa");
			
			// Clear the stream
			pwTranslateMalay.flush();
			
			// write in Arabic
			PrintWriter pwTranslateArab = new PrintWriter(ArabicStorage);
			
			pwTranslateArab.write("صباح الخير");
			pwTranslateArab.write("طاب مساؤك");
			pwTranslateArab.write("كيف حالك؟");
			pwTranslateArab.write("شكرا لك");
			pwTranslateArab.write("مع السلامة");
			pwTranslateArab.write("ما أخبارك؟");
			
			// Clear the stream
			pwTranslateArab.flush();
			
			//write in Korean
			PrintWriter pwTranslateKorean = new PrintWriter(KoreanStorage);
			
			pwTranslateKorean.write("좋은 아침");
			pwTranslateKorean.write("안녕히 주무세요");
			pwTranslateKorean.write("어떻게 지내세요 ?");
			pwTranslateKorean.write("감사합니다");
			pwTranslateKorean.write("안녕");
			pwTranslateKorean.write("뭐야 ?");
			
			// Clear the stream
			pwTranslateKorean.flush();
						
			// Close all streams
			pwTranslateMalay.close(); 
			pwTranslateArab.close(); 
			pwTranslateKorean.close(); 
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	// read the source to ready translate text from english to malay
	/*
	 * @param text: text for translation
	 * @return Translated Malay text
	 */
	public String translateToBM(String text)
	{
		
		String translated = "";
		String path = "Malay.txt";
		
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create reader to enable read data from source file
			BufferedReader bwMalay = new BufferedReader(new FileReader(path));
			
			// read the data
			morning = bwMalay.readLine();
			night = bwMalay.readLine();
			howareyou = bwMalay.readLine();
			thank = bwMalay.readLine();
			bye = bwMalay.readLine();
			whatup = bwMalay.readLine();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
				|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP") 
					|| text.toUpperCase().equals("WHAT'S UP?"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
	
	// read the source to ready translate text from english to arabic
	/*
	 * @param text: text for translation
	 * @return Translated Arabic text
	 */
	public String translateToArb(String text)
	{
		String translated = "";
		String path = "Arabic.txt";
		
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create reader to enable read data from source file
			BufferedReader bwArab= new BufferedReader(new FileReader(path));
			
			// read the data
			morning = bwArab.readLine();
			night = bwArab.readLine();
			howareyou = bwArab.readLine();
			thank = bwArab.readLine();
			bye = bwArab.readLine();
			whatup = bwArab.readLine();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
					|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP") 
					|| text.toUpperCase().equals("WHAT'S UP?"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
	
	
	// read the source to ready translate text from english to korean
	/*
	 * @param text: text for translation
	 * @return Translated Korean text
	 */
	public String translateToKrn(String text)
	{
		String translated = "";
		String path = "Korean.txt";
		
		String morning, night, howareyou, thank, bye, whatup = "";
		
		try
		{
			// create reader to enable read data from source file
			BufferedReader bwKrn= new BufferedReader(new FileReader(path));
			
			// read the data
			morning = bwKrn.readLine();
			night = bwKrn.readLine();
			howareyou = bwKrn.readLine();
			thank = bwKrn.readLine();
			bye = bwKrn.readLine();
			whatup = bwKrn.readLine();
			
			// Conditions to parse the correspond text to the respective variable
			// based on English text input
			if(text.toUpperCase().equals("GOOD MORNING"))
			{
				translated = morning;
			}
			else if(text.toUpperCase().equals("GOOD NIGHT"))
			{
				translated = night;
			}
			else if(text.toUpperCase().equals("HOW ARE YOU") || text.toUpperCase().equals("HOW ARE YOU ?")
					|| text.toUpperCase().equals("HOW ARE YOU?"))
			{
				translated = howareyou;
			}
			else if(text.toUpperCase().equals("THANK YOU"))
			{
				translated = thank;
			}
			else if(text.toUpperCase().equals("GOODBYE"))
			{
				translated = bye;
			}
			else if(text.toUpperCase().equals("WHAT'S UP ?") || text.toUpperCase().equals("WHAT'S UP") 
					|| text.toUpperCase().equals("WHAT'S UP?"))
			{
				translated = whatup;
			}
			else
			{
				translated = "Error No Related Word In Database";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
		return translated;
	}
}
