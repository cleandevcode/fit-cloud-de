package tn;

import java.io.InputStream;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class v extends InputStream {

    /* renamed from: a */
    public byte[] f28414a;

    /* renamed from: b */
    public int f28415b;

    /* renamed from: c */
    public int f28416c;

    /* renamed from: d */
    public byte[] f28417d;

    /* renamed from: e */
    public int f28418e;

    /* renamed from: f */
    public int f28419f;

    /* renamed from: g */
    public int f28420g = 0;

    public v(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        this.f28414a = bArr;
        this.f28417d = bArr2;
        this.f28415b = i10;
        this.f28418e = i12;
        this.f28416c = i11;
        this.f28419f = i13;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10;
        int i11 = this.f28420g;
        int i12 = this.f28416c;
        if (i11 < i12) {
            i10 = this.f28414a[this.f28415b + i11];
        } else if (i11 >= this.f28419f + i12) {
            return -1;
        } else {
            i10 = this.f28417d[(this.f28418e + i11) - i12];
        }
        if (i10 < 0) {
            i10 += DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }
        this.f28420g = i11 + 1;
        return i10;
    }
}
