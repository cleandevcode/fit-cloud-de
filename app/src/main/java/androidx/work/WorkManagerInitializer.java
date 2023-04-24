package androidx.work;

import android.content.Context;
import androidx.work.a;
import f3.m;
import f3.t;
import g3.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements u2.a<t> {

    /* renamed from: a */
    public static final String f3625a = m.e("WrkMgrInitializer");

    @Override // u2.a
    public final List<Class<? extends u2.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // u2.a
    public final t b(Context context) {
        m.c().a(f3625a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.e(context, new a(new a.C0037a()));
        return l.d(context);
    }
}
