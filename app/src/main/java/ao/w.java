package ao;

import ao.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import zm.p;
import zm.t;

/* loaded from: classes2.dex */
public abstract class w<T> {

    /* loaded from: classes2.dex */
    public static final class a<T> extends w<T> {

        /* renamed from: a */
        public final Method f3864a;

        /* renamed from: b */
        public final int f3865b;

        /* renamed from: c */
        public final ao.f<T, zm.z> f3866c;

        public a(Method method, int i10, ao.f<T, zm.z> fVar) {
            this.f3864a = method;
            this.f3865b = i10;
            this.f3866c = fVar;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            if (t10 != null) {
                try {
                    zVar.f3919k = this.f3866c.a(t10);
                    return;
                } catch (IOException e10) {
                    Method method = this.f3864a;
                    int i10 = this.f3865b;
                    throw h0.l(method, e10, i10, "Unable to convert " + t10 + " to RequestBody", new Object[0]);
                }
            }
            throw h0.k(this.f3864a, this.f3865b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends w<T> {

        /* renamed from: a */
        public final String f3867a;

        /* renamed from: b */
        public final ao.f<T, String> f3868b;

        /* renamed from: c */
        public final boolean f3869c;

        public b(String str, boolean z10) {
            a.d dVar = a.d.f3752a;
            Objects.requireNonNull(str, "name == null");
            this.f3867a = str;
            this.f3868b = dVar;
            this.f3869c = z10;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            String a10;
            if (t10 == null || (a10 = this.f3868b.a(t10)) == null) {
                return;
            }
            zVar.a(this.f3867a, a10, this.f3869c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f3870a;

        /* renamed from: b */
        public final int f3871b;

        /* renamed from: c */
        public final boolean f3872c;

        public c(Method method, int i10, boolean z10) {
            this.f3870a = method;
            this.f3871b = i10;
            this.f3872c = z10;
        }

        @Override // ao.w
        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.a(str, obj2, this.f3872c);
                            } else {
                                Method method = this.f3870a;
                                int i10 = this.f3871b;
                                throw h0.k(method, i10, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.k(this.f3870a, this.f3871b, android.support.v4.media.a.a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(this.f3870a, this.f3871b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(this.f3870a, this.f3871b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> extends w<T> {

        /* renamed from: a */
        public final String f3873a;

        /* renamed from: b */
        public final ao.f<T, String> f3874b;

        public d(String str) {
            a.d dVar = a.d.f3752a;
            Objects.requireNonNull(str, "name == null");
            this.f3873a = str;
            this.f3874b = dVar;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            String a10;
            if (t10 == null || (a10 = this.f3874b.a(t10)) == null) {
                return;
            }
            zVar.b(this.f3873a, a10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f3875a;

        /* renamed from: b */
        public final int f3876b;

        public e(Method method, int i10) {
            this.f3875a = method;
            this.f3876b = i10;
        }

        @Override // ao.w
        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            zVar.b(str, value.toString());
                        } else {
                            throw h0.k(this.f3875a, this.f3876b, android.support.v4.media.a.a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(this.f3875a, this.f3876b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(this.f3875a, this.f3876b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends w<zm.p> {

        /* renamed from: a */
        public final Method f3877a;

        /* renamed from: b */
        public final int f3878b;

        public f(Method method, int i10) {
            this.f3877a = method;
            this.f3878b = i10;
        }

        @Override // ao.w
        public final void a(z zVar, zm.p pVar) {
            zm.p pVar2 = pVar;
            if (pVar2 != null) {
                p.a aVar = zVar.f3914f;
                aVar.getClass();
                int length = pVar2.f32653a.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    aVar.b(pVar2.f(i10), pVar2.j(i10));
                }
                return;
            }
            throw h0.k(this.f3877a, this.f3878b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<T> extends w<T> {

        /* renamed from: a */
        public final Method f3879a;

        /* renamed from: b */
        public final int f3880b;

        /* renamed from: c */
        public final zm.p f3881c;

        /* renamed from: d */
        public final ao.f<T, zm.z> f3882d;

        public g(Method method, int i10, zm.p pVar, ao.f<T, zm.z> fVar) {
            this.f3879a = method;
            this.f3880b = i10;
            this.f3881c = pVar;
            this.f3882d = fVar;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                zm.z a10 = this.f3882d.a(t10);
                zm.p pVar = this.f3881c;
                t.a aVar = zVar.f3917i;
                aVar.getClass();
                gm.l.f(a10, "body");
                t.c.f32693c.getClass();
                aVar.f32692c.add(t.c.a.a(pVar, a10));
            } catch (IOException e10) {
                Method method = this.f3879a;
                int i10 = this.f3880b;
                throw h0.k(method, i10, "Unable to convert " + t10 + " to RequestBody", e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f3883a;

        /* renamed from: b */
        public final int f3884b;

        /* renamed from: c */
        public final ao.f<T, zm.z> f3885c;

        /* renamed from: d */
        public final String f3886d;

        public h(Method method, int i10, ao.f<T, zm.z> fVar, String str) {
            this.f3883a = method;
            this.f3884b = i10;
            this.f3885c = fVar;
            this.f3886d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ao.w
        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String[] strArr = {"Content-Disposition", android.support.v4.media.a.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f3886d};
                            zm.p.f32652b.getClass();
                            zm.p c10 = p.b.c(strArr);
                            zm.z zVar2 = (zm.z) this.f3885c.a(value);
                            t.a aVar = zVar.f3917i;
                            aVar.getClass();
                            gm.l.f(zVar2, "body");
                            t.c.f32693c.getClass();
                            aVar.f32692c.add(t.c.a.a(c10, zVar2));
                        } else {
                            throw h0.k(this.f3883a, this.f3884b, android.support.v4.media.a.a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(this.f3883a, this.f3884b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(this.f3883a, this.f3884b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<T> extends w<T> {

        /* renamed from: a */
        public final Method f3887a;

        /* renamed from: b */
        public final int f3888b;

        /* renamed from: c */
        public final String f3889c;

        /* renamed from: d */
        public final ao.f<T, String> f3890d;

        /* renamed from: e */
        public final boolean f3891e;

        public i(Method method, int i10, String str, boolean z10) {
            a.d dVar = a.d.f3752a;
            this.f3887a = method;
            this.f3888b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f3889c = str;
            this.f3890d = dVar;
            this.f3891e = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x00e9  */
        @Override // ao.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(ao.z r18, T r19) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ao.w.i.a(ao.z, java.lang.Object):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j<T> extends w<T> {

        /* renamed from: a */
        public final String f3892a;

        /* renamed from: b */
        public final ao.f<T, String> f3893b;

        /* renamed from: c */
        public final boolean f3894c;

        public j(String str, boolean z10) {
            a.d dVar = a.d.f3752a;
            Objects.requireNonNull(str, "name == null");
            this.f3892a = str;
            this.f3893b = dVar;
            this.f3894c = z10;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            String a10;
            if (t10 == null || (a10 = this.f3893b.a(t10)) == null) {
                return;
            }
            zVar.c(this.f3892a, a10, this.f3894c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k<T> extends w<Map<String, T>> {

        /* renamed from: a */
        public final Method f3895a;

        /* renamed from: b */
        public final int f3896b;

        /* renamed from: c */
        public final boolean f3897c;

        public k(Method method, int i10, boolean z10) {
            this.f3895a = method;
            this.f3896b = i10;
            this.f3897c = z10;
        }

        @Override // ao.w
        public final void a(z zVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                zVar.c(str, obj2, this.f3897c);
                            } else {
                                Method method = this.f3895a;
                                int i10 = this.f3896b;
                                throw h0.k(method, i10, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw h0.k(this.f3895a, this.f3896b, android.support.v4.media.a.a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw h0.k(this.f3895a, this.f3896b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw h0.k(this.f3895a, this.f3896b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l<T> extends w<T> {

        /* renamed from: a */
        public final boolean f3898a;

        public l(boolean z10) {
            this.f3898a = z10;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            if (t10 == null) {
                return;
            }
            zVar.c(t10.toString(), null, this.f3898a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends w<t.c> {

        /* renamed from: a */
        public static final m f3899a = new m();

        @Override // ao.w
        public final void a(z zVar, t.c cVar) {
            t.c cVar2 = cVar;
            if (cVar2 != null) {
                t.a aVar = zVar.f3917i;
                aVar.getClass();
                aVar.f32692c.add(cVar2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends w<Object> {

        /* renamed from: a */
        public final Method f3900a;

        /* renamed from: b */
        public final int f3901b;

        public n(Method method, int i10) {
            this.f3900a = method;
            this.f3901b = i10;
        }

        @Override // ao.w
        public final void a(z zVar, Object obj) {
            if (obj != null) {
                zVar.f3911c = obj.toString();
                return;
            }
            throw h0.k(this.f3900a, this.f3901b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o<T> extends w<T> {

        /* renamed from: a */
        public final Class<T> f3902a;

        public o(Class<T> cls) {
            this.f3902a = cls;
        }

        @Override // ao.w
        public final void a(z zVar, T t10) {
            zVar.f3913e.d(t10, this.f3902a);
        }
    }

    public abstract void a(z zVar, T t10);
}
