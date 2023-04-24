package oe;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public int f23080a;

    /* renamed from: b */
    public int f23081b;

    /* renamed from: c */
    public byte[] f23082c;

    public a(byte[] bArr, int i10, int i11) {
        this.f23080a = i10;
        this.f23081b = i11;
        this.f23082c = bArr;
    }

    public final String toString() {
        return String.format(Locale.US, "definedId:0x%04d, data: (%d) %s", Integer.valueOf(this.f23080a), Integer.valueOf(this.f23081b), he.a.a(this.f23082c));
    }
}
