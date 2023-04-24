package m2;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r2.c;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a */
    public volatile r2.b f20261a;

    /* renamed from: b */
    public Executor f20262b;

    /* renamed from: c */
    public c0 f20263c;

    /* renamed from: d */
    public r2.c f20264d;

    /* renamed from: f */
    public boolean f20266f;

    /* renamed from: g */
    public List<? extends b> f20267g;

    /* renamed from: k */
    public final Map<String, Object> f20271k;

    /* renamed from: l */
    public final LinkedHashMap f20272l;

    /* renamed from: e */
    public final m f20265e = e();

    /* renamed from: h */
    public LinkedHashMap f20268h = new LinkedHashMap();

    /* renamed from: i */
    public final ReentrantReadWriteLock f20269i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f20270j = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class a<T extends t> {

        /* renamed from: a */
        public final Context f20273a;

        /* renamed from: b */
        public final Class<T> f20274b;

        /* renamed from: c */
        public final String f20275c;

        /* renamed from: g */
        public Executor f20279g;

        /* renamed from: h */
        public Executor f20280h;

        /* renamed from: i */
        public c.InterfaceC0458c f20281i;

        /* renamed from: j */
        public boolean f20282j;

        /* renamed from: m */
        public boolean f20285m;

        /* renamed from: q */
        public HashSet f20289q;

        /* renamed from: d */
        public final ArrayList f20276d = new ArrayList();

        /* renamed from: e */
        public final ArrayList f20277e = new ArrayList();

        /* renamed from: f */
        public ArrayList f20278f = new ArrayList();

        /* renamed from: k */
        public int f20283k = 1;

        /* renamed from: l */
        public boolean f20284l = true;

        /* renamed from: n */
        public long f20286n = -1;

        /* renamed from: o */
        public final c f20287o = new c();

        /* renamed from: p */
        public LinkedHashSet f20288p = new LinkedHashSet();

        public a(Context context, Class<T> cls, String str) {
            this.f20273a = context;
            this.f20274b = cls;
            this.f20275c = str;
        }

        public final void a(n2.a... aVarArr) {
            if (this.f20289q == null) {
                this.f20289q = new HashSet();
            }
            for (n2.a aVar : aVarArr) {
                HashSet hashSet = this.f20289q;
                gm.l.c(hashSet);
                hashSet.add(Integer.valueOf(aVar.f21930a));
                HashSet hashSet2 = this.f20289q;
                gm.l.c(hashSet2);
                hashSet2.add(Integer.valueOf(aVar.f21931b));
            }
            this.f20287o.a((n2.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }

        /* JADX WARN: Removed duplicated region for block: B:208:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0083  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final T b() {
            /*
                Method dump skipped, instructions count: 1033
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.t.a.b():m2.t");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(s2.a aVar) {
            gm.l.f(aVar, "db");
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final LinkedHashMap f20290a = new LinkedHashMap();

        public final void a(n2.a... aVarArr) {
            gm.l.f(aVarArr, "migrations");
            for (n2.a aVar : aVarArr) {
                int i10 = aVar.f21930a;
                int i11 = aVar.f21931b;
                LinkedHashMap linkedHashMap = this.f20290a;
                Integer valueOf = Integer.valueOf(i10);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(i11))) {
                    StringBuilder a10 = android.support.v4.media.d.a("Overriding migration ");
                    a10.append(treeMap.get(Integer.valueOf(i11)));
                    a10.append(" with ");
                    a10.append(aVar);
                    Log.w("ROOM", a10.toString());
                }
                treeMap.put(Integer.valueOf(i11), aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    public t() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        gm.l.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f20271k = synchronizedMap;
        this.f20272l = new LinkedHashMap();
    }

    public static Object q(Class cls, r2.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof h) {
            return q(cls, ((h) cVar).a());
        }
        return null;
    }

    public final void a() {
        boolean z10;
        if (this.f20266f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    public final void b() {
        if (!(k() || this.f20270j.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        r2.b T = h().T();
        m mVar = this.f20265e;
        gm.l.e(T, "database");
        mVar.g(T);
        if (T.v0()) {
            T.M();
        } else {
            T.i();
        }
    }

    public final r2.f d(String str) {
        gm.l.f(str, "sql");
        a();
        b();
        r2.f t10 = h().T().t(str);
        gm.l.e(t10, "openHelper.writableDatabase.compileStatement(sql)");
        return t10;
    }

    public abstract m e();

    public abstract r2.c f(g gVar);

    public List g(LinkedHashMap linkedHashMap) {
        gm.l.f(linkedHashMap, "autoMigrationSpecs");
        return ul.s.f28879a;
    }

    public final r2.c h() {
        r2.c cVar = this.f20264d;
        if (cVar != null) {
            return cVar;
        }
        gm.l.l("openHelper");
        throw null;
    }

    public Set<Class<Object>> i() {
        return ul.u.f28881a;
    }

    public Map<Class<?>, List<Class<?>>> j() {
        return ul.t.f28880a;
    }

    public final boolean k() {
        return h().T().r0();
    }

    public final void l() {
        h().T().Y();
        if (!k()) {
            m mVar = this.f20265e;
            if (mVar.f20223f.compareAndSet(false, true)) {
                Executor executor = mVar.f20218a.f20262b;
                if (executor != null) {
                    executor.execute(mVar.f20230m);
                } else {
                    gm.l.l("queryExecutor");
                    throw null;
                }
            }
        }
    }

    public final void m(s2.a aVar) {
        gm.l.f(aVar, "db");
        m mVar = this.f20265e;
        mVar.getClass();
        synchronized (mVar.f20229l) {
            if (mVar.f20224g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                aVar.o("PRAGMA temp_store = MEMORY;");
                aVar.o("PRAGMA recursive_triggers='ON';");
                aVar.o("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                mVar.g(aVar);
                mVar.f20225h = aVar.t("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                mVar.f20224g = true;
                tl.l lVar = tl.l.f28297a;
            }
        }
    }

    public final boolean n() {
        r2.b bVar = this.f20261a;
        return gm.l.a(bVar != null ? Boolean.valueOf(bVar.isOpen()) : null, Boolean.TRUE);
    }

    public final Cursor o(r2.e eVar, CancellationSignal cancellationSignal) {
        Cursor f02;
        String str;
        gm.l.f(eVar, "query");
        a();
        b();
        if (cancellationSignal != null) {
            f02 = h().T().C0(eVar, cancellationSignal);
            str = "{\n            openHelper…(query, signal)\n        }";
        } else {
            f02 = h().T().f0(eVar);
            str = "{\n            openHelper…se.query(query)\n        }";
        }
        gm.l.e(f02, str);
        return f02;
    }

    public final void p() {
        h().T().K();
    }
}
