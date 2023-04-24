package x;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.CompoundButton;
import androidx.appcompat.widget.t2;
import androidx.fragment.app.o0;
import androidx.fragment.app.r;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloudpro.R;
import gm.l;
import i2.b0;
import i2.m;
import ih.v;
import java.util.concurrent.Executor;
import mm.h;
import p0.c;
import si.f;
import y.s;
import y.u;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements c.InterfaceC0425c, f.a, o0 {

    /* renamed from: a */
    public final /* synthetic */ int f30079a;

    /* renamed from: b */
    public final /* synthetic */ Object f30080b;

    /* renamed from: c */
    public final /* synthetic */ Object f30081c;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f30079a = i10;
        this.f30080b = obj;
        this.f30081c = obj2;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        switch (this.f30079a) {
            case 2:
                HomePageFragment homePageFragment = (HomePageFragment) this.f30080b;
                Integer num = (Integer) this.f30081c;
                l.f(homePageFragment, "this$0");
                if (z10) {
                    m f10 = tb.a.f(homePageFragment);
                    int intValue = num.intValue();
                    b0 a10 = v.d().a();
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("mode", intValue);
                        f10.l(R.id.toWhDetail, bundle, a10);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                NotificationFragment notificationFragment = (NotificationFragment) this.f30080b;
                CompoundButton compoundButton = (CompoundButton) this.f30081c;
                h<Object>[] hVarArr = NotificationFragment.f11198v0;
                l.f(notificationFragment, "this$0");
                l.f(compoundButton, "$buttonView");
                if (f.f27071a.d(notificationFragment.V0())) {
                    notificationFragment.f1(1, true);
                    return;
                }
                compoundButton.setChecked(false);
                notificationFragment.k1();
                return;
        }
    }

    @Override // androidx.fragment.app.o0
    public final void e(Bundle bundle, String str) {
        t2.b(this.f30080b);
        l.f((r) this.f30081c, "$fragment");
        l.f(str, "requestKey");
        throw null;
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        u uVar = (u) this.f30080b;
        Context context = (Context) this.f30081c;
        Executor executor = uVar.f30774d;
        executor.execute(new s(uVar, context, executor, aVar, SystemClock.elapsedRealtime()));
        return "CameraX initInternal";
    }
}
