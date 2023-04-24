package zm;

import cn.sharesdk.framework.InnerShareParams;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import zm.p;
import zm.q;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a */
    public c f32750a;

    /* renamed from: b */
    public final q f32751b;

    /* renamed from: c */
    public final String f32752c;

    /* renamed from: d */
    public final p f32753d;

    /* renamed from: e */
    public final z f32754e;

    /* renamed from: f */
    public final Map<Class<?>, Object> f32755f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public q f32756a;

        /* renamed from: b */
        public String f32757b;

        /* renamed from: c */
        public p.a f32758c;

        /* renamed from: d */
        public z f32759d;

        /* renamed from: e */
        public LinkedHashMap f32760e;

        public a() {
            this.f32760e = new LinkedHashMap();
            this.f32757b = "GET";
            this.f32758c = new p.a();
        }

        public a(w wVar) {
            this.f32760e = new LinkedHashMap();
            this.f32756a = wVar.f32751b;
            this.f32757b = wVar.f32752c;
            this.f32759d = wVar.f32754e;
            this.f32760e = wVar.f32755f.isEmpty() ? new LinkedHashMap() : ul.z.H(wVar.f32755f);
            this.f32758c = wVar.f32753d.i();
        }

        public final w a() {
            Map unmodifiableMap;
            q qVar = this.f32756a;
            if (qVar != null) {
                String str = this.f32757b;
                p c10 = this.f32758c.c();
                z zVar = this.f32759d;
                LinkedHashMap linkedHashMap = this.f32760e;
                byte[] bArr = an.c.f635a;
                gm.l.f(linkedHashMap, "$this$toImmutableMap");
                if (linkedHashMap.isEmpty()) {
                    unmodifiableMap = ul.t.f28880a;
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                    gm.l.e(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new w(qVar, str, c10, zVar, unmodifiableMap);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final void b(String str, String str2) {
            gm.l.f(str2, "value");
            p.a aVar = this.f32758c;
            aVar.getClass();
            p.f32652b.getClass();
            p.b.a(str);
            p.b.b(str2, str);
            aVar.d(str);
            aVar.b(str, str2);
        }

        public final void c(String str, z zVar) {
            boolean z10;
            gm.l.f(str, "method");
            boolean z11 = false;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (zVar == null) {
                    if (!(!((gm.l.a(str, "POST") || gm.l.a(str, "PUT") || gm.l.a(str, "PATCH") || gm.l.a(str, "PROPPATCH") || gm.l.a(str, "REPORT")) ? true : true))) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a("method ", str, " must have a request body.").toString());
                    }
                } else if (!en.f.d(str)) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a("method ", str, " must not have a request body.").toString());
                }
                this.f32757b = str;
                this.f32759d = zVar;
                return;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public final void d(Object obj, Class cls) {
            gm.l.f(cls, "type");
            if (obj == null) {
                this.f32760e.remove(cls);
                return;
            }
            if (this.f32760e.isEmpty()) {
                this.f32760e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f32760e;
            Object cast = cls.cast(obj);
            gm.l.c(cast);
            linkedHashMap.put(cls, cast);
        }

        public final void e(String str) {
            StringBuilder a10;
            int i10;
            gm.l.f(str, InnerShareParams.URL);
            if (om.h.a0(str, "ws:", true)) {
                a10 = android.support.v4.media.d.a("http:");
                i10 = 3;
            } else {
                if (om.h.a0(str, "wss:", true)) {
                    a10 = android.support.v4.media.d.a("https:");
                    i10 = 4;
                }
                q.f32656l.getClass();
                gm.l.f(str, "$this$toHttpUrl");
                q.a aVar = new q.a();
                aVar.c(null, str);
                this.f32756a = aVar.a();
            }
            String substring = str.substring(i10);
            gm.l.e(substring, "(this as java.lang.String).substring(startIndex)");
            a10.append(substring);
            str = a10.toString();
            q.f32656l.getClass();
            gm.l.f(str, "$this$toHttpUrl");
            q.a aVar2 = new q.a();
            aVar2.c(null, str);
            this.f32756a = aVar2.a();
        }
    }

    public w(q qVar, String str, p pVar, z zVar, Map<Class<?>, ? extends Object> map) {
        gm.l.f(str, "method");
        this.f32751b = qVar;
        this.f32752c = str;
        this.f32753d = pVar;
        this.f32754e = zVar;
        this.f32755f = map;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Request{method=");
        a10.append(this.f32752c);
        a10.append(", url=");
        a10.append(this.f32751b);
        if (this.f32753d.f32653a.length / 2 != 0) {
            a10.append(", headers=[");
            int i10 = 0;
            for (tl.f<? extends String, ? extends String> fVar : this.f32753d) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    tl.f<? extends String, ? extends String> fVar2 = fVar;
                    String str = (String) fVar2.f28286a;
                    String str2 = (String) fVar2.f28287b;
                    if (i10 > 0) {
                        a10.append(", ");
                    }
                    a10.append(str);
                    a10.append(':');
                    a10.append(str2);
                    i10 = i11;
                } else {
                    h7.a.z();
                    throw null;
                }
            }
            a10.append(']');
        }
        if (!this.f32755f.isEmpty()) {
            a10.append(", tags=");
            a10.append(this.f32755f);
        }
        a10.append('}');
        String sb2 = a10.toString();
        gm.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
