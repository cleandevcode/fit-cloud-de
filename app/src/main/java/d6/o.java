package d6;

import a2.b;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i1;
import cn.sharesdk.framework.InnerShareParams;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import d6.r0;
import java.util.Date;
import kotlin.Metadata;
import o5.a;

@Metadata
/* loaded from: classes.dex */
public final class o extends androidx.fragment.app.o {
    public static final /* synthetic */ int C0 = 0;
    public Dialog B0;

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        androidx.fragment.app.x f02;
        boolean z10;
        r0 rVar;
        String string;
        Bundle bundle2;
        String str;
        super.B0(bundle);
        if (this.B0 == null && (f02 = f0()) != null) {
            Intent intent = f02.getIntent();
            e0 e0Var = e0.f12668a;
            gm.l.e(intent, "intent");
            Bundle m10 = e0.m(intent);
            if (m10 == null) {
                z10 = false;
            } else {
                z10 = m10.getBoolean("is_fallback", false);
            }
            String str2 = null;
            if (!z10) {
                if (m10 == null) {
                    string = null;
                } else {
                    string = m10.getString("action");
                }
                if (m10 == null) {
                    bundle2 = null;
                } else {
                    bundle2 = m10.getBundle("params");
                }
                if (!m0.A(string)) {
                    if (string != null) {
                        Date date = o5.a.f22664l;
                        o5.a b10 = a.c.b();
                        if (!a.c.c()) {
                            str = m0.q(f02);
                        } else {
                            str = null;
                        }
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        r0.c cVar = new r0.c() { // from class: d6.m
                            @Override // d6.r0.c
                            public final void a(Bundle bundle3, o5.p pVar) {
                                o oVar = o.this;
                                int i10 = o.C0;
                                gm.l.f(oVar, "this$0");
                                oVar.i1(bundle3, pVar);
                            }
                        };
                        if (b10 != null) {
                            bundle2.putString("app_id", b10.f22674h);
                            if (b10 != null) {
                                str2 = b10.f22671e;
                            }
                            bundle2.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, str2);
                        } else {
                            bundle2.putString("app_id", str);
                        }
                        int i10 = r0.f12731m;
                        r0.a(f02);
                        rVar = new r0(f02, string, bundle2, n6.y.FACEBOOK, cVar);
                        this.B0 = rVar;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                o5.v vVar = o5.v.f22837a;
                f02.finish();
            }
            if (m10 != null) {
                str2 = m10.getString(InnerShareParams.URL);
            }
            if (!m0.A(str2)) {
                String d10 = i1.d(new Object[]{o5.v.b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i11 = r.f12729p;
                if (str2 != null) {
                    r0.a(f02);
                    rVar = new r(f02, str2, d10);
                    rVar.f12735c = new r0.c() { // from class: d6.n
                        @Override // d6.r0.c
                        public final void a(Bundle bundle3, o5.p pVar) {
                            o oVar = o.this;
                            int i12 = o.C0;
                            gm.l.f(oVar, "this$0");
                            androidx.fragment.app.x f03 = oVar.f0();
                            if (f03 != null) {
                                Intent intent2 = new Intent();
                                if (bundle3 == null) {
                                    bundle3 = new Bundle();
                                }
                                intent2.putExtras(bundle3);
                                f03.setResult(-1, intent2);
                                f03.finish();
                            }
                        }
                    };
                    this.B0 = rVar;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            o5.v vVar2 = o5.v.f22837a;
            f02.finish();
        }
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        Dialog dialog = this.f2477w0;
        if (dialog != null) {
            b.c cVar = a2.b.f241a;
            a2.d dVar = new a2.d(this);
            a2.b.c(dVar);
            b.c a10 = a2.b.a(this);
            if (a10.f250a.contains(b.a.DETECT_RETAIN_INSTANCE_USAGE) && a2.b.f(a10, o.class, a2.d.class)) {
                a2.b.b(a10, dVar);
            }
            if (this.B) {
                dialog.setDismissMessage(null);
            }
        }
        super.E0();
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        Dialog dialog = this.B0;
        if (dialog instanceof r0) {
            if (dialog != null) {
                ((r0) dialog).c();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        Dialog dialog = this.B0;
        if (dialog == null) {
            i1(null, null);
            this.f2473s0 = false;
            return super.d1(bundle);
        } else if (dialog != null) {
            return dialog;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
    }

    public final void i1(Bundle bundle, o5.p pVar) {
        androidx.fragment.app.x f02 = f0();
        if (f02 == null) {
            return;
        }
        e0 e0Var = e0.f12668a;
        Intent intent = f02.getIntent();
        gm.l.e(intent, "fragmentActivity.intent");
        f02.setResult(pVar == null ? -1 : 0, e0.f(intent, bundle, pVar));
        f02.finish();
    }

    @Override // androidx.fragment.app.r, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        gm.l.f(configuration, "newConfig");
        boolean z10 = true;
        this.E = true;
        Dialog dialog = this.B0;
        if (dialog instanceof r0) {
            if (this.f2508a < 7) {
                z10 = false;
            }
            if (z10) {
                if (dialog != null) {
                    ((r0) dialog).c();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
        }
    }
}
