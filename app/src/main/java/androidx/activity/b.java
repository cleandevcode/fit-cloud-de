package androidx.activity;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import android.view.Window;
import androidx.appcompat.widget.r2;
import androidx.fragment.app.FragmentContainerView;
import com.topstep.fitcloud.pro.databinding.ActivityCameraBinding;
import com.topstep.fitcloud.pro.ui.camera.CameraActivity;
import com.topstep.fitcloud.pro.ui.camera.CameraFragment;
import d6.b;
import d6.m0;
import d6.w;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.l2;
import k1.v2;
import k1.w2;
import k1.x2;
import k1.z2;
import m2.m;
import m2.q;
import o5.v;
import o5.y;
import org.json.JSONArray;
import org.json.JSONObject;
import s.a0;
import s.h1;
import s.i2;
import s.r1;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f731a;

    /* renamed from: b */
    public final /* synthetic */ Object f732b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f731a = i10;
        this.f732b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String a10;
        Locale locale;
        ie.b v2Var;
        ie.b bVar;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f731a) {
            case 0:
                ((ComponentActivity) this.f732b).invalidateOptionsMenu();
                return;
            case 1:
                a0.d.b bVar2 = (a0.d.b) this.f732b;
                if (!bVar2.f25909b) {
                    if (a0.this.f25873e == 6) {
                        z10 = true;
                    }
                    h1.k(null, z10);
                    boolean c10 = a0.d.this.c();
                    a0 a0Var = a0.this;
                    if (c10) {
                        a0Var.F(true);
                        return;
                    } else {
                        a0Var.G(true);
                        return;
                    }
                }
                return;
            case 2:
                int i10 = r1.a.f26172b;
                for (i2 i2Var : (LinkedHashSet) this.f732b) {
                    i2Var.b().m(i2Var);
                }
                return;
            case 3:
                ((Surface) this.f732b).release();
                return;
            case 4:
                ((j0.d) this.f732b).b();
                return;
            case 5:
                m mVar = (m) this.f732b;
                synchronized (mVar.f20229l) {
                    mVar.f20224g = false;
                    m.b bVar3 = mVar.f20226i;
                    synchronized (bVar3) {
                        Arrays.fill(bVar3.f20232b, false);
                        bVar3.f20234d = true;
                        tl.l lVar = tl.l.f28297a;
                    }
                }
                return;
            case 6:
                q qVar = (q) this.f732b;
                gm.l.f(qVar, "this$0");
                qVar.getClass();
                throw null;
            case 7:
                String str = (String) this.f732b;
                s5.c cVar = s5.c.f26581a;
                String str2 = "0";
                if (!i6.a.b(s5.c.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        Context a11 = v.a();
                        d6.b bVar4 = d6.b.f12632f;
                        d6.b a12 = b.a.a(a11);
                        JSONArray jSONArray = new JSONArray();
                        String str3 = Build.MODEL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONArray.put(str3);
                        if (a12 == null) {
                            a10 = null;
                        } else {
                            a10 = a12.a();
                        }
                        if (a10 != null) {
                            jSONArray.put(a12.a());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put("0");
                        if (x5.e.c()) {
                            str2 = "1";
                        }
                        jSONArray.put(str2);
                        m0 m0Var = m0.f12709a;
                        try {
                            locale = v.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            gm.l.e(locale, "getDefault()");
                        }
                        jSONArray.put(locale.getLanguage() + '_' + ((Object) locale.getCountry()));
                        String jSONArray2 = jSONArray.toString();
                        gm.l.e(jSONArray2, "extInfoArray.toString()");
                        bundle.putString("device_session_id", s5.c.a());
                        bundle.putString("extinfo", jSONArray2);
                        String str4 = y.f22858j;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                        gm.l.e(format, "java.lang.String.format(locale, format, *args)");
                        JSONObject jSONObject = y.c.i(format, bundle, null).c().f22703b;
                        AtomicBoolean atomicBoolean = s5.c.f26587g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z11 = false;
                        }
                        atomicBoolean.set(z11);
                        if (!atomicBoolean.get()) {
                            s5.c.f26585e = null;
                        } else {
                            s5.g gVar = s5.c.f26584d;
                            if (gVar != null) {
                                gVar.c();
                            }
                        }
                        s5.c.f26588h = false;
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(s5.c.class, th2);
                        return;
                    }
                }
                return;
            case 8:
                w wVar = w.f12811a;
                ((w.b) this.f732b).a();
                return;
            case 9:
                CameraActivity cameraActivity = (CameraActivity) this.f732b;
                int i11 = CameraActivity.f10412y;
                gm.l.f(cameraActivity, "this$0");
                l2.a(cameraActivity.getWindow(), false);
                Window window = cameraActivity.getWindow();
                ActivityCameraBinding activityCameraBinding = cameraActivity.f10413x;
                if (activityCameraBinding != null) {
                    FragmentContainerView fragmentContainerView = activityCameraBinding.fragmentContainer;
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30) {
                        bVar = new z2(window);
                    } else {
                        if (i12 >= 26) {
                            v2Var = new x2(window, fragmentContainerView);
                        } else if (i12 >= 23) {
                            v2Var = new w2(window, fragmentContainerView);
                        } else {
                            v2Var = new v2(window, fragmentContainerView);
                        }
                        bVar = v2Var;
                    }
                    bVar.b();
                    bVar.h();
                    return;
                }
                gm.l.l("viewBind");
                throw null;
            default:
                CameraFragment cameraFragment = (CameraFragment) this.f732b;
                gm.l.f(cameraFragment, "this$0");
                CameraFragment.a aVar = CameraFragment.F0;
                cameraFragment.i1().getRoot().setForeground(new ColorDrawable(-1));
                cameraFragment.i1().getRoot().postDelayed(new r2(13, cameraFragment), 50L);
                return;
        }
    }
}
