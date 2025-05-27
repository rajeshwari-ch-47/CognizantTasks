// In module com.utils: module-info.java
module com.utils {
    exports com.utils;
}

// In com/utils/Utility.java
package com.utils;
public class Utility {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}

// In module com.greetings: module-info.java
module com.greetings {
    requires com.utils;
}

// In com/greetings/createmodules.java
package com.greetings;
import com.utils.Utility;

public class t34_createmodules {
    public static void main(String[] args) {
        System.out.println(Utility.greet("World"));
    }
}
