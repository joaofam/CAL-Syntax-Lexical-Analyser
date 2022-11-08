import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.BaseErrorListener;

public class error_handling extends BaseErrorListener {

    public static final error_handling INSTANCE = new error_handling();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
       throws ParseCancellationException {
          throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
       }
}