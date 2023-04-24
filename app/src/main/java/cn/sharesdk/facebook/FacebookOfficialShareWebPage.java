package cn.sharesdk.facebook;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.FakeActivity;
import o5.l;
import o5.n;
import o5.p;
import r6.e;
import r6.f;

/* loaded from: classes.dex */
public class FacebookOfficialShareWebPage extends FakeActivity implements n<p6.a> {
    private PlatformActionListener actionListener;
    private l callbackManager;
    private Platform platform;
    private s6.a shareDialog;

    public FacebookOfficialShareWebPage(Platform platform, PlatformActionListener platformActionListener) {
        try {
            this.platform = platform;
            this.actionListener = platformActionListener;
        } catch (Throwable th2) {
            SSDKLog.b().a(e.a("FacebookOfficialShare catch ", th2), new Object[0]);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.callbackManager.a(i10, i11, intent);
        super.onActivityResult(i10, i11, intent);
    }

    @Override // o5.n
    public void onCancel() {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this.platform, 9);
        }
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
        }
        SSDKLog.b().a("FacebookOfficialHelper onCreate");
        this.callbackManager = new d6.e();
        s6.a aVar = new s6.a(this.activity);
        this.shareDialog = aVar;
        aVar.c(this.callbackManager, this);
        Intent intent = this.activity.getIntent();
        String stringExtra = intent.getStringExtra(Facebook.PARAMS_LINKURL);
        String stringExtra2 = intent.getStringExtra(Facebook.PARAMS_HASHTAG);
        String stringExtra3 = intent.getStringExtra(Facebook.PARAMS_QUOTE);
        SSDKLog b10 = SSDKLog.b();
        b10.a("Share params url is: " + stringExtra + " hashtag: " + stringExtra2 + " quote: " + stringExtra3);
        shareLinkOfficial(stringExtra, stringExtra2, stringExtra3);
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("FacebookOfficialShareWebPage onDestroy");
    }

    @Override // o5.n
    public void onError(p pVar) {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onError(this.platform, 9, pVar);
        }
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("FacebookOfficialShareWebPage onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("FacebookOfficialShareWebPage onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("FacebookOfficialShareWebPage onStop");
    }

    @Override // o5.n
    public void onSuccess(p6.a aVar) {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onComplete(this.platform, 9, null);
        }
        finish();
    }

    public void shareLinkOfficial(String str, String str2, String str3) {
        f fVar;
        s6.a aVar;
        f.a aVar2;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    f.a aVar3 = new f.a();
                    aVar3.f25359a = Uri.parse(str);
                    e.a aVar4 = new e.a();
                    aVar4.f25366a = str2;
                    aVar3.f25364f = new r6.e(aVar4);
                    aVar3.f25368g = str3;
                    fVar = new f(aVar3);
                } else if (!TextUtils.isEmpty(str2)) {
                    f.a aVar5 = new f.a();
                    aVar5.f25359a = Uri.parse(str);
                    e.a aVar6 = new e.a();
                    aVar6.f25366a = str2;
                    aVar5.f25364f = new r6.e(aVar6);
                    fVar = new f(aVar5);
                } else {
                    if (!TextUtils.isEmpty(str3)) {
                        aVar2 = new f.a();
                        aVar2.f25359a = Uri.parse(str);
                        aVar2.f25368g = str3;
                    } else {
                        aVar2 = new f.a();
                        aVar2.f25359a = Uri.parse(str);
                    }
                    fVar = new f(aVar2);
                }
                if (s6.a.g(f.class)) {
                    aVar = this.shareDialog;
                    if (aVar == null) {
                        PlatformActionListener platformActionListener = this.actionListener;
                        if (platformActionListener != null) {
                            platformActionListener.onError(this.platform, 9, new Throwable("shareDialog is null"));
                            finish();
                            return;
                        }
                        return;
                    }
                } else {
                    PlatformActionListener platformActionListener2 = this.actionListener;
                    if (platformActionListener2 != null) {
                        platformActionListener2.onError(this.platform, 9, new Throwable("ShareDialog.canShow(ShareLinkContent.class) is false, are you login first?"));
                        finish();
                        return;
                    }
                    return;
                }
            } else if (!TextUtils.isEmpty(str2)) {
                if (s6.a.g(f.class)) {
                    f.a aVar7 = new f.a();
                    aVar7.f25359a = Uri.parse(str);
                    e.a aVar8 = new e.a();
                    aVar8.f25366a = str2;
                    aVar7.f25364f = new r6.e(aVar8);
                    fVar = new f(aVar7);
                    aVar = this.shareDialog;
                    if (aVar == null) {
                        PlatformActionListener platformActionListener3 = this.actionListener;
                        if (platformActionListener3 != null) {
                            platformActionListener3.onError(this.platform, 9, new Throwable("shareDialog is null"));
                            finish();
                            return;
                        }
                        return;
                    }
                } else {
                    PlatformActionListener platformActionListener4 = this.actionListener;
                    if (platformActionListener4 != null) {
                        platformActionListener4.onError(this.platform, 9, new Throwable("ShareDialog.canShow(ShareLinkContent.class) is false, are you login first?"));
                        finish();
                        return;
                    }
                    return;
                }
            } else {
                PlatformActionListener platformActionListener5 = this.actionListener;
                if (platformActionListener5 != null) {
                    platformActionListener5.onError(this.platform, 9, new Throwable("share link params is null"));
                    finish();
                    return;
                }
                return;
            }
            aVar.e(fVar);
        } catch (Throwable th2) {
            SSDKLog.b().a("shareLinkOfficial catch ");
            PlatformActionListener platformActionListener6 = this.actionListener;
            if (platformActionListener6 != null) {
                platformActionListener6.onError(this.platform, 9, th2);
            }
            finish();
        }
    }
}
