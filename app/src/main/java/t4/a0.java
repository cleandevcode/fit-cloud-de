package t4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public boolean f27565a;

    /* renamed from: b */
    public final Handler f27566b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((x) message.obj).c();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(x<?> xVar, boolean z10) {
        if (!this.f27565a && !z10) {
            this.f27565a = true;
            xVar.c();
            this.f27565a = false;
        }
        this.f27566b.obtainMessage(1, xVar).sendToTarget();
    }
}
