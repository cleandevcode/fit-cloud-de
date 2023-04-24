package com.mob.commons.a;

import com.mob.commons.g;
import com.mob.commons.o;
import com.mob.commons.u;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: g */
    private static final WeakHashMap<String, Object> f8216g = new WeakHashMap<>();

    /* renamed from: a */
    public Object f8217a;

    /* renamed from: c */
    private final String f8219c;

    /* renamed from: d */
    private final String f8220d;

    /* renamed from: e */
    private final long f8221e;

    /* renamed from: f */
    private final long f8222f;

    /* renamed from: b */
    public int f8218b = 0;

    /* renamed from: h */
    private int f8223h = 2;

    /* renamed from: i */
    private boolean f8224i = false;

    /* renamed from: com.mob.commons.a.a$a */
    /* loaded from: classes.dex */
    public static class C0105a {

        /* renamed from: a */
        private static WeakHashMap<Integer, a> f8228a = new WeakHashMap<>();

        public static synchronized a b(Class<? extends a> cls) {
            a aVar;
            synchronized (C0105a.class) {
                aVar = f8228a.get(Integer.valueOf(cls.getName().hashCode()));
            }
            return aVar;
        }

        public static synchronized void c(a aVar) {
            synchronized (C0105a.class) {
                f8228a.put(Integer.valueOf(aVar.getClass().getName().hashCode()), aVar);
            }
        }

        public static synchronized void d(a aVar) {
            synchronized (C0105a.class) {
                f8228a.remove(Integer.valueOf(aVar.getClass().getName().hashCode()));
            }
        }
    }

    public a(String str, long j10, String str2, long j11) {
        this.f8219c = str;
        this.f8220d = str2;
        this.f8221e = j10;
        this.f8222f = j11;
    }

    public static a a(Class<? extends a> cls) {
        a b10 = C0105a.b(cls);
        if (b10 == null) {
            try {
                return cls.newInstance();
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
                return b10;
            }
        }
        return b10;
    }

    public <T> T a(String str, T t10) {
        return (T) com.mob.commons.b.a(str, t10);
    }

    public void a() {
        this.f8224i = true;
    }

    public void a(int i10) {
        this.f8223h = i10;
    }

    public void a(long j10) {
        a(j10, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(long j10, Object obj) {
        d.a().a(j10, getClass(), new Object[]{Integer.valueOf(this.f8218b + 1), obj}, this.f8223h);
    }

    public void a(com.mob.tools.utils.b<HashMap<String, Object>> bVar) {
        bVar.a(null);
    }

    public void a(String str, HashMap<String, Object> hashMap) {
        a(str, hashMap, false);
    }

    public void a(String str, HashMap<String, Object> hashMap, boolean z10) {
        final long currentTimeMillis = System.currentTimeMillis();
        final HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put(o.a("004dYdiHei"), str);
        if (hashMap != null) {
            hashMap2.put(o.a("004h_dfMd=df"), hashMap);
        }
        hashMap2.put(o.a("008h1df!didOde7li"), Long.valueOf(currentTimeMillis));
        if (z10) {
            a(new com.mob.tools.utils.b<HashMap<String, Object>>() { // from class: com.mob.commons.a.a.1
                @Override // com.mob.tools.utils.b
                public void a(HashMap<String, Object> hashMap3) {
                    hashMap2.put(o.a("002Adged"), hashMap3);
                    com.mob.commons.d.a().a(currentTimeMillis, hashMap2);
                }
            });
        } else {
            com.mob.commons.d.a().a(currentTimeMillis, hashMap2);
        }
    }

    public String b() {
        return this.f8219c;
    }

    public boolean c() {
        return ((Long) com.mob.commons.b.a(this.f8219c, Long.valueOf(this.f8221e))).longValue() != 0 && l();
    }

    public boolean d() {
        return this.f8218b == 0;
    }

    public boolean e() {
        return f();
    }

    public boolean f() {
        if (c()) {
            u.f8516c.execute(this);
            return true;
        }
        return false;
    }

    public boolean g() {
        boolean a10 = com.mob.commons.b.a();
        boolean b10 = com.mob.commons.b.b();
        if (a10 && b10) {
            boolean c10 = c();
            NLog mobLog = MobLog.getInstance();
            StringBuilder a11 = android.support.v4.media.d.a("run clt: ");
            a11.append(getClass().getSimpleName());
            a11.append(", to: ");
            a11.append(a10);
            a11.append(", conn: ");
            a11.append(b10);
            a11.append(", ");
            a11.append(this.f8219c);
            a11.append(": ");
            a11.append(c10);
            a11.append(", key: ");
            a11.append(a(this.f8219c, (String) 0));
            a11.append(", gp: ");
            a11.append(k());
            mobLog.d(a11.toString(), new Object[0]);
            return c10;
        }
        NLog mobLog2 = MobLog.getInstance();
        StringBuilder a12 = android.support.v4.media.d.a("run clt: ");
        a12.append(b());
        a12.append(", to: ");
        a12.append(a10);
        a12.append(", conn: ");
        a12.append(b10);
        mobLog2.d(a12.toString(), new Object[0]);
        return false;
    }

    public abstract void h();

    public void i() {
        long k10 = k();
        if (k10 <= 0 || k10 >= 604800) {
            return;
        }
        a(k10);
    }

    public void j() {
    }

    public long k() {
        try {
            String str = this.f8220d;
            if (str != null) {
                return Long.parseLong(String.valueOf(com.mob.commons.b.a(str, Long.valueOf(this.f8222f))));
            }
            return 0L;
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
            return 0L;
        }
    }

    public final boolean l() {
        if ("bs,l,ol,wi,wl,ext,aa,".contains(this.f8219c + ",")) {
            return g.a().b();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (g()) {
                if (!com.mob.commons.b.d()) {
                    a(60000L);
                    try {
                        j();
                        return;
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                        return;
                    }
                }
                h();
                if (this.f8224i) {
                    C0105a.c(this);
                } else {
                    C0105a.d(this);
                }
                i();
            }
            j();
        } catch (Throwable th3) {
            MobLog.getInstance().d(th3);
        }
    }
}
