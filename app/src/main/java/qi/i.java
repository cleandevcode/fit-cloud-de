package qi;

import android.content.Context;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a */
    public static volatile Typeface f24863a;

    public static Typeface a(Context context) {
        if (f24863a == null) {
            synchronized (i.class) {
                if (f24863a == null) {
                    f24863a = Typeface.createFromAsset(context.getAssets(), "fonts/pt_din_condensed_cyrillic.ttf");
                }
            }
        }
        return f24863a;
    }
}
