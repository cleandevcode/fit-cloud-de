package h3;

import f3.m;
import o3.p;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ p f15754a;

    /* renamed from: b */
    public final /* synthetic */ b f15755b;

    public a(b bVar, p pVar) {
        this.f15755b = bVar;
        this.f15754a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.c().a(b.f15756d, String.format("Scheduling work %s", this.f15754a.f22625a), new Throwable[0]);
        this.f15755b.f15757a.a(this.f15754a);
    }
}
