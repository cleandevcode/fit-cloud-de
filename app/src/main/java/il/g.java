package il;

import java.util.concurrent.ThreadFactory;
import tk.o;

/* loaded from: classes2.dex */
public final class g extends tk.o {

    /* renamed from: d */
    public static final i f17170d = new i(false, "RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* renamed from: c */
    public final ThreadFactory f17171c = f17170d;

    @Override // tk.o
    public final o.c b() {
        return new h(this.f17171c);
    }
}
