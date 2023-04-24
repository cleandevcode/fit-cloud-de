package fe;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final a f14244a;

    public c(Context context, int i10) {
        a aVar;
        if (i10 >= 21) {
            aVar = new j(context);
        } else if (i10 >= 18) {
            aVar = new d(context);
        } else {
            aVar = null;
        }
        this.f14244a = aVar;
    }
}
