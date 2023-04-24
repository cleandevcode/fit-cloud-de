package cb;

import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g */
    public static final a f4595g = new a(4201, 4096, 1);

    /* renamed from: h */
    public static final a f4596h = new a(1033, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, 1);

    /* renamed from: i */
    public static final a f4597i = new a(67, 64, 1);

    /* renamed from: j */
    public static final a f4598j = new a(19, 16, 1);

    /* renamed from: k */
    public static final a f4599k = new a(285, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 0);

    /* renamed from: l */
    public static final a f4600l = new a(301, DfuBaseService.ERROR_REMOTE_TYPE_LEGACY, 1);

    /* renamed from: a */
    public final int[] f4601a;

    /* renamed from: b */
    public final int[] f4602b;

    /* renamed from: c */
    public final b f4603c;

    /* renamed from: d */
    public final int f4604d;

    /* renamed from: e */
    public final int f4605e;

    /* renamed from: f */
    public final int f4606f;

    public a(int i10, int i11, int i12) {
        this.f4605e = i10;
        this.f4604d = i11;
        this.f4606f = i12;
        this.f4601a = new int[i11];
        this.f4602b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f4601a[i14] = i13;
            i13 <<= 1;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f4602b[this.f4601a[i15]] = i15;
        }
        this.f4603c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    public final int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f4601a;
        int[] iArr2 = this.f4602b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f4604d - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f4605e));
        sb2.append(',');
        return a1.b.a(sb2, this.f4604d, ')');
    }
}
