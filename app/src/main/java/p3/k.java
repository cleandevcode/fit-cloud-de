package p3;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a */
    public g3.l f23815a;

    /* renamed from: b */
    public String f23816b;

    /* renamed from: c */
    public WorkerParameters.a f23817c;

    public k(g3.l lVar, String str, WorkerParameters.a aVar) {
        this.f23815a = lVar;
        this.f23816b = str;
        this.f23817c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23815a.f14898f.f(this.f23816b, this.f23817c);
    }
}
