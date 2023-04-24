package yn;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class c extends ScheduledThreadPoolExecutor {

    /* renamed from: a */
    public static final /* synthetic */ int f31820a = 0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public static final c f31821a = new c();
    }

    public c() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
