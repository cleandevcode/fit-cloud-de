package uc;

import kc.w0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public final w0 f28668a;

    /* renamed from: b */
    public final int f28669b;

    /* renamed from: c */
    public final long f28670c;

    /* renamed from: d */
    public final int f28671d;

    /* renamed from: e */
    public final d f28672e;

    /* renamed from: f */
    public final int f28673f;

    public e(w0 w0Var, int i10, long j10, int i11, d dVar, int i12) {
        this.f28668a = w0Var;
        this.f28669b = i10;
        this.f28670c = j10;
        this.f28671d = i11;
        this.f28672e = dVar;
        this.f28673f = i12;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ScanResult{bleDevice=");
        a10.append(this.f28668a);
        a10.append(", rssi=");
        a10.append(this.f28669b);
        a10.append(", timestampNanos=");
        a10.append(this.f28670c);
        a10.append(", callbackType=");
        a10.append(b.a(this.f28671d));
        a10.append(", scanRecord=");
        a10.append(pc.b.a(this.f28672e.getBytes()));
        a10.append(", isConnectable=");
        a10.append(a1.b.b(this.f28673f));
        a10.append('}');
        return a10.toString();
    }
}
