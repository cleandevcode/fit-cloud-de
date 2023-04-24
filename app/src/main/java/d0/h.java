package d0;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ na.a f12585a;

    public h(na.a aVar) {
        this.f12585a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12585a.cancel(true);
    }
}
