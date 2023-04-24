package com.mob.commons.a;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mob.commons.C0744r;
import com.mob.commons.d;
import com.mob.commons.u;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class d implements Handler.Callback {

    /* renamed from: a */
    private static d f8252a = new d();

    /* renamed from: b */
    private Handler f8253b;

    private d() {
        String str;
        if (TextUtils.isEmpty("M-")) {
            str = null;
        } else {
            str = u.f8514a + a("0046fjhjijhm");
        }
        this.f8253b = MobHandlerThread.newHandler(str, this);
    }

    private int a(Class<? extends a> cls) {
        int hashCode = cls.getName().hashCode();
        return hashCode > 0 ? hashCode + 10000 : hashCode - 10000;
    }

    public static d a() {
        return f8252a;
    }

    public static String a(String str) {
        return C0744r.a(str, 100);
    }

    private void a(Message message, long j10) {
        if (j10 > 0) {
            this.f8253b.sendMessageDelayed(message, j10);
        } else {
            this.f8253b.sendMessage(message);
        }
    }

    private boolean a(int i10, long j10, Runnable runnable) {
        if (this.f8253b.hasMessages(i10)) {
            return false;
        }
        b(i10, j10, runnable);
        return true;
    }

    private boolean b(int i10, long j10, Runnable runnable) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.obj = runnable;
        a(obtain, j10);
        return true;
    }

    public void a(long j10, int i10, d.c cVar) {
        Message obtain = Message.obtain();
        obtain.what = 1002;
        obtain.arg1 = i10;
        obtain.obj = cVar;
        a(obtain, j10 * 1000);
    }

    public void a(long j10, Class<? extends a> cls, Object[] objArr, int i10) {
        int a10 = a(cls);
        if (i10 == 1) {
            this.f8253b.removeMessages(a10);
        } else if (i10 == 2 && this.f8253b.hasMessages(a10)) {
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = a10;
        obtain.obj = new Object[]{cls, objArr};
        a(obtain, j10 * 1000);
    }

    public boolean a(long j10, Runnable runnable) {
        return a(1003, j10 * 1000, runnable);
    }

    public void b() {
        this.f8253b.removeMessages(1002);
    }

    public boolean b(long j10, Runnable runnable) {
        return a(1004, j10 * 1000, runnable);
    }

    public boolean c(long j10, Runnable runnable) {
        return b(1005, j10, runnable);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Runnable runnable;
        ThreadPoolExecutor threadPoolExecutor;
        a a10;
        try {
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
        if (!com.mob.commons.b.d()) {
            Message obtain = Message.obtain();
            obtain.copyFrom(message);
            this.f8253b.sendMessageDelayed(obtain, 60000L);
            return false;
        }
        int i10 = message.what;
        if (i10 != 1003 && i10 != 1004) {
            if (i10 == 1002) {
                d.c cVar = (d.c) message.obj;
                if (cVar != null) {
                    if (!cVar.f8386a) {
                        cVar.f8386a = true;
                    }
                    u.f8517d.execute(cVar);
                    int i11 = message.arg1;
                    Message obtain2 = Message.obtain();
                    obtain2.what = 1002;
                    obtain2.obj = cVar;
                    obtain2.arg1 = i11;
                    a(obtain2, i11 * 1000);
                }
            } else if (i10 == 1005) {
                runnable = (Runnable) message.obj;
                if (runnable != null) {
                    threadPoolExecutor = u.f8516c;
                    threadPoolExecutor.execute(runnable);
                }
            } else if (i10 >= 10000 || i10 < -10000) {
                Object[] objArr = (Object[]) message.obj;
                Class cls = (Class) objArr[0];
                if (cls != null && (a10 = a.a(cls)) != null) {
                    Object[] objArr2 = (Object[]) objArr[1];
                    a10.f8218b = ((Integer) objArr2[0]).intValue();
                    a10.f8217a = objArr2[1];
                    a10.e();
                }
            }
            return false;
        }
        runnable = (Runnable) message.obj;
        if (runnable != null) {
            threadPoolExecutor = u.f8517d;
            threadPoolExecutor.execute(runnable);
        }
        return false;
    }
}
