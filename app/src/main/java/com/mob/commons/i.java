package com.mob.commons;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobHandlerThread;
import com.mob.tools.MobLog;
import com.mob.tools.utils.ActivityTracker;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private static i f8419a;

    /* renamed from: c */
    private volatile Handler f8421c;

    /* renamed from: b */
    private final HashSet<h> f8420b = new HashSet<>();

    /* renamed from: d */
    private String f8422d = null;

    /* renamed from: e */
    private volatile long f8423e = -1;

    private i() {
        String str = null;
        if (!TextUtils.isEmpty("M-")) {
            str = u.f8514a + a("004>hmhljkin");
        }
        this.f8421c = MobHandlerThread.newHandler(str, new Handler.Callback() { // from class: com.mob.commons.i.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i10 = message.what;
                if (i10 == 0) {
                    i.this.f8423e = SystemClock.elapsedRealtime();
                    i.this.a(false);
                    i.this.c();
                } else if (i10 == 1) {
                    i.this.a(true);
                } else if (i10 == 2) {
                    i.this.a(((Long) message.obj).longValue(), true);
                } else if (i10 == 3) {
                    try {
                        h hVar = (h) message.obj;
                        if (hVar != null) {
                            i.this.f8420b.add(hVar);
                            hVar.a(i.this.f8423e > 0, true, 0L);
                        }
                    } catch (Throwable th2) {
                        MobLog.getInstance().d(th2);
                    }
                }
                return false;
            }
        });
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f8419a == null) {
                i iVar2 = new i();
                f8419a = iVar2;
                if (iVar2.f8421c != null) {
                    f8419a.f8421c.sendEmptyMessage(0);
                }
            }
            iVar = f8419a;
        }
        return iVar;
    }

    public static String a(String str) {
        return C0744r.a(str, 101);
    }

    public void a(long j10, boolean z10) {
        if (z10) {
            a(false, false, j10);
        }
    }

    public void a(boolean z10) {
        if (z10) {
            a(true, false, 0L);
        }
    }

    private void a(boolean z10, boolean z11, long j10) {
        synchronized (this.f8420b) {
            Iterator<h> it = this.f8420b.iterator();
            while (it.hasNext()) {
                it.next().a(z10, z11, j10);
            }
        }
    }

    public void c() {
        ActivityTracker.getInstance(MobSDK.getContext()).addTracker(new ActivityTracker.Tracker() { // from class: com.mob.commons.FBManager$2
            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onCreated(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onDestroyed(Activity activity) {
                if (i.this.f8423e > 0) {
                    onStopped(activity);
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onPaused(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onResumed(Activity activity) {
                Handler handler;
                Handler handler2;
                try {
                    if (i.this.f8423e == 0) {
                        i.this.f8423e = SystemClock.elapsedRealtime();
                        handler = i.this.f8421c;
                        if (handler != null) {
                            handler2 = i.this.f8421c;
                            handler2.sendEmptyMessage(1);
                        }
                    }
                    i.this.f8422d = activity == null ? null : activity.toString();
                } catch (Throwable unused) {
                }
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onSaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStarted(Activity activity) {
            }

            @Override // com.mob.tools.utils.ActivityTracker.Tracker
            public void onStopped(Activity activity) {
                String str;
                Handler handler;
                Handler handler2;
                String str2;
                try {
                    str = i.this.f8422d;
                    if (str != null) {
                        str2 = i.this.f8422d;
                        if (!str2.equals(activity == null ? null : activity.toString())) {
                            return;
                        }
                    }
                    handler = i.this.f8421c;
                    if (handler != null) {
                        long elapsedRealtime = i.this.f8423e > 0 ? SystemClock.elapsedRealtime() - i.this.f8423e : 0L;
                        Message message = new Message();
                        message.what = 2;
                        message.obj = Long.valueOf(elapsedRealtime);
                        handler2 = i.this.f8421c;
                        handler2.sendMessage(message);
                    }
                    i.this.f8423e = 0L;
                    i.this.f8422d = null;
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void a(h hVar) {
        if (hVar == null) {
            return;
        }
        synchronized (this.f8420b) {
            if (this.f8420b.contains(hVar)) {
                return;
            }
            if (this.f8421c != null) {
                Message message = new Message();
                message.what = 3;
                message.obj = hVar;
                this.f8421c.sendMessage(message);
            }
        }
    }

    public boolean b() {
        return this.f8423e == 0;
    }
}
