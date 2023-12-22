/*----------------------------------------------------------------------------------------------------------------------
    var değişkenler virgül ile ayrılarak bildirilemez. Bu durumda ayrı ayrı bildirilmeleri gerekir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Application {
    public static void run(String[] args)
    {
        var m = Sample.create();
    }
}

class Sample {
    public static Map<String, ArrayList<String>> create()
    {
        // ...
        return new HashMap<>();
    }
}