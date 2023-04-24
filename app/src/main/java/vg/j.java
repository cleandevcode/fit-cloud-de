package vg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import p000do.a;
import zm.a0;
import zm.c0;
import zm.p;
import zm.r;
import zm.s;
import zm.v;
import zm.w;
import zm.z;

/* loaded from: classes2.dex */
public final class j implements r {
    public static boolean b(p pVar) {
        String e10 = pVar.e("Content-Encoding");
        return (e10 == null || om.h.V(e10, "identity") || om.h.V(e10, "gzip")) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.Object, do.a$b] */
    @Override // zm.r
    public final a0 a(en.g gVar) {
        String str;
        Charset charset;
        boolean z10;
        String str2;
        char c10;
        String sb2;
        Long l10;
        Charset charset2;
        w wVar = gVar.f13856f;
        z zVar = wVar.f32754e;
        dn.h a10 = gVar.a();
        if (om.l.c0(wVar.f32751b.f32666j, "/auth/", false)) {
            return gVar.c(wVar);
        }
        StringBuilder a11 = android.support.v4.media.d.a("--> ");
        a11.append(wVar.f32752c);
        a11.append(' ');
        a11.append(wVar.f32751b);
        if (a10 == null) {
            str = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            v vVar = a10.f13244e;
            gm.l.c(vVar);
            sb3.append(vVar);
            str = sb3.toString();
        }
        a11.append(str);
        String sb4 = a11.toString();
        a.b bVar = p000do.a.f13275a;
        bVar.t("HttpLogging");
        bVar.h(sb4, new Object[0]);
        if (zVar == null) {
            bVar.t("HttpLogging");
            bVar.h("--> END " + wVar.f32752c, new Object[0]);
        } else if (b(wVar.f32753d)) {
            bVar.t("HttpLogging");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("--> END ");
            bVar.h(androidx.activity.e.b(sb5, wVar.f32752c, " (encoded body omitted)"), new Object[0]);
        } else {
            ln.e eVar = new ln.e();
            zVar.c(eVar);
            s b10 = zVar.b();
            if (b10 == null || (charset = b10.a(StandardCharsets.UTF_8)) == null) {
                charset = StandardCharsets.UTF_8;
                gm.l.e(charset, "UTF_8");
            }
            bVar.t("HttpLogging");
            bVar.h("", new Object[0]);
            boolean p10 = b0.c.p(eVar);
            bVar.t("HttpLogging");
            if (p10) {
                bVar.h(eVar.J(eVar.f20098b, charset), new Object[0]);
                bVar.t("HttpLogging");
                bVar.h("--> END " + wVar.f32752c + " (" + zVar.a() + "-byte body)", new Object[0]);
            } else {
                StringBuilder a12 = android.support.v4.media.d.a("--> END ");
                a12.append(wVar.f32752c);
                a12.append(" (binary ");
                a12.append(zVar.a());
                a12.append("-byte body omitted)");
                bVar.h(a12.toString(), new Object[0]);
            }
        }
        long nanoTime = System.nanoTime();
        try {
            a0 c11 = gVar.c(wVar);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            c0 c0Var = c11.f32535g;
            gm.l.c(c0Var);
            long a13 = c0Var.a();
            bVar.t("HttpLogging");
            StringBuilder a14 = android.support.v4.media.d.a("<-- ");
            a14.append(c11.f32532d);
            if (c11.f32531c.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str2 = "-byte body)";
                sb2 = "";
                c10 = ' ';
            } else {
                String str3 = c11.f32531c;
                StringBuilder sb6 = new StringBuilder();
                str2 = "-byte body)";
                c10 = ' ';
                sb6.append(' ');
                sb6.append(str3);
                sb2 = sb6.toString();
            }
            a14.append(sb2);
            a14.append(c10);
            a14.append(c11.f32529a.f32751b);
            a14.append(" (");
            a14.append(millis);
            a14.append("ms)");
            bVar.h(a14.toString(), new Object[0]);
            if (!en.e.a(c11)) {
                bVar.t("HttpLogging");
                bVar.h("<-- END HTTP", new Object[0]);
            } else if (b(c11.f32534f)) {
                bVar.t("HttpLogging");
                bVar.h("<-- END HTTP (encoded body omitted)", new Object[0]);
            } else {
                ln.g h10 = c0Var.h();
                h10.g(Long.MAX_VALUE);
                ln.e d10 = h10.d();
                if (om.h.V("gzip", c11.f32534f.e("Content-Encoding"))) {
                    l10 = Long.valueOf(d10.f20098b);
                    ln.l lVar = new ln.l(d10.clone());
                    try {
                        d10 = new ln.e();
                        d10.B(lVar);
                        mf.a0.d(lVar, null);
                    } finally {
                    }
                } else {
                    l10 = null;
                }
                s b11 = c0Var.b();
                if (b11 == null || (charset2 = b11.a(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    gm.l.e(charset2, "UTF_8");
                }
                if (!b0.c.p(d10)) {
                    bVar.t("HttpLogging");
                    bVar.h("", new Object[0]);
                    bVar.t("HttpLogging");
                    bVar.h("<-- END HTTP (binary " + d10.f20098b + "-byte body omitted)", new Object[0]);
                    return c11;
                }
                if (a13 != 0) {
                    bVar.t("HttpLogging");
                    bVar.h("", new Object[0]);
                    bVar.t("HttpLogging");
                    ln.e clone = d10.clone();
                    bVar.h(clone.J(clone.f20098b, charset2), new Object[0]);
                }
                bVar.t("HttpLogging");
                if (l10 != null) {
                    bVar.h("<-- END HTTP (" + d10.f20098b + "-byte, " + l10 + "-gzipped-byte body)", new Object[0]);
                } else {
                    bVar.h("<-- END HTTP (" + d10.f20098b + str2, new Object[0]);
                }
            }
            return c11;
        } catch (Exception e10) {
            ?? r02 = p000do.a.f13275a;
            r02.t("HttpLogging");
            r02.h("<-- HTTP FAILED: " + ((Object) r02), new Object[0]);
            throw r02;
        }
    }
}
