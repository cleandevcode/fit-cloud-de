package t3;

import gm.j;

/* loaded from: classes.dex */
public final class b implements c4.g {

    /* renamed from: a */
    public final /* synthetic */ a f27531a;

    public b(a aVar) {
        this.f27531a = aVar;
    }

    @Override // c4.g
    public final void a() {
        j.e("AliAgentImpl", "send FGS state success.");
    }

    @Override // c4.g
    public final void b(int i10, String str) {
        j.e("AliAgentImpl", "check FGS state send failed..." + str + " code ==> " + i10);
        c4.c cVar = this.f27531a.f27528d;
        if (cVar != null) {
            cVar.b(0, "send FGS_MSG_TYPE_START_FGS_REQ failed");
        }
    }
}
