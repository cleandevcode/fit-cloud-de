package v5;

import android.content.Context;
import gm.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import s.q;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: u */
    public static e f29078u;

    /* renamed from: a */
    public final Context f29082a;

    /* renamed from: b */
    public final Object f29083b;

    /* renamed from: c */
    public final Class<?> f29084c;

    /* renamed from: d */
    public final Class<?> f29085d;

    /* renamed from: e */
    public final Class<?> f29086e;

    /* renamed from: f */
    public final Class<?> f29087f;

    /* renamed from: g */
    public final Class<?> f29088g;

    /* renamed from: h */
    public final Class<?> f29089h;

    /* renamed from: i */
    public final Class<?> f29090i;

    /* renamed from: j */
    public final Method f29091j;

    /* renamed from: k */
    public final Method f29092k;

    /* renamed from: l */
    public final Method f29093l;

    /* renamed from: m */
    public final Method f29094m;

    /* renamed from: n */
    public final Method f29095n;

    /* renamed from: o */
    public final Method f29096o;

    /* renamed from: p */
    public final Method f29097p;

    /* renamed from: q */
    public final i f29098q;

    /* renamed from: r */
    public final CopyOnWriteArraySet f29099r;

    /* renamed from: s */
    public static final b f29076s = new b();

    /* renamed from: t */
    public static final AtomicBoolean f29077t = new AtomicBoolean(false);

    /* renamed from: v */
    public static final AtomicBoolean f29079v = new AtomicBoolean(false);

    /* renamed from: w */
    public static final ConcurrentHashMap f29080w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final ConcurrentHashMap f29081x = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                l.f(obj, "proxy");
                l.f(method, "m");
                if (l.a(method.getName(), "onBillingSetupFinished")) {
                    b bVar = e.f29076s;
                    b.c().set(true);
                } else {
                    String name = method.getName();
                    l.e(name, "m.name");
                    if (om.h.U(name, "onBillingServiceDisconnected", false)) {
                        b bVar2 = e.f29076s;
                        b.c().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:148:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0092 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x01b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:225:0x01b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(android.content.Context r27) {
            /*
                Method dump skipped, instructions count: 495
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.e.b.a(android.content.Context):void");
        }

        public static ConcurrentHashMap b() {
            if (!i6.a.b(e.class)) {
                try {
                    return e.f29080w;
                } catch (Throwable th2) {
                    i6.a.a(e.class, th2);
                }
            }
            return null;
        }

        public static AtomicBoolean c() {
            if (!i6.a.b(e.class)) {
                try {
                    return e.f29079v;
                } catch (Throwable th2) {
                    i6.a.a(e.class, th2);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a */
        public Runnable f29100a;

        /* renamed from: b */
        public final /* synthetic */ e f29101b;

        public c(e eVar, q qVar) {
            l.f(eVar, "this$0");
            this.f29101b = eVar;
            this.f29100a = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0049 A[Catch: Exception -> 0x000f, all -> 0x00a2, TryCatch #1 {Exception -> 0x000f, blocks: (B:87:0x0019, B:96:0x002d, B:104:0x003e, B:106:0x0049, B:110:0x0050, B:118:0x0066, B:120:0x0075, B:126:0x0086, B:127:0x0089, B:116:0x0062, B:102:0x003a, B:94:0x0029), top: B:137:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0050 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x004f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0075 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:153:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "productId"
                java.lang.Class<v5.e> r1 = v5.e.class
                boolean r2 = i6.a.b(r7)
                if (r2 == 0) goto Lb
                return
            Lb:
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> La2
            Lf:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> La2
                if (r2 == 0) goto L9c
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> La2
                int r3 = v5.j.f29124a     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                v5.e r3 = r7.f29101b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r4 = i6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                r5 = 0
                if (r4 == 0) goto L25
                goto L2c
            L25:
                java.lang.Class<?> r3 = r3.f29088g     // Catch: java.lang.Throwable -> L28
                goto L2d
            L28:
                r3 = move-exception
                i6.a.a(r1, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
            L2c:
                r3 = r5
            L2d:
                v5.e r4 = r7.f29101b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r6 = i6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                if (r6 == 0) goto L36
                goto L3d
            L36:
                java.lang.reflect.Method r4 = r4.f29095n     // Catch: java.lang.Throwable -> L39
                goto L3e
            L39:
                r4 = move-exception
                i6.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
            L3d:
                r4 = r5
            L3e:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                java.lang.Object r2 = v5.j.d(r3, r2, r4, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                if (r3 == 0) goto L4c
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                goto L4d
            L4c:
                r2 = r5
            L4d:
                if (r2 != 0) goto L50
                goto Lf
            L50:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                v5.e r2 = r7.f29101b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r4 = i6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                if (r4 == 0) goto L5e
                goto L65
            L5e:
                android.content.Context r2 = r2.f29082a     // Catch: java.lang.Throwable -> L61
                goto L66
            L61:
                r2 = move-exception
                i6.a.a(r1, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
            L65:
                r2 = r5
            L66:
                java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                java.lang.String r4 = "packageName"
                r3.put(r4, r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r2 = r3.has(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                if (r2 == 0) goto Lf
                java.lang.String r2 = r3.getString(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                v5.e r4 = r7.f29101b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                boolean r6 = i6.a.b(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                if (r6 == 0) goto L82
                goto L89
            L82:
                java.util.concurrent.CopyOnWriteArraySet r5 = r4.f29099r     // Catch: java.lang.Throwable -> L85
                goto L89
            L85:
                r4 = move-exception
                i6.a.a(r1, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
            L89:
                r5.add(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                v5.e$b r4 = v5.e.f29076s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                java.util.concurrent.ConcurrentHashMap r4 = v5.e.b.b()     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                java.lang.String r5 = "skuID"
                gm.l.e(r2, r5)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                r4.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> La2
                goto Lf
            L9c:
                java.lang.Runnable r8 = r7.f29100a     // Catch: java.lang.Throwable -> La2
                r8.run()     // Catch: java.lang.Throwable -> La2
                return
            La2:
                r8 = move-exception
                i6.a.a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.e.c.a(java.util.List):void");
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                l.f(obj, "proxy");
                l.f(method, "method");
                if (l.a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                l.f(obj, "proxy");
                l.f(method, "m");
                return null;
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }
    }

    /* renamed from: v5.e$e */
    /* loaded from: classes.dex */
    public final class C0525e implements InvocationHandler {

        /* renamed from: a */
        public Runnable f29102a;

        /* renamed from: b */
        public final /* synthetic */ e f29103b;

        public C0525e(e eVar, Runnable runnable) {
            l.f(eVar, "this$0");
            this.f29103b = eVar;
            this.f29102a = runnable;
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0050 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x004f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0049 A[Catch: Exception -> 0x000f, all -> 0x007e, TryCatch #0 {Exception -> 0x000f, blocks: (B:77:0x0019, B:86:0x002d, B:94:0x003e, B:96:0x0049, B:100:0x0050, B:102:0x005b, B:108:0x006c, B:109:0x006f, B:92:0x003a, B:84:0x0029), top: B:117:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.util.List<?> r8) {
            /*
                r7 = this;
                java.lang.Class<v5.e> r0 = v5.e.class
                java.lang.String r1 = "productId"
                boolean r2 = i6.a.b(r7)
                if (r2 == 0) goto Lb
                return
            Lb:
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7e
            Lf:
                boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L7e
                if (r2 == 0) goto L78
                java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L7e
                int r3 = v5.j.f29124a     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                v5.e r3 = r7.f29103b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                boolean r4 = i6.a.b(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                r5 = 0
                if (r4 == 0) goto L25
                goto L2c
            L25:
                java.lang.Class<?> r3 = r3.f29087f     // Catch: java.lang.Throwable -> L28
                goto L2d
            L28:
                r3 = move-exception
                i6.a.a(r0, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
            L2c:
                r3 = r5
            L2d:
                v5.e r4 = r7.f29103b     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                boolean r6 = i6.a.b(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                if (r6 == 0) goto L36
                goto L3d
            L36:
                java.lang.reflect.Method r4 = r4.f29094m     // Catch: java.lang.Throwable -> L39
                goto L3e
            L39:
                r4 = move-exception
                i6.a.a(r0, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
            L3d:
                r4 = r5
            L3e:
                r6 = 0
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                java.lang.Object r2 = v5.j.d(r3, r2, r4, r6)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                if (r3 == 0) goto L4c
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                goto L4d
            L4c:
                r2 = r5
            L4d:
                if (r2 != 0) goto L50
                goto Lf
            L50:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                r3.<init>(r2)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                boolean r2 = r3.has(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                if (r2 == 0) goto Lf
                java.lang.String r2 = r3.getString(r1)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                v5.e$b r4 = v5.e.f29076s     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                boolean r4 = i6.a.b(r0)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                if (r4 == 0) goto L68
                goto L6f
            L68:
                java.util.concurrent.ConcurrentHashMap r5 = v5.e.f29081x     // Catch: java.lang.Throwable -> L6b
                goto L6f
            L6b:
                r4 = move-exception
                i6.a.a(r0, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
            L6f:
                java.lang.String r4 = "skuID"
                gm.l.e(r2, r4)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                r5.put(r2, r3)     // Catch: java.lang.Exception -> Lf java.lang.Throwable -> L7e
                goto Lf
            L78:
                java.lang.Runnable r8 = r7.f29102a     // Catch: java.lang.Throwable -> L7e
                r8.run()     // Catch: java.lang.Throwable -> L7e
                return
            L7e:
                r8 = move-exception
                i6.a.a(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v5.e.C0525e.a(java.util.List):void");
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (i6.a.b(this)) {
                return null;
            }
            try {
                l.f(obj, "proxy");
                l.f(method, "m");
                if (l.a(method.getName(), "onSkuDetailsResponse")) {
                    Object obj2 = objArr == null ? null : objArr[1];
                    if (obj2 != null && (obj2 instanceof List)) {
                        a((List) obj2);
                    }
                }
                return null;
            } catch (Throwable th2) {
                i6.a.a(this, th2);
                return null;
            }
        }
    }

    public e() {
        throw null;
    }

    public e(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, i iVar) {
        this.f29082a = context;
        this.f29083b = obj;
        this.f29084c = cls;
        this.f29085d = cls2;
        this.f29086e = cls3;
        this.f29087f = cls4;
        this.f29088g = cls5;
        this.f29089h = cls6;
        this.f29090i = cls7;
        this.f29091j = method;
        this.f29092k = method2;
        this.f29093l = method3;
        this.f29094m = method4;
        this.f29095n = method5;
        this.f29096o = method6;
        this.f29097p = method7;
        this.f29098q = iVar;
        this.f29099r = new CopyOnWriteArraySet();
    }

    public static final /* synthetic */ e a() {
        if (i6.a.b(e.class)) {
            return null;
        }
        try {
            return f29078u;
        } catch (Throwable th2) {
            i6.a.a(e.class, th2);
            return null;
        }
    }

    public final void b(s.j jVar) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            int i10 = j.f29124a;
            Object d10 = j.d(this.f29085d, j.d(this.f29084c, this.f29083b, this.f29091j, "inapp"), this.f29092k, new Object[0]);
            List list = d10 instanceof List ? (List) d10 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i11 = j.f29124a;
                    Object d11 = j.d(this.f29086e, obj, this.f29093l, new Object[0]);
                    String str = d11 instanceof String ? (String) d11 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            ConcurrentHashMap concurrentHashMap = f29080w;
                            l.e(string, "skuID");
                            concurrentHashMap.put(string, jSONObject);
                        }
                    }
                }
                d(arrayList, jVar);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void c(q qVar) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f29090i.getClassLoader(), new Class[]{this.f29090i}, new c(this, qVar));
            l.e(newProxyInstance, "newProxyInstance(\n            purchaseHistoryResponseListenerClazz.classLoader,\n            arrayOf(purchaseHistoryResponseListenerClazz),\n            PurchaseHistoryResponseListenerWrapper(runnable))");
            int i10 = j.f29124a;
            j.d(this.f29084c, this.f29083b, this.f29097p, "inapp", newProxyInstance);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void d(ArrayList arrayList, Runnable runnable) {
        if (i6.a.b(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f29089h.getClassLoader(), new Class[]{this.f29089h}, new C0525e(this, runnable));
            l.e(newProxyInstance, "newProxyInstance(\n            skuDetailsResponseListenerClazz.classLoader,\n            arrayOf(skuDetailsResponseListenerClazz),\n            SkuDetailsResponseListenerWrapper(runnable))");
            Object b10 = this.f29098q.b(arrayList);
            int i10 = j.f29124a;
            j.d(this.f29084c, this.f29083b, this.f29096o, b10, newProxyInstance);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }

    public final void e() {
        Method c10;
        if (i6.a.b(this)) {
            return;
        }
        try {
            Class<?> a10 = j.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (c10 = j.c(this.f29084c, "startConnection", a10)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a());
            l.e(newProxyInstance, "newProxyInstance(\n            listenerClazz.classLoader, arrayOf(listenerClazz), BillingClientStateListenerWrapper())");
            j.d(this.f29084c, this.f29083b, c10, newProxyInstance);
        } catch (Throwable th2) {
            i6.a.a(this, th2);
        }
    }
}
