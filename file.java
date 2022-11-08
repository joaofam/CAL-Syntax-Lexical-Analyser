import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.FileInputStream;
import java.io.InputStream;

public class file
{
	public static void main (String[] args) throws Exception
	{
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
			
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		
		try {
			fileLexer lexer = new fileLexer(CharStreams.fromStream(is));

			CommonTokenStream tokens = new CommonTokenStream(lexer);
			fileParser parser = new fileParser(tokens);
			parser.removeErrorListeners();
   			parser.addErrorListener(error_handling.INSTANCE);


			parser.prog();
			System.out.println(args[0] + " parsed Successfully");


		} catch (ParseCancellationException e){
			System.out.println(args[0] + " has not parsed");
		}
		
	}
}