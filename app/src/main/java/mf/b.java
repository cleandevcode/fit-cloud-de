package mf;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import mf.a;

/* loaded from: classes.dex */
public final class b extends a.b {
    public b(Type type, Set set, Object obj, Method method, int i10) {
        super(type, set, obj, method, i10, 2, true);
    }

    @Override // mf.a.b
    public final void d(e0 e0Var, Object obj) {
        t<?>[] tVarArr = this.f20498f;
        Object[] objArr = new Object[tVarArr.length + 2];
        objArr[0] = e0Var;
        objArr[1] = obj;
        System.arraycopy(tVarArr, 0, objArr, 2, tVarArr.length);
        try {
            this.f20496d.invoke(this.f20495c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
