package jj;

import p000do.a;

/* loaded from: classes2.dex */
public final class r0 extends tk.i<byte[]> {

    /* renamed from: a */
    public final tk.l<bj.b> f17964a;

    /* loaded from: classes2.dex */
    public static final class a implements tk.n<bj.b>, uk.c {

        /* renamed from: a */
        public final tk.n<? super byte[]> f17965a;

        /* renamed from: b */
        public boolean f17966b;

        /* renamed from: c */
        public uk.c f17967c;

        /* renamed from: d */
        public b f17968d = null;

        public a(tk.n<? super byte[]> nVar) {
            this.f17965a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f17967c, cVar)) {
                this.f17967c = cVar;
                this.f17965a.a(this);
            }
        }

        @Override // tk.n
        public final void b(bj.b bVar) {
            byte[] bArr;
            boolean z10;
            boolean z11;
            bj.b bVar2 = bVar;
            if (!this.f17966b && (bArr = bVar2.f4399c) != null && bArr.length >= 6) {
                boolean z12 = false;
                int i10 = bArr[0] & 255;
                int i11 = bArr[1] & 255;
                int i12 = bi.r.i(bArr, 2, 2);
                if (i11 == 0) {
                    this.f17968d = new b(i10, i12);
                }
                b bVar3 = this.f17968d;
                if (bVar3 == null) {
                    a.b bVar4 = p000do.a.f13275a;
                    bVar4.t("AliAgent");
                    bVar4.h("Not receive first packet", new Object[0]);
                    return;
                }
                if (bVar3.f17969a == i10 && bVar3.f17970b == i12 && bVar3.f17972d == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    a.b bVar5 = p000do.a.f13275a;
                    bVar5.t("AliAgent");
                    bVar5.h("PacketExcept not match", new Object[0]);
                    return;
                }
                int length = bArr.length - 6;
                int i13 = bVar3.f17970b;
                int i14 = bVar3.f17973e;
                if (i13 - i14 >= length) {
                    System.arraycopy(bArr, 6, bVar3.f17971c, i14, length);
                    bVar3.f17972d++;
                    bVar3.f17973e += length;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    a.b bVar6 = p000do.a.f13275a;
                    bVar6.t("AliAgent");
                    bVar6.h("PacketExcept add fail", new Object[0]);
                } else {
                    b bVar7 = this.f17968d;
                    if (bVar7.f17972d == bVar7.f17969a) {
                        z12 = true;
                    }
                    if (z12) {
                        this.f17965a.b(bVar7.f17971c);
                    } else {
                        return;
                    }
                }
                this.f17968d = null;
            }
        }

        @Override // uk.c
        public final void c() {
            this.f17967c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f17966b) {
                return;
            }
            this.f17966b = true;
            this.f17967c.c();
            this.f17965a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f17966b) {
                ol.a.a(th2);
                return;
            }
            this.f17966b = true;
            this.f17967c.c();
            this.f17965a.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        public final int f17969a;

        /* renamed from: b */
        public final int f17970b;

        /* renamed from: c */
        public final byte[] f17971c;

        /* renamed from: d */
        public int f17972d = 0;

        /* renamed from: e */
        public int f17973e = 0;

        public b(int i10, int i11) {
            this.f17969a = i10;
            this.f17970b = i11;
            this.f17971c = new byte[i11];
        }
    }

    public r0(tk.i iVar) {
        this.f17964a = iVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super byte[]> nVar) {
        this.f17964a.d(new a(nVar));
    }
}
