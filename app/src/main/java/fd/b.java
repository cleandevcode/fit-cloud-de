package fd;

import android.support.v4.media.d;
import cn.sharesdk.framework.Platform;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public int f14236a;

    /* renamed from: b */
    public int f14237b;

    public b(int i10, int i11) {
        this.f14237b = i10;
        this.f14236a = i11;
    }

    public static b a(byte[] bArr) {
        if ((bArr != null ? bArr.length : 0) < 3) {
            return null;
        }
        return new b(((bArr[1] & 255) | (bArr[2] << 8)) & Platform.CUSTOMER_ACTION_MASK, bArr[0] & 255);
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tlatencyValue=%d, currentLatencyLevel=%d }", new Object[]{Integer.valueOf(this.f14237b), Integer.valueOf(this.f14236a)}, d.a("LowLatencyLevelReport{"), "\n}");
    }
}
