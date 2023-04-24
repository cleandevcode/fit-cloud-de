package rc;

/* loaded from: classes.dex */
public final class a0 implements tk.m<q, q> {

    /* renamed from: a */
    public final /* synthetic */ tk.m f25462a;

    /* loaded from: classes.dex */
    public class a implements wk.e<ll.a<String, q>, tk.i<q>> {
        public a() {
            a0.this = r1;
        }

        @Override // wk.e
        public final tk.i<q> apply(ll.a<String, q> aVar) {
            return aVar.c(a0.this.f25462a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements wk.e<q, String> {
        @Override // wk.e
        public final String apply(q qVar) {
            return qVar.f25497a.getAddress();
        }
    }

    public a0(tk.m mVar) {
        this.f25462a = mVar;
    }

    @Override // tk.m
    public final tk.i a(tk.i iVar) {
        b bVar = new b();
        iVar.getClass();
        int i10 = tk.d.f28269a;
        yk.b.a(i10, "bufferSize");
        return new fl.b0(iVar, bVar, i10).o(new a());
    }
}
