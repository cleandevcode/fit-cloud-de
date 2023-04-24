package zl;

import gm.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import mf.a0;
import zl.f;

@Metadata
/* loaded from: classes2.dex */
public abstract class a implements xl.d<Object>, d, Serializable {

    /* renamed from: a */
    public final xl.d<Object> f32507a;

    public a(xl.d<Object> dVar) {
        this.f32507a = dVar;
    }

    public d g() {
        xl.d<Object> dVar = this.f32507a;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xl.d
    public final void l(Object obj) {
        xl.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            xl.d dVar2 = aVar.f32507a;
            l.c(dVar2);
            try {
                obj = aVar.t(obj);
                if (obj == yl.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = a0.f(th2);
            }
            aVar.u();
            if (!(dVar2 instanceof a)) {
                dVar2.l(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        l.f(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement q() {
        int i10;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v10 = eVar.v();
        if (v10 <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            f.a aVar = f.f32512b;
            if (aVar == null) {
                try {
                    f.a aVar2 = new f.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    f.f32512b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = f.f32511a;
                    f.f32512b = aVar;
                }
            }
            if (aVar != f.f32511a) {
                Method method = aVar.f32513a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = aVar.f32514b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = aVar.f32515c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v10 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object t(Object obj);

    public String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Continuation at ");
        Object q10 = q();
        if (q10 == null) {
            q10 = getClass().getName();
        }
        a10.append(q10);
        return a10.toString();
    }

    public void u() {
    }
}
