
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalcBaseVisitor<Double> {
    Map<String, Double> memory = new HashMap<String, Double>();

    //id = expr
    @Override
    public Double visitAssign(CalcParser.AssignContext ctx){
        String id = ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    // expr
    @Override
    public Double visitPrintExpr(CalcParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());
        //保留两位有数字的方法
        DecimalFormat df = new DecimalFormat("#.##");
        String s_value = df.format(value);
        System.out.println(s_value);
        return 0.0;
    }

    //print
    @Override
    public Double visitPrint(CalcParser.PrintContext ctx){
        String id = ctx.ID().getText();
        Double value=0.0;
        if(memory.containsKey(id)) value = memory.get(id);
        DecimalFormat df = new DecimalFormat("#.##");
        String s_value = df.format(value);
        System.out.println(s_value);
        return value;

    }

    //Number
    @Override
    public Double  visitNumber(CalcParser.NumberContext ctx){
        int size = ctx.getChildCount();
        if(size == 2){
            if(ctx.sign.getType() == CalcParser.SUB){
                return -1 *  Double.valueOf(ctx.getChild(1).getText());
            }else{
                return Double.valueOf(ctx.getChild(1).getText());
            }
        }else{
            return Double.valueOf(ctx.getChild(0).getText());
        }
    }

    //ID
    @Override
    public Double visitId(CalcParser.IdContext ctx){
        String id = ctx.ID().getText();
        if(memory.containsKey(id)) return memory.get(id);
        return 0.0;
    }

    //expr op=('*'|'/') expr
    @Override
    public Double visitMulDiv(CalcParser.MulDivContext ctx)  {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));

        if(ctx.op.getType() == CalcParser.MUL){
            return left * right;
        }else{
            if(right == 0 || right == 0.0){
                System.out.println("Divisor can not be zero");
                return 0.0;
            }else{
                return left / right;
            }
        }
    }

    //expr op=('+'|'-') expr
    @Override
    public Double visitAddSub(CalcParser.AddSubContext ctx){
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if(ctx.op.getType() == CalcParser.ADD)
            return left + right;
        return left - right;
    }

    // '(' expr ')'
    @Override
    public Double visitParens(CalcParser.ParensContext ctx){
        return visit(ctx.expr());
    }

    // '^'
    @Override
    public Double visitPower(CalcParser.PowerContext ctx){
        Double base = visit(ctx.expr(0));
        Double exponet = visit(ctx.expr(1));
        return Math.pow(base, exponet);
    }
}
