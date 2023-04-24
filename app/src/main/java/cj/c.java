package cj;

import fm.l;
import gm.m;

/* loaded from: classes2.dex */
public final class c extends m implements l<byte[], tl.l> {

    /* renamed from: b */
    public final /* synthetic */ h f4882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar) {
        super(1);
        this.f4882b = hVar;
    }

    @Override // fm.l
    public final tl.l k(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (this.f4882b.f4898l) {
            ((ql.b) this.f4882b.f4901o.getValue()).b(bArr2);
        } else {
            this.f4882b.f4900n.add(bArr2);
        }
        return tl.l.f28297a;
    }
}
