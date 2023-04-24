package w1;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum a0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(g.class, g.f29563b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: a */
    public final Object f29535a;

    a0(Class cls, Serializable serializable) {
        this.f29535a = serializable;
    }
}
