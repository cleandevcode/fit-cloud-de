package p3;

import android.content.Context;
import f3.s;
import java.util.UUID;
import q3.a;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ q3.c f23835a;

    /* renamed from: b */
    public final /* synthetic */ UUID f23836b;

    /* renamed from: c */
    public final /* synthetic */ f3.g f23837c;

    /* renamed from: d */
    public final /* synthetic */ Context f23838d;

    /* renamed from: e */
    public final /* synthetic */ p f23839e;

    public o(p pVar, q3.c cVar, UUID uuid, f3.g gVar, Context context) {
        this.f23839e = pVar;
        this.f23835a = cVar;
        this.f23836b = uuid;
        this.f23837c = gVar;
        this.f23838d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f23835a.f24518a instanceof a.b)) {
                String uuid = this.f23836b.toString();
                s f10 = ((o3.r) this.f23839e.f23842c).f(uuid);
                if (f10 != null && !f10.a()) {
                    ((g3.c) this.f23839e.f23841b).e(uuid, this.f23837c);
                    this.f23838d.startService(androidx.work.impl.foreground.a.a(this.f23838d, uuid, this.f23837c));
                } else {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.f23835a.i(null);
        } catch (Throwable th2) {
            this.f23835a.j(th2);
        }
    }
}
