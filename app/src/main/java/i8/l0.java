package i8;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class l0 extends s0 {

    /* renamed from: d */
    public final int f16683d;

    /* renamed from: e */
    public final Bundle f16684e;

    /* renamed from: f */
    public final /* synthetic */ b f16685f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f16685f = bVar;
        this.f16683d = i10;
        this.f16684e = bundle;
    }

    @Override // i8.s0
    public final /* bridge */ /* synthetic */ void a() {
        f8.a aVar;
        PendingIntent pendingIntent = null;
        if (this.f16683d == 0) {
            if (!d()) {
                this.f16685f.B(1, null);
                aVar = new f8.a(8, null);
            } else {
                return;
            }
        } else {
            this.f16685f.B(1, null);
            Bundle bundle = this.f16684e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            aVar = new f8.a(this.f16683d, pendingIntent);
        }
        c(aVar);
    }

    @Override // i8.s0
    public final void b() {
    }

    public abstract void c(f8.a aVar);

    public abstract boolean d();
}
