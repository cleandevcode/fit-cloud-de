package gn;

import gn.f;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends cn.a {

    /* renamed from: e */
    public final /* synthetic */ r f15598e;

    /* renamed from: f */
    public final /* synthetic */ f.d f15599f;

    /* renamed from: g */
    public final /* synthetic */ List f15600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, r rVar, f.d dVar, List list) {
        super(str, true);
        this.f15598e = rVar;
        this.f15599f = dVar;
        this.f15600g = list;
    }

    @Override // cn.a
    public final long a() {
        try {
            f.this.f15551b.b(this.f15598e);
            return -1L;
        } catch (IOException e10) {
            hn.k.f16188c.getClass();
            hn.k kVar = hn.k.f16186a;
            StringBuilder a10 = android.support.v4.media.d.a("Http2Connection.Listener failure for ");
            a10.append(f.this.f15553d);
            String sb2 = a10.toString();
            kVar.getClass();
            hn.k.i(4, sb2, e10);
            try {
                this.f15598e.c(b.PROTOCOL_ERROR, e10);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
