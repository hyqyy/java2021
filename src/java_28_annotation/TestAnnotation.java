package java_28_annotation;

import java.lang.annotation.*;
/**
 * 注解只有一个参数时，参数名定义为value，传值时可省略
 * 参数没有定义默认值时，必须要传值
 * 注解要使用元注解@Target定义使用范围和@Retention使用时机*/

@myAnnotation(name = {"AAA","BBB"})
public class TestAnnotation {


    @myAnnotationTwo("huangyunqiang")
    public static void show(){
        System.out.println("自定义注解和元注解");
    }


}



@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface myAnnotation{
    String value() default ""; // 参数类型 参数名();
    String[] name() default {};

}


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface myAnnotationTwo{
    String value();
}
