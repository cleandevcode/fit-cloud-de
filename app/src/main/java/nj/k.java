package nj;

import mj.a;
import p000do.a;

/* loaded from: classes2.dex */
public final class k extends mj.a {

    /* loaded from: classes2.dex */
    public static final class a extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr, int i10) {
            super(bArr, i10, 2);
            gm.l.f(bArr, "bytes");
        }

        @Override // nj.k.d
        public final void b(int i10) {
            super.b(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a.AbstractC0386a {
        public b(byte[] bArr) {
            super(38, bArr);
        }

        public final k b() {
            return new k(this.f21880b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(bArr);
            gm.l.f(bArr, "bytes");
        }

        @Override // nj.k.d
        public final void b(int i10) {
            super.b(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        public final byte[] f22447a;

        /* renamed from: b */
        public final int f22448b;

        /* renamed from: c */
        public final int[] f22449c;

        /* renamed from: d */
        public int f22450d;

        public d(byte[] bArr, int i10, int i11) {
            this.f22447a = bArr;
            this.f22448b = i10;
            if (bArr == null) {
                this.f22449c = null;
                return;
            }
            int i12 = bArr[i10 + 1] & 255;
            int[] iArr = new int[i12];
            if (i12 > 0) {
                int i13 = bArr[i10] & 255;
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = this.f22447a[this.f22448b + i14 + i11] & 255;
                    iArr[i14] = i15;
                    if (i15 == i13) {
                        this.f22450d = i14;
                    }
                }
            }
            this.f22449c = iArr;
        }

        public final int[] a() {
            int[] iArr = this.f22449c;
            if (iArr != null) {
                return (int[]) iArr.clone();
            }
            return null;
        }

        public void b(int i10) {
            this.f22450d = i10;
            byte[] bArr = this.f22447a;
            if (bArr == null) {
                return;
            }
            int[] iArr = this.f22449c;
            if (iArr != null && iArr.length > i10) {
                bArr[this.f22448b] = (byte) iArr[i10];
                return;
            }
            a.b bVar = p000do.a.f13275a;
            bVar.t("Fc#ScreenVibrate");
            bVar.p("error items", new Object[0]);
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends d {

        /* renamed from: e */
        public boolean f22451e;

        public e(byte[] bArr) {
            super(bArr, 14, 3);
            if (bArr != null) {
                this.f22451e = (bArr[14 + 2] & 255) > 0;
            }
        }
    }

    public k(byte[] bArr) {
        super(38, bArr);
    }
}
