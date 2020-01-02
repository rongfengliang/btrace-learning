import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * This script traces method entry into every method of 
 * every class in com.dalong.Application! Think before using 
 * this script -- this will slow down your app significantly!!
 */
@BTrace public class Simple {
    @OnMethod(
        clazz="/.*/",
        method="/.*/",
        location=@Location(value=Kind.CALL, clazz="/.*/", method="/.*/"))
    public static void m(@ProbeClassName String probeClass, @ProbeMethodName String probeMethod) {
        print(Strings.strcat("entered ", probeClass));
        println(Strings.strcat(".", probeMethod));
    }
}