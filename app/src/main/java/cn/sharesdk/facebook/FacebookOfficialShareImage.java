package cn.sharesdk.facebook;

import android.content.Intent;
import android.graphics.Bitmap;
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
import r6.i;
import r6.j;

/* loaded from: classes.dex */
public class FacebookOfficialShareImage extends FakeActivity implements n<p6.a> {
    private PlatformActionListener actionListener;
    private Bitmap bitmapParams;
    private l callbackManager;
    private String hashTag;
    private Platform platform;
    private s6.a shareDialog;

    public FacebookOfficialShareImage(Platform platform, PlatformActionListener platformActionListener) {
        try {
            this.platform = platform;
            this.actionListener = platformActionListener;
            SSDKLog.b().a("Facebook doShare official FacebookOfficialShareImage construction");
        } catch (Throwable th2) {
            SSDKLog b10 = SSDKLog.b();
            b10.a("Facebook doShare official FacebookOfficialShareImage catch:  " + th2);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.callbackManager.a(i10, i11, intent);
        super.onActivityResult(i10, i11, intent);
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onActivityResult ");
    }

    @Override // o5.n
    public void onCancel() {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onCancel(this.platform, 9);
        }
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onCancel ");
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
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = android.support.v4.media.d.a("Facebook doShare official FacebookOfficialShareImage onCreate catch  ");
            a10.append(e10.getMessage());
            b10.a(a10.toString());
        }
        SSDKLog.b().a("Facebook FacebookOfficialHelper onCreate");
        this.callbackManager = new d6.e();
        s6.a aVar = new s6.a(this.activity);
        this.shareDialog = aVar;
        aVar.c(this.callbackManager, this);
        shareImageOfficial(this.bitmapParams, this.hashTag);
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onDestroy ");
    }

    @Override // o5.n
    public void onError(p pVar) {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onError(this.platform, 9, pVar);
        }
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onError ");
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onPause ");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onResume ");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onStop ");
    }

    @Override // o5.n
    public void onSuccess(p6.a aVar) {
        PlatformActionListener platformActionListener = this.actionListener;
        if (platformActionListener != null) {
            platformActionListener.onComplete(this.platform, 9, null);
        }
        SSDKLog.b().a("Facebook doShare  FacebookOfficialShareImage onSuccess ");
        finish();
    }

    public void setBitmapParams(Bitmap bitmap) {
        this.bitmapParams = bitmap;
    }

    public void setHashTag(String str) {
        this.hashTag = str;
    }

    public void shareImageOfficial(Bitmap bitmap, String str) {
        PlatformActionListener platformActionListener;
        Platform platform;
        Throwable th2;
        j jVar;
        try {
            SSDKLog.b().a("Facebook FacebookOfficialHelper shareImageOfficial");
            if (bitmap != null) {
                i.a aVar = new i.a();
                aVar.f25380b = bitmap;
                i iVar = new i(aVar);
                if (TextUtils.isEmpty(str)) {
                    j.a aVar2 = new j.a();
                    aVar2.a(iVar);
                    jVar = new j(aVar2);
                } else {
                    j.a aVar3 = new j.a();
                    aVar3.a(iVar);
                    e.a aVar4 = new e.a();
                    aVar4.f25366a = str;
                    aVar3.f25364f = new r6.e(aVar4);
                    jVar = new j(aVar3);
                }
                if (s6.a.g(j.class)) {
                    s6.a aVar5 = this.shareDialog;
                    if (aVar5 != null) {
                        aVar5.e(jVar);
                        SSDKLog.b().a("Facebook FacebookOfficialHelper shareImageOfficial shareDialog.show");
                        return;
                    } else if (this.actionListener != null) {
                        SSDKLog.b().a("Facebook doShare shareImageOfficial shareDialog is null ");
                        platformActionListener = this.actionListener;
                        platform = this.platform;
                        th2 = new Throwable("shareDialog is null");
                    } else {
                        return;
                    }
                } else if (this.actionListener != null) {
                    SSDKLog.b().a("Facebook doShare shareImageOfficial ShareDialog.canShow(SharePhotoContent.class) is false, are you login first? ");
                    platformActionListener = this.actionListener;
                    platform = this.platform;
                    th2 = new Throwable("ShareDialog.canShow(SharePhotoContent.class) is false, are you login first?");
                } else {
                    return;
                }
            } else if (this.actionListener != null) {
                SSDKLog.b().a("Facebook doShare shareImageOfficial set bitmap image is error, please check ");
                platformActionListener = this.actionListener;
                platform = this.platform;
                th2 = new Throwable("set bitmap image is error, please check");
            } else {
                return;
            }
            platformActionListener.onError(platform, 9, th2);
            finish();
        } catch (Throwable th3) {
            SSDKLog.b().a("Facebook doShare shareImageOfficial shareImageOfficial catch ");
            PlatformActionListener platformActionListener2 = this.actionListener;
            if (platformActionListener2 != null) {
                platformActionListener2.onError(this.platform, 9, th3);
            }
            finish();
        }
    }
}
