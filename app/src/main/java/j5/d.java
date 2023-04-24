package j5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d<T extends View, Z> implements h<Z> {

    /* renamed from: c */
    public static final int f17489c = R.id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final a f17490a;

    /* renamed from: b */
    public final T f17491b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d */
        public static Integer f17492d;

        /* renamed from: a */
        public final View f17493a;

        /* renamed from: b */
        public final ArrayList f17494b = new ArrayList();

        /* renamed from: c */
        public ViewTreeObserver$OnPreDrawListenerC0305a f17495c;

        /* renamed from: j5.d$a$a */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0305a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<a> f17496a;

            public ViewTreeObserver$OnPreDrawListenerC0305a(a aVar) {
                this.f17496a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f17496a.get();
                if (aVar != null && !aVar.f17494b.isEmpty()) {
                    int c10 = aVar.c();
                    int b10 = aVar.b();
                    boolean z12 = false;
                    if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        Iterator it = new ArrayList(aVar.f17494b).iterator();
                        while (it.hasNext()) {
                            ((g) it.next()).c(c10, b10);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f17493a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f17495c);
                        }
                        aVar.f17495c = null;
                        aVar.f17494b.clear();
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f17493a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f17493a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f17493a.getContext();
            if (f17492d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                b0.c.i(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f17492d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f17492d.intValue();
        }

        public final int b() {
            int paddingBottom = this.f17493a.getPaddingBottom() + this.f17493a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f17493a.getLayoutParams();
            return a(this.f17493a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            int paddingRight = this.f17493a.getPaddingRight() + this.f17493a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f17493a.getLayoutParams();
            return a(this.f17493a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public d(T t10) {
        this.f17491b = t10;
        this.f17490a = new a(t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0020, code lost:
        if (r3 != false) goto L10;
     */
    @Override // j5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(j5.g r8) {
        /*
            r7 = this;
            j5.d$a r0 = r7.f17490a
            int r1 = r0.c()
            int r2 = r0.b()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            r5 = 0
            if (r1 > 0) goto L15
            if (r1 != r3) goto L13
            goto L15
        L13:
            r6 = 0
            goto L16
        L15:
            r6 = 1
        L16:
            if (r6 == 0) goto L23
            if (r2 > 0) goto L1f
            if (r2 != r3) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = 1
        L20:
            if (r3 == 0) goto L23
            goto L24
        L23:
            r4 = 0
        L24:
            if (r4 == 0) goto L2a
            r8.c(r1, r2)
            goto L4b
        L2a:
            java.util.ArrayList r1 = r0.f17494b
            boolean r1 = r1.contains(r8)
            if (r1 != 0) goto L37
            java.util.ArrayList r1 = r0.f17494b
            r1.add(r8)
        L37:
            j5.d$a$a r8 = r0.f17495c
            if (r8 != 0) goto L4b
            android.view.View r8 = r0.f17493a
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()
            j5.d$a$a r1 = new j5.d$a$a
            r1.<init>(r0)
            r0.f17495c = r1
            r8.addOnPreDrawListener(r1)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.d.a(j5.g):void");
    }

    @Override // j5.h
    public final void b(i5.d dVar) {
        this.f17491b.setTag(f17489c, dVar);
    }

    @Override // j5.h
    public final void d(g gVar) {
        this.f17490a.f17494b.remove(gVar);
    }

    @Override // j5.h
    public final void f(Drawable drawable) {
    }

    @Override // j5.h
    public final i5.d g() {
        Object tag = this.f17491b.getTag(f17489c);
        if (tag != null) {
            if (tag instanceof i5.d) {
                return (i5.d) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // j5.h
    public final void h(Drawable drawable) {
        a aVar = this.f17490a;
        ViewTreeObserver viewTreeObserver = aVar.f17493a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f17495c);
        }
        aVar.f17495c = null;
        aVar.f17494b.clear();
    }

    @Override // com.bumptech.glide.manager.j
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.j
    public final void onStop() {
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Target for: ");
        a10.append(this.f17491b);
        return a10.toString();
    }
}
