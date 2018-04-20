/**
 * 
 */
package spring.AOP.Example1AnnotationConfig;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_PARAMETER,ElementType.PARAMETER,ElementType.TYPE})
/**
 * @author Ravi
 *
 */
public @interface MyAnnotation {

}
