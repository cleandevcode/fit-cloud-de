package s5;

import android.view.MotionEvent;
import android.view.View;
import gm.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    public static final /* synthetic */ int f26602a = 0;

    /* loaded from: classes.dex */
    public static final class a implements View.OnTouchListener {

        /* renamed from: a */
        public final t5.a f26603a;

        /* renamed from: b */
        public final WeakReference<View> f26604b;

        /* renamed from: c */
        public final WeakReference<View> f26605c;

        /* renamed from: d */
        public final View.OnTouchListener f26606d;

        /* renamed from: e */
        public boolean f26607e = true;

        public a(t5.a aVar, View view, View view2) {
            this.f26603a = aVar;
            this.f26604b = new WeakReference<>(view2);
            this.f26605c = new WeakReference<>(view);
            this.f26606d = t5.f.f(view2);
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.f(view, "view");
            l.f(motionEvent, "motionEvent");
            View view2 = this.f26605c.get();
            View view3 = this.f26604b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                s5.a aVar = s5.a.f26567a;
                s5.a.a(this.f26603a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f26606d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    static {
        new e();
    }
}
