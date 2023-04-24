package com.github.kilnn.wheelview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.GestureDetector;
import android.widget.Scroller;
import java.lang.ref.WeakReference;
import n7.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final Context f5990a;

    /* renamed from: b */
    public final InterfaceC0090b f5991b;

    /* renamed from: c */
    public final GestureDetector f5992c;

    /* renamed from: d */
    public Scroller f5993d;

    /* renamed from: e */
    public int f5994e;

    /* renamed from: f */
    public float f5995f;

    /* renamed from: g */
    public boolean f5996g;

    /* renamed from: h */
    public final a f5997h = new a(this);

    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a */
        public final WeakReference<b> f5998a;

        public a(b bVar) {
            super(Looper.getMainLooper());
            this.f5998a = new WeakReference<>(bVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            b bVar = this.f5998a.get();
            if (bVar == null) {
                return;
            }
            Scroller scroller = bVar.f5993d;
            scroller.computeScrollOffset();
            int currY = scroller.getCurrY();
            int i10 = bVar.f5994e - currY;
            bVar.f5994e = currY;
            if (i10 != 0) {
                ((c) bVar.f5991b).a(i10);
            }
            if (Math.abs(currY - scroller.getFinalY()) < 1) {
                scroller.forceFinished(true);
            }
            boolean isFinished = scroller.isFinished();
            int i11 = message.what;
            if (!isFinished) {
                sendEmptyMessage(i11);
            } else if (i11 == 0) {
                bVar.a();
            } else if (bVar.f5996g) {
                c cVar = (c) bVar.f5991b;
                WheelView wheelView = cVar.f5999a;
                if (wheelView.f5983u) {
                    for (d dVar : wheelView.f5974l) {
                        dVar.a(wheelView);
                    }
                    cVar.f5999a.f5983u = false;
                }
                WheelView wheelView2 = cVar.f5999a;
                wheelView2.f5984v = 0;
                wheelView2.invalidate();
                bVar.f5996g = false;
            }
        }
    }

    /* renamed from: com.github.kilnn.wheelview.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0090b {
    }

    public b(Context context, c cVar) {
        this.f5990a = context;
        this.f5991b = cVar;
        GestureDetector gestureDetector = new GestureDetector(context, new com.github.kilnn.wheelview.a(this));
        this.f5992c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f5993d = new Scroller(context);
    }

    public final void a() {
        c cVar = (c) this.f5991b;
        if (Math.abs(cVar.f5999a.f5984v) > 1) {
            WheelView wheelView = cVar.f5999a;
            wheelView.f5982t.b(wheelView.f5984v);
        }
        this.f5997h.removeMessages(0);
        this.f5997h.removeMessages(1);
        this.f5997h.sendEmptyMessage(1);
    }

    public final void b(int i10) {
        this.f5993d.forceFinished(true);
        this.f5994e = 0;
        this.f5993d.startScroll(0, 0, 0, i10, 400);
        this.f5997h.removeMessages(0);
        this.f5997h.removeMessages(1);
        this.f5997h.sendEmptyMessage(0);
        c();
    }

    public final void c() {
        if (!this.f5996g) {
            this.f5996g = true;
            WheelView wheelView = ((c) this.f5991b).f5999a;
            wheelView.f5983u = true;
            for (d dVar : wheelView.f5974l) {
                dVar.b(wheelView);
            }
        }
    }

    public final void d() {
        this.f5993d.forceFinished(true);
    }
}
