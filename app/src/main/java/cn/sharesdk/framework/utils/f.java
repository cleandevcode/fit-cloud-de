package cn.sharesdk.framework.utils;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.MobHandlerThread;

/* loaded from: classes.dex */
public abstract class f implements Handler.Callback {

    /* renamed from: a */
    public final Handler f5306a = MobHandlerThread.newHandler(this);

    public void a(int i10, int i11, Object obj) {
        Message message = new Message();
        message.what = -1;
        message.arg1 = i10;
        message.arg2 = i11;
        message.obj = obj;
        this.f5306a.sendMessage(message);
    }

    public void a(Message message) {
    }

    public abstract void b(Message message);

    public void c() {
        a(0, 0, null);
    }

    public void c(Message message) {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == -2) {
            c(message);
            return false;
        } else if (i10 != -1) {
            b(message);
            return false;
        } else {
            a(message);
            return false;
        }
    }
}
