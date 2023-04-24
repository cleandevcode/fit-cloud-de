package c5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import y0.a;
import z0.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static volatile boolean f4536a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f4536a) {
                if (theme != null) {
                    context3 = new k.c(context2, theme);
                } else {
                    context3 = context2;
                }
                return g.a.b(context3, i10);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = y0.a.f30807a;
                return a.c.b(context2, i10);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f4536a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = z0.f.f31856a;
        return f.a.a(resources, i10, theme);
    }
}
