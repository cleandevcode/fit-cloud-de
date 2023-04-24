package id;

import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public byte f16767a;

    /* renamed from: b */
    public int f16768b;

    public a(byte b10, int i10) {
        this.f16767a = b10;
        this.f16768b = i10;
    }

    public static a a(byte[] bArr) {
        if ((bArr != null ? bArr.length : 0) < 2) {
            return null;
        }
        return new a(bArr[0], bArr[1] & 255);
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tmode=%02X, activeGroupIndex=%d }", new Object[]{Byte.valueOf(this.f16767a), Integer.valueOf(this.f16768b)}, d.a("ListeningModeStateReport{"), "\n}");
    }
}
