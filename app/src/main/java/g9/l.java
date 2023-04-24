package g9;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ t f15040a;

    /* renamed from: b */
    public final /* synthetic */ m f15041b;

    public l(m mVar, t tVar) {
        this.f15041b = mVar;
        this.f15040a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15041b.f15043b) {
            c cVar = this.f15041b.f15044c;
            if (cVar != null) {
                cVar.d(this.f15040a);
            }
        }
    }
}
