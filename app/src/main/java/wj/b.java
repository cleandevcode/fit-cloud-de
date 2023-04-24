package wj;

import p000do.a;
import wj.b;

/* loaded from: classes2.dex */
public final class b extends ti.c<tl.l> {

    /* renamed from: a */
    public boolean f29964a = true;

    /* renamed from: b */
    public String f29965b = "";

    /* renamed from: c */
    public boolean f29966c = true;

    /* renamed from: d */
    public wj.a f29967d = new tk.m() { // from class: wj.a
        @Override // tk.m
        public final tk.i a(tk.i iVar) {
            b bVar = b.this;
            gm.l.f(bVar, "this$0");
            return iVar.u(new wi.j(5, new b.a()));
        }
    };

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<bj.b, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            b.this = r1;
        }

        @Override // fm.l
        public final tl.l k(bj.b bVar) {
            bj.b bVar2 = bVar;
            byte[] bArr = bVar2.f4399c;
            if (bArr != null && bArr.length >= 1) {
                byte b10 = bArr[0];
                if (b10 == 0) {
                    b bVar3 = b.this;
                    synchronized (bVar3) {
                        if (bVar3.f29964a) {
                            bVar3.f29964a = false;
                        } else {
                            bVar3.f29966c = false;
                        }
                    }
                    return tl.l.f28297a;
                }
                throw new yi.b(b10);
            }
            throw new yi.f(bVar2);
        }
    }

    @Override // ti.c
    public final bj.b d() {
        boolean z10;
        bj.b bVar;
        byte b10;
        synchronized (this) {
            if (this.f29964a && this.f29966c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b10 = 18;
            } else {
                b10 = 20;
            }
            bVar = new bj.b((byte) 3, b10, null);
        }
        return bVar;
    }

    @Override // ti.c
    public final tk.m<bj.b, tl.l> e() {
        return this.f29967d;
    }

    @Override // ti.c
    public final bj.b f() {
        bj.b bVar;
        byte b10;
        synchronized (this) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("Fc#AuthOperation");
            boolean z10 = true;
            bVar2.h("getSend firstAuth:%b userId:%s bindOrLogin:%b", Boolean.valueOf(this.f29964a), this.f29965b, Boolean.valueOf(this.f29966c));
            if (!this.f29964a || !this.f29966c) {
                z10 = false;
            }
            byte[] bArr = new byte[32];
            byte[] bytes = this.f29965b.getBytes();
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 28));
            if (z10) {
                b10 = 17;
            } else {
                b10 = 19;
            }
            bVar = new bj.b((byte) 3, b10, bArr);
        }
        return bVar;
    }
}
