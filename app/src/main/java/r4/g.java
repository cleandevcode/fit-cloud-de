package r4;

import android.text.TextUtils;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: e */
    public static final a f25213e = new a();

    /* renamed from: a */
    public final T f25214a;

    /* renamed from: b */
    public final b<T> f25215b;

    /* renamed from: c */
    public final String f25216c;

    /* renamed from: d */
    public volatile byte[] f25217d;

    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // r4.g.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f25216c = str;
            this.f25214a = t10;
            this.f25215b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f25213e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f25216c.equals(((g) obj).f25216c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25216c.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Option{key='");
        a10.append(this.f25216c);
        a10.append('\'');
        a10.append('}');
        return a10.toString();
    }
}
