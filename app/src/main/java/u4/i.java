package u4;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements u4.b {

    /* renamed from: a */
    public final g<a, Object> f28484a = new g<>();

    /* renamed from: b */
    public final b f28485b = new b();

    /* renamed from: c */
    public final HashMap f28486c = new HashMap();

    /* renamed from: d */
    public final HashMap f28487d = new HashMap();

    /* renamed from: e */
    public final int f28488e;

    /* renamed from: f */
    public int f28489f;

    /* loaded from: classes.dex */
    public static final class a implements l {

        /* renamed from: a */
        public final b f28490a;

        /* renamed from: b */
        public int f28491b;

        /* renamed from: c */
        public Class<?> f28492c;

        public a(b bVar) {
            this.f28490a = bVar;
        }

        @Override // u4.l
        public final void a() {
            this.f28490a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f28491b == aVar.f28491b && this.f28492c == aVar.f28492c;
            }
            return false;
        }

        public final int hashCode() {
            int i10 = this.f28491b * 31;
            Class<?> cls = this.f28492c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Key{size=");
            a10.append(this.f28491b);
            a10.append("array=");
            a10.append(this.f28492c);
            a10.append('}');
            return a10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c {
        @Override // u4.c
        public final l a() {
            return new a(this);
        }
    }

    public i(int i10) {
        this.f28488e = i10;
    }

    @Override // u4.b
    public final synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                f(this.f28488e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // u4.b
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0023 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:31:0x0001, B:33:0x0013, B:35:0x0017, B:41:0x0023, B:46:0x002f, B:48:0x004d, B:47:0x0040), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:31:0x0001, B:33:0x0013, B:35:0x0017, B:41:0x0023, B:46:0x002f, B:48:0x004d, B:47:0x0040), top: B:54:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040 A[Catch: all -> 0x0053, TryCatch #0 {, blocks: (B:31:0x0001, B:33:0x0013, B:35:0x0017, B:41:0x0023, B:46:0x002f, B:48:0x004d, B:47:0x0040), top: B:54:0x0001 }] */
    @Override // u4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized <T> T c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.i(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L53
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2c
            int r3 = r5.f28489f     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L20
            int r4 = r5.f28488e     // Catch: java.lang.Throwable -> L53
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L1e
            goto L20
        L1e:
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            if (r3 != 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L53
            int r4 = r6 * 8
            if (r3 > r4) goto L2c
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L40
            u4.i$b r6 = r5.f28485b     // Catch: java.lang.Throwable -> L53
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L53
            u4.l r6 = r6.b()     // Catch: java.lang.Throwable -> L53
            u4.i$a r6 = (u4.i.a) r6     // Catch: java.lang.Throwable -> L53
            r6.f28491b = r0     // Catch: java.lang.Throwable -> L53
            r6.f28492c = r7     // Catch: java.lang.Throwable -> L53
            goto L4d
        L40:
            u4.i$b r0 = r5.f28485b     // Catch: java.lang.Throwable -> L53
            u4.l r0 = r0.b()     // Catch: java.lang.Throwable -> L53
            u4.i$a r0 = (u4.i.a) r0     // Catch: java.lang.Throwable -> L53
            r0.f28491b = r6     // Catch: java.lang.Throwable -> L53
            r0.f28492c = r7     // Catch: java.lang.Throwable -> L53
            r6 = r0
        L4d:
            java.lang.Object r6 = r5.h(r6, r7)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r5)
            return r6
        L53:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.i.c(int, java.lang.Class):java.lang.Object");
    }

    @Override // u4.b
    public final synchronized Object d() {
        a aVar;
        aVar = (a) this.f28485b.b();
        aVar.f28491b = 8;
        aVar.f28492c = byte[].class;
        return h(aVar, byte[].class);
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i10);
        if (intValue == 1) {
            i11.remove(valueOf);
        } else {
            i11.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(int i10) {
        while (this.f28489f > i10) {
            Object c10 = this.f28484a.c();
            b0.c.i(c10);
            u4.a g10 = g(c10.getClass());
            this.f28489f -= g10.b() * g10.c(c10);
            e(g10.c(c10), c10.getClass());
            if (Log.isLoggable(g10.a(), 2)) {
                String a10 = g10.a();
                StringBuilder a11 = android.support.v4.media.d.a("evicted: ");
                a11.append(g10.c(c10));
                Log.v(a10, a11.toString());
            }
        }
    }

    public final <T> u4.a<T> g(Class<T> cls) {
        u4.a<T> aVar = (u4.a) this.f28487d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("No array pool found for: ");
                a10.append(cls.getSimpleName());
                throw new IllegalArgumentException(a10.toString());
            }
            this.f28487d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        u4.a<T> g10 = g(cls);
        T t10 = (T) this.f28484a.a(aVar);
        if (t10 != null) {
            this.f28489f -= g10.b() * g10.c(t10);
            e(g10.c(t10), cls);
        }
        if (t10 == null) {
            if (Log.isLoggable(g10.a(), 2)) {
                String a10 = g10.a();
                StringBuilder a11 = android.support.v4.media.d.a("Allocated ");
                a11.append(aVar.f28491b);
                a11.append(" bytes");
                Log.v(a10, a11.toString());
            }
            return g10.newArray(aVar.f28491b);
        }
        return t10;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f28486c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f28486c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // u4.b
    public final synchronized <T> void put(T t10) {
        boolean z10;
        Class<?> cls = t10.getClass();
        u4.a<T> g10 = g(cls);
        int c10 = g10.c(t10);
        int b10 = g10.b() * c10;
        int i10 = 1;
        if (b10 <= this.f28488e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        a aVar = (a) this.f28485b.b();
        aVar.f28491b = c10;
        aVar.f28492c = cls;
        this.f28484a.b(aVar, t10);
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(aVar.f28491b));
        Integer valueOf = Integer.valueOf(aVar.f28491b);
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        i11.put(valueOf, Integer.valueOf(i10));
        this.f28489f += b10;
        f(this.f28488e);
    }
}
