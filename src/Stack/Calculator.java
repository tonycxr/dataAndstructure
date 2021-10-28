package Stack;

public class Calculator {
    public static void main(String[] args) {
        String str = "7-6-1-8";
        CalculatorByStack cal1 = new CalculatorByStack(10);
        CalculatorByStack cal2 = new CalculatorByStack(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";
        while(true){
            ch = str.substring(index,index+1).charAt(0);
            if(cal2.isOper(ch)){
                if(cal2.isEmpty()){
                    cal2.push(ch);
                }else{
                    if(cal2.prior(ch)<=cal2.prior(cal2.peek())){
                        num1 = cal1.getPop();
                        num2 = cal1.getPop();
                        oper = cal2.getPop();
                        res = cal1.cal(num1,num2,oper);
                        cal1.push(res);
                        cal2.push(ch);
                    }else{
                        cal2.push(ch);
                    }

                }
            }else{
                keepNum += ch;
                if(index == str.length()-1){
                    cal1.push(Integer.parseInt(keepNum));
                }else{ if(cal2.isOper(str.substring(index+1,index+2).charAt(0))){
                    cal1.push(Integer.parseInt(keepNum));
                    keepNum = "";
                }}
//                cal1.push(ch - 48);
            }
            index++;
            if(index>=str.length()){
                break;
            }
        }
        while (true){
            if(cal2.isEmpty()){
                break;
            }
            num1 = cal1.getPop();
            num2 = cal1.getPop();
            oper = cal2.getPop();
            res = cal1.cal(num1,num2,oper);
            cal1.push(res);
        }
        System.out.println(cal1.getPop());
    }
}
