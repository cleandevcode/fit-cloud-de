package x4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements r4.f {

    /* renamed from: b */
    public final g f30212b;

    /* renamed from: c */
    public final URL f30213c;

    /* renamed from: d */
    public final String f30214d;

    /* renamed from: e */
    public String f30215e;

    /* renamed from: f */
    public URL f30216f;

    /* renamed from: g */
    public volatile byte[] f30217g;

    /* renamed from: h */
    public int f30218h;

    public f(String str) {
        i iVar = g.f30219a;
        this.f30213c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f30214d = str;
            b0.c.i(iVar);
            this.f30212b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        if (this.f30217g == null) {
            this.f30217g = c().getBytes(r4.f.f25212a);
        }
        messageDigest.update(this.f30217g);
    }

    public final String c() {
        String str = this.f30214d;
        if (str != null) {
            return str;
        }
        URL url = this.f30213c;
        b0.c.i(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f30216f == null) {
            if (TextUtils.isEmpty(this.f30215e)) {
                String str = this.f30214d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f30213c;
                    b0.c.i(url);
                    str = url.toString();
                }
                this.f30215e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f30216f = new URL(this.f30215e);
        }
        return this.f30216f;
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return c().equals(fVar.c()) && this.f30212b.equals(fVar.f30212b);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        if (this.f30218h == 0) {
            int hashCode = c().hashCode();
            this.f30218h = hashCode;
            this.f30218h = this.f30212b.hashCode() + (hashCode * 31);
        }
        return this.f30218h;
    }

    public final String toString() {
        return c();
    }

    public f(URL url) {
        i iVar = g.f30219a;
        b0.c.i(url);
        this.f30213c = url;
        this.f30214d = null;
        b0.c.i(iVar);
        this.f30212b = iVar;
    }
}
