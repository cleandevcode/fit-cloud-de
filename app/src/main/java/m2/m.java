package m2;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import bi.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n */
    public static final String[] f20217n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final t f20218a;

    /* renamed from: b */
    public final Map<String, String> f20219b;

    /* renamed from: c */
    public final Map<String, Set<String>> f20220c;

    /* renamed from: d */
    public final LinkedHashMap f20221d;

    /* renamed from: e */
    public final String[] f20222e;

    /* renamed from: f */
    public final AtomicBoolean f20223f;

    /* renamed from: g */
    public volatile boolean f20224g;

    /* renamed from: h */
    public volatile r2.f f20225h;

    /* renamed from: i */
    public final b f20226i;

    /* renamed from: j */
    public final n.b<c, d> f20227j;

    /* renamed from: k */
    public final Object f20228k;

    /* renamed from: l */
    public final Object f20229l;

    /* renamed from: m */
    public final n f20230m;

    /* loaded from: classes.dex */
    public static final class a {
        public static String a(String str, String str2) {
            gm.l.f(str, "tableName");
            gm.l.f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final long[] f20231a;

        /* renamed from: b */
        public final boolean[] f20232b;

        /* renamed from: c */
        public final int[] f20233c;

        /* renamed from: d */
        public boolean f20234d;

        public b(int i10) {
            this.f20231a = new long[i10];
            this.f20232b = new boolean[i10];
            this.f20233c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                if (this.f20234d) {
                    long[] jArr = this.f20231a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f20232b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f20233c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f20233c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f20234d = false;
                    return (int[]) this.f20233c.clone();
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final String[] f20235a;

        public c(String[] strArr) {
            gm.l.f(strArr, "tables");
            this.f20235a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final c f20236a;

        /* renamed from: b */
        public final int[] f20237b;

        /* renamed from: c */
        public final String[] f20238c;

        /* renamed from: d */
        public final Set<String> f20239d;

        public d(c cVar, int[] iArr, String[] strArr) {
            gm.l.f(cVar, "observer");
            this.f20236a = cVar;
            this.f20237b = iArr;
            this.f20238c = strArr;
            this.f20239d = (strArr.length == 0) ^ true ? z0.o(strArr[0]) : ul.u.f28881a;
            if (!(iArr.length == strArr.length)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v6, types: [vl.h] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.Set<java.lang.Integer> r9) {
            /*
                r8 = this;
                int[] r0 = r8.f20237b
                int r1 = r0.length
                r2 = 1
                if (r1 == 0) goto L40
                r3 = 0
                if (r1 == r2) goto L31
                vl.h r0 = new vl.h
                r0.<init>()
                int[] r1 = r8.f20237b
                int r4 = r1.length
                r5 = 0
            L12:
                if (r3 >= r4) goto L2d
                r6 = r1[r3]
                int r7 = r5 + 1
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                boolean r6 = r9.contains(r6)
                if (r6 == 0) goto L29
                java.lang.String[] r6 = r8.f20238c
                r5 = r6[r5]
                r0.add(r5)
            L29:
                int r3 = r3 + 1
                r5 = r7
                goto L12
            L2d:
                bi.z0.c(r0)
                goto L42
            L31:
                r0 = r0[r3]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                boolean r9 = r9.contains(r0)
                if (r9 == 0) goto L40
                java.util.Set<java.lang.String> r0 = r8.f20239d
                goto L42
            L40:
                ul.u r0 = ul.u.f28881a
            L42:
                boolean r9 = r0.isEmpty()
                r9 = r9 ^ r2
                if (r9 == 0) goto L4e
                m2.m$c r9 = r8.f20236a
                r9.a(r0)
            L4e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.m.d.a(java.util.Set):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v6, types: [vl.h] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(java.lang.String[] r12) {
            /*
                r11 = this;
                java.lang.String[] r0 = r11.f20238c
                int r0 = r0.length
                r1 = 1
                if (r0 == 0) goto L49
                r2 = 0
                if (r0 == r1) goto L2f
                vl.h r0 = new vl.h
                r0.<init>()
                int r3 = r12.length
                r4 = 0
            L10:
                if (r4 >= r3) goto L2b
                r5 = r12[r4]
                java.lang.String[] r6 = r11.f20238c
                int r7 = r6.length
                r8 = 0
            L18:
                if (r8 >= r7) goto L28
                r9 = r6[r8]
                boolean r10 = om.h.V(r9, r5)
                if (r10 == 0) goto L25
                r0.add(r9)
            L25:
                int r8 = r8 + 1
                goto L18
            L28:
                int r4 = r4 + 1
                goto L10
            L2b:
                bi.z0.c(r0)
                goto L4b
            L2f:
                int r0 = r12.length
                r3 = 0
            L31:
                if (r3 >= r0) goto L44
                r4 = r12[r3]
                java.lang.String[] r5 = r11.f20238c
                r5 = r5[r2]
                boolean r4 = om.h.V(r4, r5)
                if (r4 == 0) goto L41
                r2 = 1
                goto L44
            L41:
                int r3 = r3 + 1
                goto L31
            L44:
                if (r2 == 0) goto L49
                java.util.Set<java.lang.String> r0 = r11.f20239d
                goto L4b
            L49:
                ul.u r0 = ul.u.f28881a
            L4b:
                boolean r12 = r0.isEmpty()
                r12 = r12 ^ r1
                if (r12 == 0) goto L57
                m2.m$c r12 = r11.f20236a
                r12.a(r0)
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.m.d.b(java.lang.String[]):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: b */
        public final m f20240b;

        /* renamed from: c */
        public final WeakReference<c> f20241c;

        public e(m mVar, o2.b bVar) {
            super(bVar.f20235a);
            this.f20240b = mVar;
            this.f20241c = new WeakReference<>(bVar);
        }

        @Override // m2.m.c
        public final void a(Set<String> set) {
            gm.l.f(set, "tables");
            c cVar = this.f20241c.get();
            if (cVar == null) {
                this.f20240b.c(this);
            } else {
                cVar.a(set);
            }
        }
    }

    public m(t tVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        Object obj;
        String str;
        gm.l.f(tVar, "database");
        this.f20218a = tVar;
        this.f20219b = hashMap;
        this.f20220c = hashMap2;
        this.f20223f = new AtomicBoolean(false);
        this.f20226i = new b(strArr.length);
        gm.l.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f20227j = new n.b<>();
        this.f20228k = new Object();
        this.f20229l = new Object();
        this.f20221d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr[i10];
            Locale locale = Locale.US;
            gm.l.e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            gm.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f20221d.put(lowerCase, Integer.valueOf(i10));
            String str3 = this.f20219b.get(strArr[i10]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                gm.l.e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i10] = lowerCase;
        }
        this.f20222e = strArr2;
        for (Map.Entry<String, String> entry : this.f20219b.entrySet()) {
            Locale locale2 = Locale.US;
            gm.l.e(locale2, "US");
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            gm.l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f20221d.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                gm.l.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f20221d;
                gm.l.f(linkedHashMap, "<this>");
                if (linkedHashMap instanceof ul.y) {
                    obj = ((ul.y) linkedHashMap).b();
                } else {
                    Object obj2 = linkedHashMap.get(lowerCase2);
                    if (obj2 == null && !linkedHashMap.containsKey(lowerCase2)) {
                        throw new NoSuchElementException("Key " + ((Object) lowerCase2) + " is missing in the map.");
                    }
                    obj = obj2;
                }
                linkedHashMap.put(lowerCase3, obj);
            }
        }
        this.f20230m = new n(this);
    }

    @SuppressLint({"RestrictedApi"})
    public final void a(c cVar) {
        d e10;
        boolean z10;
        gm.l.f(cVar, "observer");
        String[] strArr = cVar.f20235a;
        vl.h hVar = new vl.h();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.f20220c;
            Locale locale = Locale.US;
            gm.l.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            gm.l.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.f20220c;
                String lowerCase2 = str.toLowerCase(locale);
                gm.l.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                gm.l.c(set);
                hVar.addAll(set);
            } else {
                hVar.add(str);
            }
        }
        z0.c(hVar);
        Object[] array = hVar.toArray(new String[0]);
        if (array != null) {
            String[] strArr2 = (String[]) array;
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                LinkedHashMap linkedHashMap = this.f20221d;
                Locale locale2 = Locale.US;
                gm.l.e(locale2, "US");
                String lowerCase3 = str2.toLowerCase(locale2);
                gm.l.e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Integer num = (Integer) linkedHashMap.get(lowerCase3);
                if (num != null) {
                    arrayList.add(Integer.valueOf(num.intValue()));
                } else {
                    throw new IllegalArgumentException(a.b.b("There is no table with name ", str2));
                }
            }
            int[] X = ul.q.X(arrayList);
            d dVar = new d(cVar, X, strArr2);
            synchronized (this.f20227j) {
                e10 = this.f20227j.e(cVar, dVar);
            }
            if (e10 == null) {
                b bVar = this.f20226i;
                int[] copyOf = Arrays.copyOf(X, X.length);
                bVar.getClass();
                gm.l.f(copyOf, "tableIds");
                synchronized (bVar) {
                    z10 = false;
                    for (int i10 : copyOf) {
                        long[] jArr = bVar.f20231a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            bVar.f20234d = true;
                            z10 = true;
                        }
                    }
                    tl.l lVar = tl.l.f28297a;
                }
                if (z10) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final boolean b() {
        if (!this.f20218a.n()) {
            return false;
        }
        if (!this.f20224g) {
            this.f20218a.h().T();
        }
        if (!this.f20224g) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(c cVar) {
        d f10;
        boolean z10;
        gm.l.f(cVar, "observer");
        synchronized (this.f20227j) {
            f10 = this.f20227j.f(cVar);
        }
        if (f10 != null) {
            b bVar = this.f20226i;
            int[] iArr = f10.f20237b;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            bVar.getClass();
            gm.l.f(copyOf, "tableIds");
            synchronized (bVar) {
                z10 = false;
                for (int i10 : copyOf) {
                    long[] jArr = bVar.f20231a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        bVar.f20234d = true;
                        z10 = true;
                    }
                }
                tl.l lVar = tl.l.f28297a;
            }
            if (z10) {
                f();
            }
        }
    }

    public final void d(r2.b bVar, int i10) {
        bVar.o("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f20222e[i10];
        String[] strArr = f20217n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder a10 = android.support.v4.media.d.a("CREATE TEMP TRIGGER IF NOT EXISTS ");
            a10.append(a.a(str, str2));
            a10.append(" AFTER ");
            a10.append(str2);
            a10.append(" ON `");
            a10.append(str);
            hj.o.a(a10, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            hj.o.a(a10, " = 1", " WHERE ", "table_id", " = ");
            a10.append(i10);
            a10.append(" AND ");
            a10.append("invalidated");
            a10.append(" = 0");
            a10.append("; END");
            String sb2 = a10.toString();
            gm.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.o(sb2);
        }
    }

    public final void e(r2.b bVar, int i10) {
        String str = this.f20222e[i10];
        String[] strArr = f20217n;
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = strArr[i11];
            StringBuilder a10 = android.support.v4.media.d.a("DROP TRIGGER IF EXISTS ");
            a10.append(a.a(str, str2));
            String sb2 = a10.toString();
            gm.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
            bVar.o(sb2);
        }
    }

    public final void f() {
        if (!this.f20218a.n()) {
            return;
        }
        r2.b T = this.f20218a.h().T();
        gm.l.e(T, "database.getOpenHelper().writableDatabase");
        g(T);
    }

    public final void g(r2.b bVar) {
        gm.l.f(bVar, "database");
        if (bVar.r0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f20218a.f20269i.readLock();
            gm.l.e(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.f20228k) {
                    int[] a10 = this.f20226i.a();
                    if (a10 == null) {
                        return;
                    }
                    if (bVar.v0()) {
                        bVar.M();
                    } else {
                        bVar.i();
                    }
                    int length = a10.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = a10[i10];
                        int i13 = i11 + 1;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                e(bVar, i11);
                            }
                        } else {
                            d(bVar, i11);
                        }
                        i10++;
                        i11 = i13;
                    }
                    bVar.K();
                    bVar.Y();
                    tl.l lVar = tl.l.f28297a;
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException | IllegalStateException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        }
    }
}
