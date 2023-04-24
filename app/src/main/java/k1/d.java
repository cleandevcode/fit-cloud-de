package k1;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final DisplayCutout f18108a;

    /* loaded from: classes.dex */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public d(DisplayCutout displayCutout) {
        this.f18108a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return j1.b.a(this.f18108a, ((d) obj).f18108a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f18108a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DisplayCutoutCompat{");
        a10.append(this.f18108a);
        a10.append("}");
        return a10.toString();
    }
}
