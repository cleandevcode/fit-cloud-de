package cd;

import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public byte f4611a;

    /* renamed from: b */
    public int f4612b;

    /* renamed from: c */
    public int f4613c;

    /* renamed from: d */
    public int f4614d;

    /* renamed from: e */
    public int f4615e;

    public b(byte b10, int i10, int i11, int i12, int i13) {
        this.f4611a = b10;
        this.f4612b = i10;
        this.f4613c = i11;
        this.f4614d = i12;
        this.f4615e = i13;
    }

    public final bd.b a() {
        return new bd.b(this.f4612b, this.f4613c, this.f4614d, this.f4615e);
    }

    public final boolean b() {
        return this.f4611a == 0;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\tresult=0x%02X, L=(%d/%d), R=(%d/%d)", new Object[]{Byte.valueOf(this.f4611a), Integer.valueOf(this.f4612b), Integer.valueOf(this.f4613c), Integer.valueOf(this.f4614d), Integer.valueOf(this.f4615e)}, d.a("SetAptVolumeRsp {"), "\n}");
    }
}
