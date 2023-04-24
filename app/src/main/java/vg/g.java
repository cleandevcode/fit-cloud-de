package vg;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import zm.a0;
import zm.c0;
import zm.s;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public static final Charset f29379a = StandardCharsets.UTF_8;

    public static String a(a0 a0Var) {
        boolean z10;
        ln.e eVar;
        long j10;
        int i10;
        gm.l.f(a0Var, "response");
        c0 c0Var = a0Var.f32535g;
        if (c0Var == null || c0Var.a() == 0) {
            return null;
        }
        String e10 = a0Var.f32534f.e("Content-Encoding");
        boolean z11 = true;
        if (e10 != null && !om.h.V(e10, "identity")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        ln.g h10 = c0Var.h();
        h10.g(Long.MAX_VALUE);
        ln.e d10 = h10.d();
        Charset charset = f29379a;
        s b10 = c0Var.b();
        if (b10 != null) {
            try {
                charset = b10.a(charset);
            } catch (UnsupportedCharsetException unused) {
                return null;
            }
        }
        if (charset == null) {
            return null;
        }
        try {
            eVar = new ln.e();
            long j11 = d10.f20098b;
            if (j11 < 64) {
                j10 = j11;
            } else {
                j10 = 64;
            }
            d10.v(eVar, 0L, j10);
        } catch (EOFException unused2) {
        }
        for (i10 = 0; i10 < 16; i10++) {
            if (eVar.A()) {
                break;
            }
            int R = eVar.R();
            if (Character.isISOControl(R) && !Character.isWhitespace(R)) {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            return null;
        }
        ln.e clone = d10.clone();
        return clone.J(clone.f20098b, charset);
    }
}
