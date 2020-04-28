package replIt;
/*
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Methods_159 {
    public static String c_profits (int buyPrice,int sellPrice){
        if(buyPrice <  sellPrice){
            System.out.println("profit");
            return "profit";

        }else if(buyPrice > sellPrice){
            System.out.println("loss");
            return "loss";
        }else{
            System.out.println("no loss");
            return "no loss";
        }

    }
      public static void main(String[] args) {
        c_profits(100, 100);
    }

}
