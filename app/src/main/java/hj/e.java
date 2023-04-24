package hj;

/* loaded from: classes2.dex */
public final class e extends gm.m implements fm.l<wi.d, Boolean> {

    /* renamed from: b */
    public static final e f16127b = new e();

    public e() {
        super(1);
    }

    @Override // fm.l
    public final Boolean k(wi.d dVar) {
        wi.d dVar2 = dVar;
        if (dVar2.compareTo(wi.d.PRE_CONNECTED) >= 0) {
            return Boolean.valueOf(dVar2 == wi.d.CONNECTED);
        }
        throw new IllegalStateException();
    }
}
