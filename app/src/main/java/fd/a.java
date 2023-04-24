package fd;

import android.support.v4.media.d;
import cn.sharesdk.framework.Platform;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public boolean f14232a;

    /* renamed from: b */
    public int f14233b;

    /* renamed from: c */
    public int f14234c;

    /* renamed from: d */
    public int f14235d;

    public a(int i10, int i11, int i12, boolean z10) {
        this.f14232a = z10;
        this.f14233b = i10;
        this.f14234c = i11;
        this.f14235d = i12;
    }

    public static a a(byte[] bArr) {
        int i10;
        int length = bArr != null ? bArr.length : 0;
        if (length < 1) {
            return null;
        }
        boolean z10 = bArr[0] == 1;
        int i11 = length >= 3 ? ((bArr[2] << 8) | (bArr[1] & 255)) & Platform.CUSTOMER_ACTION_MASK : 0;
        int i12 = -1;
        if (length >= 5) {
            i12 = bArr[3] & 255;
            i10 = bArr[4] & 255;
        } else {
            i10 = -1;
        }
        return new a(i11, i12, i10, z10);
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tenabled=%b, latencyValue=%d, maxLatencyLevel=%d, currentLatencyLevel=%d }", new Object[]{Boolean.valueOf(this.f14232a), Integer.valueOf(this.f14233b), Integer.valueOf(this.f14234c), Integer.valueOf(this.f14235d)}, d.a("LowLatencyInfo{"), "\n}");
    }
}
