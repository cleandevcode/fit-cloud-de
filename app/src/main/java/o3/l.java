package o3;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a */
    public final m2.t f22619a;

    /* renamed from: b */
    public final a f22620b;

    /* loaded from: classes.dex */
    public class a extends m2.i<j> {
        public a(m2.t tVar) {
            super(tVar);
        }

        @Override // m2.a0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // m2.i
        public final void d(r2.f fVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.f22617a;
            if (str == null) {
                fVar.m0(1);
            } else {
                fVar.p(1, str);
            }
            String str2 = jVar2.f22618b;
            if (str2 == null) {
                fVar.m0(2);
            } else {
                fVar.p(2, str2);
            }
        }
    }

    public l(m2.t tVar) {
        this.f22619a = tVar;
        this.f22620b = new a(tVar);
    }
}
