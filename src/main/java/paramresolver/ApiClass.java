package paramresolver;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiClass {
  Class<?> typeMMM() default Object.class;
}

