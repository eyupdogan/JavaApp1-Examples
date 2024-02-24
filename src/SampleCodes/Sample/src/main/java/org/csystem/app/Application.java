
package org.csystem.app;


import com.karandev.io.util.console.Console;
import org.csystem.app.demo.Singleton;

import java.lang.reflect.InvocationTargetException;

class Application {
    public static void run(String[] args)
    {
        try {
            var cls = Singleton.class;

            var ctor = cls.getDeclaredConstructor(int.class);

            ctor.setAccessible(true);//ctor private olsa dahi setAccessible true olduğu anda erişime açılıyor
            var s = (Singleton)ctor.newInstance(10);
            ctor.setAccessible(false);//işimiz bitince setAccessible yi false çekiyorum

            Console.writeLine("Value:%d", s.getValue());

        }
        catch (NoSuchMethodException | SecurityException | InvocationTargetException | InstantiationException
               | IllegalAccessException ex) {
            Console.Error.writeLine(ex.getMessage());
        }
    }
}