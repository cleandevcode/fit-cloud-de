package sf;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.topstep.fitcloud.pro.ui.camera.CameraActivity;
import com.topstep.fitcloudpro.R;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$monitorCameraLaunch$1", f = "CoreMonitor.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f26923e;

    /* renamed from: f */
    public final /* synthetic */ i f26924f;

    @zl.e(c = "com.topstep.fitcloud.pro.function.CoreMonitor$monitorCameraLaunch$1$launchSuccess$1", f = "CoreMonitor.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public int f26925e;

        /* renamed from: f */
        public final /* synthetic */ i f26926f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f26926f = iVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super Boolean> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f26926f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f26925e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                i iVar = this.f26926f;
                this.f26925e = 1;
                iVar.getClass();
                pm.j jVar = new pm.j(1, a0.i(this));
                jVar.u();
                h hVar = new h(iVar, jVar);
                iVar.f26931a.registerReceiver(hVar, new IntentFilter("com.topstep.fitcloudpro.action.CameraLaunch"));
                jVar.z(new g(iVar, hVar));
                obj = jVar.t();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, xl.d<? super f> dVar) {
        super(2, dVar);
        this.f26924f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new f(this.f26924f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        boolean z10;
        int i10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i11 = this.f26923e;
        String str = null;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                a aVar2 = new a(this.f26924f, null);
                this.f26923e = 1;
                obj = jh.v.g(750L, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            z10 = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            z10 = false;
        }
        if (!z10) {
            i iVar = this.f26924f;
            Object systemService = iVar.f26931a.getSystemService("notification");
            gm.l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            qi.l.a(iVar.f26931a, notificationManager);
            Intent intent = new Intent(iVar.f26931a, CameraActivity.class);
            intent.addFlags(268435456);
            Context context = iVar.f26931a;
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i10);
            wf.a value = iVar.f26933c.x().getValue();
            if (value != null) {
                str = value.f29803b;
            }
            Context context2 = iVar.f26931a;
            gm.l.f(context2, "context");
            x0.s sVar = new x0.s(context2, "Core");
            if (str == null) {
                str = iVar.f26931a.getString(R.string.app_name);
                gm.l.e(str, "context.getString(R.string.app_name)");
            }
            sVar.d(str);
            sVar.c(iVar.f26931a.getString(R.string.action_take_photo));
            sVar.f30158t.icon = R.mipmap.ic_launcher;
            sVar.f30145g = activity;
            sVar.f30146h = activity;
            sVar.e(128, true);
            Notification notification = sVar.f30158t;
            notification.defaults = -1;
            notification.flags |= 1;
            sVar.e(16, true);
            sVar.f30147i = 1;
            notificationManager.notify(10004, sVar.a());
        }
        return tl.l.f28297a;
    }
}
