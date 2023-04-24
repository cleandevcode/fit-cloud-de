package pc;

import android.support.v4.media.d;
import kc.i0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final int f24001a;

    /* renamed from: b */
    public final int f24002b;

    /* renamed from: c */
    public final int f24003c;

    /* renamed from: d */
    public final boolean f24004d;

    /* renamed from: e */
    public final boolean f24005e;

    /* renamed from: f */
    public final i0.a f24006f;

    public a(int i10, int i11, int i12, boolean z10, boolean z11, i0.a aVar) {
        this.f24001a = i10;
        this.f24002b = i11;
        this.f24003c = i12;
        this.f24004d = z10;
        this.f24005e = z11;
        this.f24006f = aVar;
    }

    public final String toString() {
        StringBuilder a10 = d.a("LoggerSetup{logLevel=");
        a10.append(this.f24001a);
        a10.append(", macAddressLogSetting=");
        a10.append(this.f24002b);
        a10.append(", uuidLogSetting=");
        a10.append(this.f24003c);
        a10.append(", shouldLogAttributeValues=");
        a10.append(this.f24004d);
        a10.append(", shouldLogScannedPeripherals=");
        a10.append(this.f24005e);
        a10.append(", logger=");
        a10.append(this.f24006f);
        a10.append('}');
        return a10.toString();
    }
}
