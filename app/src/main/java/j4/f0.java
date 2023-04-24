package j4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f0 implements t0 {

    /* renamed from: a */
    public static final f0 f17399a = new f0();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        d1 d1Var = i0Var.f17406j;
        p0 p0Var = p0.f17458i;
        try {
            Field declaredField = obj.getClass().getDeclaredField("map");
            if (Modifier.isPrivate(declaredField.getModifiers())) {
                declaredField.setAccessible(true);
            }
            p0Var.e(i0Var, declaredField.get(obj), obj2, type, i10);
        } catch (Exception unused) {
            d1Var.R();
        }
    }
}
