package j4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements t0 {

    /* renamed from: a */
    public static volatile Class f17344a = null;

    /* renamed from: b */
    public static volatile boolean f17345b = false;

    /* renamed from: c */
    public static volatile Method f17346c;

    /* renamed from: d */
    public static volatile Method f17347d;

    /* renamed from: e */
    public static d f17348e = new d();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        e4.d dVar;
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        if (interfaces.length == 1 && interfaces[0].isAnnotation()) {
            Class<?> cls = interfaces[0];
            if (f17344a == null && !f17345b) {
                try {
                    f17344a = Class.forName("sun.reflect.annotation.AnnotationType");
                } finally {
                }
            }
            if (f17344a != null) {
                if (f17346c == null && !f17345b) {
                    try {
                        f17346c = f17344a.getMethod("getInstance", Class.class);
                    } finally {
                    }
                }
                if (f17347d == null && !f17345b) {
                    try {
                        f17347d = f17344a.getMethod("members", new Class[0]);
                    } finally {
                    }
                }
                if (f17346c != null && !f17345b) {
                    try {
                        Object[] objArr = {cls};
                        Object obj3 = null;
                        try {
                            Map map = (Map) f17347d.invoke(f17346c.invoke(null, objArr), new Object[0]);
                            e4.e eVar = new e4.e(map.size(), false);
                            for (Map.Entry entry : map.entrySet()) {
                                try {
                                    obj3 = ((Method) entry.getValue()).invoke(obj, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException unused) {
                                }
                                eVar.f13350i.put((String) entry.getKey(), e4.a.p(obj3));
                            }
                            i0Var.s(eVar);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                }
                throw new e4.d("not support Type Annotation.");
            }
            throw new e4.d("not support Type Annotation.");
        }
    }
}
