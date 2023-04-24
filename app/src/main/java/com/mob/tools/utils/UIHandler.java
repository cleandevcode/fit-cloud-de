package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes.dex */
public class UIHandler implements PublicMemberKeeper {

    /* renamed from: a */
    private static Handler f9361a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Message f9362a;

        /* renamed from: b */
        public final Handler.Callback f9363b;

        public a(Message message, Handler.Callback callback) {
            this.f9362a = message;
            this.f9363b = callback;
        }
    }

    private static Message a(int i10, Handler.Callback callback) {
        Message message = new Message();
        message.what = i10;
        return a(message, callback);
    }

    private static Message a(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new a(message, callback);
        return message2;
    }

    private static synchronized void a() {
        synchronized (UIHandler.class) {
            if (f9361a == null) {
                b();
            }
        }
    }

    private static void b() {
        f9361a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.mob.tools.utils.UIHandler.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                UIHandler.b(message);
                return false;
            }
        });
    }

    public static void b(Message message) {
        a aVar = (a) message.obj;
        Message message2 = aVar.f9362a;
        Handler.Callback callback = aVar.f9363b;
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    public static boolean sendEmptyMessage(int i10, Handler.Callback callback) {
        a();
        return f9361a.sendMessage(a(i10, callback));
    }

    public static boolean sendEmptyMessageDelayed(int i10, long j10, Handler.Callback callback) {
        a();
        return f9361a.sendMessageDelayed(a(i10, callback), j10);
    }

    public static boolean sendMessage(Message message, Handler.Callback callback) {
        a();
        return f9361a.sendMessage(a(message, callback));
    }

    public static boolean sendMessageDelayed(Message message, long j10, Handler.Callback callback) {
        a();
        return f9361a.sendMessageDelayed(a(message, callback), j10);
    }
}
