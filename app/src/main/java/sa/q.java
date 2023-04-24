package sa;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public static final a f26800a;

        /* renamed from: sa.q$a$a */
        /* loaded from: classes.dex */
        public class C0477a extends a {

            /* renamed from: b */
            public final /* synthetic */ Method f26801b;

            public C0477a(Method method) {
                this.f26801b = method;
            }

            @Override // sa.q.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f26801b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends a {
            @Override // sa.q.a
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0024  */
        static {
            /*
                int r0 = sa.m.f26774a
                r1 = 9
                r2 = 1
                r3 = 0
                if (r0 < r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L21
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
                sa.q$a$a r1 = new sa.q$a$a     // Catch: java.lang.NoSuchMethodException -> L21
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L21
                goto L22
            L21:
                r1 = 0
            L22:
                if (r1 != 0) goto L29
                sa.q$a$b r1 = new sa.q$a$b
                r1.<init>()
            L29:
                sa.q.a.f26800a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.q.a.<clinit>():void");
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static int a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a10 = ((qa.t) it.next()).a();
            if (a10 != 2) {
                return a10;
            }
        }
        return 1;
    }
}
