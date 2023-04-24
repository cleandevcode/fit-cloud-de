package a;

import a.e;

/* loaded from: classes.dex */
public final class d implements c4.g {

    /* renamed from: a */
    public final /* synthetic */ e.a f2a;

    public d(e.a aVar) {
        this.f2a = aVar;
    }

    @Override // c4.g
    public final void a() {
    }

    @Override // c4.g
    public final void b(int i10, String str) {
        c4.c cVar;
        c4.d dVar = this.f2a.f6b;
        if (dVar == null || (cVar = ((t3.a) dVar).f27528d) == null) {
            return;
        }
        cVar.b(0, "send FGS_MSG_TYPE_DS_DOWNLOAD_REQ failed");
    }
}
