package a1;

import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final ThreadLocal<j1.c<Rect, Rect>> f218a = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Paint paint, String str) {
            boolean hasGlyph;
            hasGlyph = paint.hasGlyph(str);
            return hasGlyph;
        }
    }
}
