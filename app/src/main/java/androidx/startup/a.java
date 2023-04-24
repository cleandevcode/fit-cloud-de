package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u2.b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public static volatile a f3351d;

    /* renamed from: e */
    public static final Object f3352e = new Object();

    /* renamed from: c */
    public final Context f3355c;

    /* renamed from: b */
    public final HashSet f3354b = new HashSet();

    /* renamed from: a */
    public final HashMap f3353a = new HashMap();

    public a(Context context) {
        this.f3355c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f3351d == null) {
            synchronized (f3352e) {
                if (f3351d == null) {
                    f3351d = new a(context);
                }
            }
        }
        return f3351d;
    }

    public final void a(Bundle bundle) {
        String string = this.f3355c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (u2.a.class.isAssignableFrom(cls)) {
                            this.f3354b.add(cls);
                        }
                    }
                }
                Iterator it = this.f3354b.iterator();
                while (it.hasNext()) {
                    b((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new b(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (w2.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f3353a.containsKey(cls)) {
                hashSet.add(cls);
                u2.a aVar = (u2.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends u2.a<?>>> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends u2.a<?>> cls2 : a10) {
                        if (!this.f3353a.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = aVar.b(this.f3355c);
                hashSet.remove(cls);
                this.f3353a.put(cls, obj);
            } else {
                obj = this.f3353a.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
