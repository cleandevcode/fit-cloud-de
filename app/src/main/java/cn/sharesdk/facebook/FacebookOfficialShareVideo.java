package cn.sharesdk.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
import r6.l;
import r6.m;

/* loaded from: classes.dex */
public class FacebookOfficialShareVideo extends FakeActivity implements n<p6.a> {
    private PlatformActionListener actionListener;
    private l callbackManager;
    private String hashTag;
    private Platform platform;
    private s6.a shareDialog;
    private Uri videoUri;

    public FacebookOfficialShareVideo(Platform platform, PlatformActionListener platformActionListener) {
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
        shareVideoOfficial(this.videoUri, this.hashTag);
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("FacebookOfficialShareVideo onDestroy");
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
        SSDKLog.b().a("FacebookOfficialShareVideo onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("FacebookOfficialShareVideo onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("FacebookOfficialShareVideo onStop");
    }

    @Override // o5.n
    public void onSuccess(p6.a aVar) {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onComplete(this.platform, 9, null);
        }
        finish();
    }

    public void setHashTag(String str) {
        this.hashTag = str;
    }

    public void setVideoUri(Uri uri) {
        this.videoUri = uri;
    }

    public void shareVideoOfficial(Uri uri, String str) {
        PlatformActionListener platformActionListener;
        Platform platform;
        Throwable th2;
        m mVar;
        try {
            if (uri != null) {
                l.a aVar = new l.a();
                aVar.f25392b = uri;
                new Bundle(aVar.f25370a);
                Uri uri2 = aVar.f25392b;
                if (TextUtils.isEmpty(str)) {
                    m.a aVar2 = new m.a();
                    l.a aVar3 = new l.a();
                    aVar3.f25392b = uri2;
                    aVar2.f25399i = new r6.l(aVar3);
                    mVar = new m(aVar2);
                } else {
                    m.a aVar4 = new m.a();
                    l.a aVar5 = new l.a();
                    aVar5.f25392b = uri2;
                    aVar4.f25399i = new r6.l(aVar5);
                    e.a aVar6 = new e.a();
                    aVar6.f25366a = str;
                    aVar4.f25364f = new r6.e(aVar6);
                    aVar4.f25398h = "contentTitle";
                    aVar4.f25397g = "contentText";
                    mVar = new m(aVar4);
                }
                if (s6.a.g(m.class)) {
                    s6.a aVar7 = this.shareDialog;
                    if (aVar7 != null) {
                        aVar7.e(mVar);
                        return;
                    }
                    platformActionListener = this.actionListener;
                    if (platformActionListener != null) {
                        platform = this.platform;
                        th2 = new Throwable("shareDialog is null");
                    } else {
                        return;
                    }
                } else {
                    platformActionListener = this.actionListener;
                    if (platformActionListener != null) {
                        platform = this.platform;
                        th2 = new Throwable("ShareDialog.canShow(ShareVideoContent.class) is false, are you login first?");
                    } else {
                        return;
                    }
                }
            } else {
                platformActionListener = this.actionListener;
                if (platformActionListener != null) {
                    platform = this.platform;
                    th2 = new Throwable("share video paramas is null");
                } else {
                    return;
                }
            }
            platformActionListener.onError(platform, 9, th2);
            finish();
        } catch (Throwable th3) {
            SSDKLog.b().a("shareVideoOfficial catch ");
            PlatformActionListener platformActionListener2 = this.actionListener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this.platform, 9, th3);
            }
            finish();
        }
    }
}
