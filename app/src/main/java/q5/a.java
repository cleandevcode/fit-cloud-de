package q5;

import android.app.ActivityManager;
import android.content.Context;
import cn.sharesdk.framework.InnerShareParams;
import d6.b;
import d6.w;
import o5.v;
import org.json.JSONException;
import org.json.JSONObject;
import q5.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f24589a;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        switch (this.f24589a) {
            case 0:
                if (!i6.a.b(b.class)) {
                    try {
                        Context a10 = v.a();
                        d6.b bVar = d6.b.f12632f;
                        d6.b a11 = b.a.a(a10);
                        if (a11 != null && a11.f12637e) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            b bVar2 = b.f24590a;
                            bVar2.getClass();
                            if (!i6.a.b(bVar2)) {
                                w wVar = w.f12811a;
                                d6.v f10 = w.f(v.b(), false);
                                if (f10 != null && (str = f10.f12805k) != null) {
                                    try {
                                        d.a().clear();
                                        d.a.a(new JSONObject(str));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            b.f24591b = true;
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        i6.a.a(b.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                v5.d dVar = v5.d.f29075a;
                if (!i6.a.b(v5.d.class)) {
                    try {
                        v5.d.f29075a.a();
                        return;
                    } catch (Throwable th3) {
                        i6.a.a(v5.d.class, th3);
                        return;
                    }
                }
                return;
            default:
                int i10 = g6.a.f15008a;
                if (!i6.a.b(g6.a.class)) {
                    try {
                        Object systemService = v.a().getSystemService(InnerShareParams.ACTIVITY);
                        if (systemService != null) {
                            g6.a.a((ActivityManager) systemService);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    } catch (Exception unused2) {
                        return;
                    } catch (Throwable th4) {
                        i6.a.a(g6.a.class, th4);
                        return;
                    }
                }
                return;
        }
    }
}
