
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;


public class Calc {
    public static void main(String[] args) throws Exception {
        CharStream input;
        if(args.length == 1) {
            String fileName = String.valueOf(args[0]);
            input = CharStreams.fromFileName(fileName);
        }else if(args.length > 1 || args.length < 0){
            throw  new Exception("the number of arguments is false, Please only give the source file or nothing and then you input your text");
        }else {
            InputStream is = System.in;
            input = CharStreams.fromStream(is);
        }
        CalcLexer lexer = new CalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.prog();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        System.out.println(tree.toStringTree(parser));
    }
}
