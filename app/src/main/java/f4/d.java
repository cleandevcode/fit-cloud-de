package f4;

import e4.m;
import h4.k;
import j4.b1;
import j4.e1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface d {
    boolean alphabetic() default true;

    boolean asm() default true;

    Class<? extends k.c> autoTypeCheckHandler() default k.c.class;

    Class<?> builder() default Void.class;

    Class<?> deserializer() default Void.class;

    String[] ignores() default {};

    String[] includes() default {};

    Class<?> mappingTo() default Void.class;

    m naming() default m.NeverUseThisValueExceptDefaultValue;

    String[] orders() default {};

    h4.b[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    boolean serializeEnumAsJavaBean() default false;

    Class<?> serializer() default Void.class;

    e1[] serialzeFeatures() default {};

    Class<? extends b1>[] serialzeFilters() default {};

    String typeKey() default "";

    String typeName() default "";
}
