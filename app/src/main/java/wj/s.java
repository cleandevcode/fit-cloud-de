package wj;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class s extends gm.m implements fm.l<bj.b, tk.l<? extends byte[]>> {

    /* renamed from: b */
    public final /* synthetic */ r f30007b;

    /* renamed from: c */
    public final /* synthetic */ cj.a f30008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, cj.a aVar) {
        super(1);
        this.f30007b = rVar;
        this.f30008c = aVar;
    }

    @Override // fm.l
    public final tk.l<? extends byte[]> k(bj.b bVar) {
        int i10;
        this.f30007b.f30001c = true;
        byte[] bArr = bVar.f4399c;
        if (bArr != null && bArr.length >= 4) {
            i10 = bi.r.i(bArr, 0, 4);
        } else {
            i10 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE;
        }
        this.f30007b.f30002d = new ArrayList<>((int) Math.ceil(i10 / 20.0f));
        ((cj.h) this.f30008c).f4898l = true;
        return ((cj.h) this.f30008c).e().C(5L, TimeUnit.SECONDS);
    }
}
