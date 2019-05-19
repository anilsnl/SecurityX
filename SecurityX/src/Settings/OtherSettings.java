
package Settings;

import java.util.Random;

/**
 *
 * @author anild
 */
public class OtherSettings {
    
    
    public static String ganeratePass()
    {
        String[] laters ={"A","B","Q","X","P","M","S"};
        String valuse="S";
        for (String later : laters) {
            Random r = new Random();
            int a;
            a = r.nextInt(laters.length);
            valuse+=laters[a];
        }
        
        return valuse;
    }
    
    
    
}
