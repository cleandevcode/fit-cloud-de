package d6;

import java.util.Arrays;
import java.util.EnumSet;

/* loaded from: classes.dex */
public enum j0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("None"),
    f12696c("Enabled"),
    f12697d("RequireConfirm");
    

    /* renamed from: b */
    public static final EnumSet<j0> f12695b;

    /* renamed from: a */
    public final long f12699a;

    static {
        EnumSet<j0> allOf = EnumSet.allOf(j0.class);
        gm.l.e(allOf, "allOf(SmartLoginOption::class.java)");
        f12695b = allOf;
    }

    j0(String str) {
        this.f12699a = r2;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static j0[] valuesCustom() {
        return (j0[]) Arrays.copyOf(values(), 3);
    }
}
