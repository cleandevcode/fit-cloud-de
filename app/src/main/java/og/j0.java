package og;

/* loaded from: classes2.dex */
public final class j0 extends gm.m implements fm.l<wi.d, wf.b> {

    /* renamed from: b */
    public static final j0 f23383b = new j0();

    public j0() {
        super(1);
    }

    @Override // fm.l
    public final wf.b k(wi.d dVar) {
        wi.d dVar2 = dVar;
        gm.l.e(dVar2, "it");
        if (dVar2 == wi.d.DISCONNECTED) {
            return wf.b.DISCONNECTED;
        }
        if (dVar2 == wi.d.PRE_CONNECTING) {
            return wf.b.PRE_CONNECTING;
        }
        if (dVar2.compareTo(wi.d.PRE_CONNECTED) <= 0) {
            return wf.b.CONNECTING;
        }
        return wf.b.CONNECTED;
    }
}
