package e3;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import androidx.fragment.app.x;
import gm.l;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: b */
    public static final f f13337b = new f();

    /* renamed from: c */
    public static final String f13338c = f.class.getSimpleName();

    /* JADX WARN: Removed duplicated region for block: B:144:0x012e  */
    @android.annotation.SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect b(androidx.fragment.app.x r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.b(androidx.fragment.app.x):android.graphics.Rect");
    }

    public static void c(x xVar, Rect rect) {
        xVar.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    public final d a(x xVar) {
        Rect rect;
        int i10;
        boolean isInMultiWindowMode;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            rect = b.a(xVar);
        } else {
            int i12 = 0;
            if (i11 >= 29) {
                Configuration configuration = xVar.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    if (invoke != null) {
                        rect = new Rect((Rect) invoke);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                    }
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
                    Log.w(f13338c, e10);
                    rect = b(xVar);
                }
            } else if (i11 >= 28) {
                rect = b(xVar);
            } else if (i11 >= 24) {
                Rect rect2 = new Rect();
                Display defaultDisplay = xVar.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect2);
                isInMultiWindowMode = xVar.isInMultiWindowMode();
                if (!isInMultiWindowMode) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = xVar.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i12 = resources.getDimensionPixelSize(identifier);
                    }
                    int i13 = rect2.bottom + i12;
                    if (i13 == point.y) {
                        rect2.bottom = i13;
                    } else {
                        int i14 = rect2.right + i12;
                        if (i14 == point.x) {
                            rect2.right = i14;
                        }
                    }
                }
                rect = rect2;
            } else {
                Display defaultDisplay2 = xVar.getWindowManager().getDefaultDisplay();
                l.e(defaultDisplay2, "defaultDisplay");
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                Rect rect3 = new Rect();
                int i15 = point2.x;
                if (i15 != 0 && (i10 = point2.y) != 0) {
                    rect3.right = i15;
                    rect3.bottom = i10;
                } else {
                    defaultDisplay2.getRectSize(rect3);
                }
                rect = rect3;
            }
        }
        return new d(rect);
    }
}
