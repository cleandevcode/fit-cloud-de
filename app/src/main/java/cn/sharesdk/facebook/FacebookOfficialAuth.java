package cn.sharesdk.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.LinearLayout;
import androidx.activity.result.h;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.facebook.FacebookActivity;
import com.mob.tools.FakeActivity;
import d6.e;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import n6.a0;
import n6.o;
import n6.p;
import n6.q;
import n6.s;
import n6.v;
import n6.x;
import n6.y;
import o5.a;
import o5.l;
import o5.n;
import o5.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FacebookOfficialAuth extends FakeActivity {
    private PlatformActionListener actionListener;
    private l callbackManager;
    private Platform platform;

    public FacebookOfficialAuth(PlatformActionListener platformActionListener, Platform platform) {
        try {
            this.callbackManager = new d6.e();
            this.actionListener = platformActionListener;
            this.platform = platform;
            SSDKLog.b().a("FacebookOfficialAuth constuction ");
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("FacebookOfficialAuth catch ", th2), new Object[0]);
        }
    }

    public void loginManager() {
        String str;
        boolean z10;
        String str2;
        e.c cVar = e.c.Login;
        SSDKLog.b().a("FacebookOfficialAuth loginManager");
        final v a10 = v.a();
        Activity activity = this.activity;
        Set singleton = Collections.singleton("email");
        gm.l.f(activity, InnerShareParams.ACTIVITY);
        q qVar = new q(singleton);
        if (activity instanceof h) {
            Log.w(v.f22172h, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        n6.a aVar = n6.a.S256;
        try {
            str = a0.g(qVar.f22156c);
        } catch (p unused) {
            aVar = n6.a.PLAIN;
            str = qVar.f22156c;
        }
        n6.a aVar2 = aVar;
        o oVar = a10.f22174a;
        Set b02 = ul.q.b0(qVar.f22154a);
        n6.d dVar = a10.f22175b;
        String str3 = a10.f22177d;
        String b10 = o5.v.b();
        String uuid = UUID.randomUUID().toString();
        gm.l.e(uuid, "randomUUID().toString()");
        p.d dVar2 = new p.d(oVar, b02, dVar, str3, b10, uuid, a10.f22178e, qVar.f22155b, qVar.f22156c, str, aVar2);
        Date date = o5.a.f22664l;
        dVar2.f22128f = a.c.c();
        dVar2.f22132j = null;
        boolean z11 = false;
        dVar2.f22133k = false;
        dVar2.f22135m = false;
        dVar2.f22136n = false;
        s a11 = v.b.f22179a.a(activity);
        if (a11 != null) {
            if (dVar2.f22135m) {
                str2 = "foa_mobile_login_start";
            } else {
                str2 = "fb_mobile_login_start";
            }
            if (!i6.a.b(a11)) {
                try {
                    ScheduledExecutorService scheduledExecutorService = s.f22163d;
                    Bundle a12 = s.a.a(dVar2.f22127e);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("login_behavior", dVar2.f22123a.toString());
                        jSONObject.put("request_code", cVar.a());
                        jSONObject.put("permissions", TextUtils.join(",", dVar2.f22124b));
                        jSONObject.put("default_audience", dVar2.f22125c.toString());
                        jSONObject.put("isReauthorize", dVar2.f22128f);
                        String str4 = a11.f22166c;
                        if (str4 != null) {
                            jSONObject.put("facebookVersion", str4);
                        }
                        y yVar = dVar2.f22134l;
                        if (yVar != null) {
                            jSONObject.put("target_app", yVar.f22190a);
                        }
                        a12.putString("6_extras", jSONObject.toString());
                    } catch (JSONException unused2) {
                    }
                    a11.f22165b.a(a12, str2);
                } catch (Throwable th2) {
                    i6.a.a(a11, th2);
                }
            }
        }
        d6.e.f12661b.a(cVar.a(), new e.a() { // from class: n6.u
            @Override // d6.e.a
            public final boolean a(Intent intent, int i10) {
                v vVar = v.this;
                gm.l.f(vVar, "this$0");
                vVar.c(i10, intent, null);
                return true;
            }
        });
        Intent intent = new Intent();
        intent.setClass(o5.v.a(), FacebookActivity.class);
        intent.setAction(dVar2.f22123a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", dVar2);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (o5.v.a().getPackageManager().resolveActivity(intent, 0) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                activity.startActivityForResult(intent, cVar.a());
                z11 = true;
            } catch (ActivityNotFoundException unused3) {
            }
        }
        if (z11) {
            final v a13 = v.a();
            l lVar = this.callbackManager;
            final n<x> nVar = new n<x>() { // from class: cn.sharesdk.facebook.FacebookOfficialAuth.1
                @Override // o5.n
                /* renamed from: a */
                public void onSuccess(x xVar) {
                    String valueOf = String.valueOf(xVar.f22183a.f22671e);
                    String valueOf2 = String.valueOf(xVar.f22183a.f22667a);
                    String valueOf3 = String.valueOf(xVar.f22183a.f22675i);
                    String valueOf4 = String.valueOf(xVar.f22183a.f22677k);
                    String valueOf5 = String.valueOf(xVar.f22183a.f22668b);
                    String valueOf6 = String.valueOf(xVar.f22183a.f22674h);
                    if (FacebookOfficialAuth.this.platform.getDb() != null) {
                        FacebookOfficialAuth.this.platform.getDb().putToken(valueOf);
                        FacebookOfficialAuth.this.platform.getDb().put("expires", valueOf2);
                        FacebookOfficialAuth.this.platform.getDb().putUserId(valueOf3);
                        FacebookOfficialAuth.this.platform.getDb().put("GraphDomain", valueOf4);
                        FacebookOfficialAuth.this.platform.getDb().put("Permissions", valueOf5);
                        FacebookOfficialAuth.this.platform.getDb().put("ApplicationId", valueOf6);
                    }
                    if (FacebookOfficialAuth.this.actionListener != null) {
                        FacebookOfficialAuth.this.actionListener.onComplete(FacebookOfficialAuth.this.platform, 1, null);
                    }
                    SSDKLog.b().a("FacebookOfficialAuth onSuccess finish");
                    FacebookOfficialAuth.this.finish();
                }

                @Override // o5.n
                public void onCancel() {
                    if (FacebookOfficialAuth.this.actionListener != null) {
                        FacebookOfficialAuth.this.actionListener.onCancel(FacebookOfficialAuth.this.platform, 1);
                    }
                    SSDKLog.b().a("FacebookOfficialAuth onCancel finish");
                    FacebookOfficialAuth.this.finish();
                }

                @Override // o5.n
                public void onError(o5.p pVar) {
                    if (FacebookOfficialAuth.this.actionListener != null) {
                        FacebookOfficialAuth.this.actionListener.onError(FacebookOfficialAuth.this.platform, 1, pVar);
                    }
                    SSDKLog.b().a("FacebookOfficialAuth onError finish");
                    FacebookOfficialAuth.this.finish();
                }
            };
            if (lVar instanceof d6.e) {
                int a14 = cVar.a();
                ((d6.e) lVar).f12663a.put(Integer.valueOf(a14), new e.a() { // from class: n6.t
                    @Override // d6.e.a
                    public final boolean a(Intent intent2, int i10) {
                        v vVar = v.this;
                        o5.n nVar2 = nVar;
                        gm.l.f(vVar, "this$0");
                        vVar.c(i10, intent2, nVar2);
                        return true;
                    }
                });
                return;
            }
            throw new o5.p("Unexpected CallbackManager, please use the provided Factory.");
        }
        o5.p pVar = new o5.p("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        v.b(activity, p.e.a.ERROR, null, pVar, false, dVar2);
        throw pVar;
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.callbackManager.a(i10, i11, intent);
        super.onActivityResult(i10, i11, intent);
        SSDKLog.b().a("FacebookOfficialAuth onActivityResult");
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        SSDKLog.b().a("FacebookOfficialAuth onCreate ");
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("FacebookOfficialAuth onCreate exception ");
            a10.append(e10.getMessage());
            b10.a(a10.toString());
        }
        try {
            loginManager();
            SSDKLog.b().a("FacebookOfficialAuth onCreate loginManager() ");
        } catch (Throwable th2) {
            PlatformActionListener platformActionListener = this.actionListener;
            if (platformActionListener != null) {
                platformActionListener.onError(this.platform, 1, th2);
            }
            SSDKLog b11 = SSDKLog.b();
            b11.a("FacebookOfficialAuth onCreate catch: " + th2);
            finish();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("FacebookOfficialAuth onDestroy");
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("FacebookOfficialAuth onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("FacebookOfficialAuth onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("FacebookOfficialAuth onStop");
    }
}
