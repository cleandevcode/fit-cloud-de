package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class i2 extends ContextWrapper {

    /* renamed from: a */
    public static final Object f1373a = new Object();

    public static void a(Context context) {
        if ((context instanceof i2) || (context.getResources() instanceof k2)) {
            return;
        }
        context.getResources();
        int i10 = w2.f1593a;
    }
}
