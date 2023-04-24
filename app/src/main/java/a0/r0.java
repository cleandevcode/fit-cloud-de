package a0;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import p0.c;

/* loaded from: classes.dex */
public final class r0 implements d0.c<List<Surface>> {

    /* renamed from: a */
    public final /* synthetic */ boolean f173a;

    /* renamed from: b */
    public final /* synthetic */ c.a f174b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledFuture f175c;

    public r0(boolean z10, c.a aVar, ScheduledFuture scheduledFuture) {
        this.f173a = z10;
        this.f174b = aVar;
        this.f175c = scheduledFuture;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        this.f174b.a(Collections.unmodifiableList(Collections.emptyList()));
        this.f175c.cancel(true);
    }

    @Override // d0.c
    public final void onSuccess(List<Surface> list) {
        ArrayList arrayList = new ArrayList(list);
        if (this.f173a) {
            arrayList.removeAll(Collections.singleton(null));
        }
        this.f174b.a(arrayList);
        this.f175c.cancel(true);
    }
}
