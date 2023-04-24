package y;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30732a;

    /* renamed from: b */
    public final /* synthetic */ na.a f30733b;

    public /* synthetic */ l0(na.a aVar, int i10) {
        this.f30732a = i10;
        this.f30733b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30732a) {
            case 0:
                this.f30733b.cancel(true);
                return;
            default:
                this.f30733b.cancel(true);
                return;
        }
    }
}
