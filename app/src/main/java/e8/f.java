package e8;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class f extends f2.a {

    /* renamed from: j */
    public final Semaphore f13495j;

    /* renamed from: k */
    public final Set f13496k;

    public f(Context context, Set set) {
        super(context);
        this.f13495j = new Semaphore(0);
        this.f13496k = set;
    }
}
