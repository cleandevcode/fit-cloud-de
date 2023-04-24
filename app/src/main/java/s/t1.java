package s;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: d */
    public static final Size f26194d = new Size(1920, 1080);

    /* renamed from: e */
    public static final Object f26195e = new Object();

    /* renamed from: f */
    public static volatile t1 f26196f;

    /* renamed from: a */
    public final DisplayManager f26197a;

    /* renamed from: b */
    public volatile Size f26198b = null;

    /* renamed from: c */
    public final w.i f26199c = new w.i();

    public t1(Context context) {
        this.f26197a = (DisplayManager) context.getSystemService("display");
    }

    public static t1 b(Context context) {
        if (f26196f == null) {
            synchronized (f26195e) {
                if (f26196f == null) {
                    f26196f = new t1(context);
                }
            }
        }
        return f26196f;
    }

    public final Size a() {
        Size size;
        Point point = new Point();
        c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int height = size.getHeight() * size.getWidth();
        Size size2 = f26194d;
        if (height > size2.getHeight() * size2.getWidth()) {
            size = size2;
        }
        if (this.f26199c.f29495a != null) {
            boolean z10 = true;
            Size a10 = v.m.a(1);
            if (a10 != null) {
                if (a10.getHeight() * a10.getWidth() <= size.getHeight() * size.getWidth()) {
                    z10 = false;
                }
                if (z10) {
                    return a10;
                }
                return size;
            }
            return size;
        }
        return size;
    }

    public final Display c() {
        Display[] displays = this.f26197a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i10 = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size d() {
        if (this.f26198b != null) {
            return this.f26198b;
        }
        this.f26198b = a();
        return this.f26198b;
    }
}
