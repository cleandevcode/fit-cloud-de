package cn.sharesdk.sina.weibo;

import android.os.Bundle;
import android.support.v4.media.d;
import android.widget.LinearLayout;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;

/* loaded from: classes.dex */
public class SinaWeiboWebAuthOfficial extends FakeActivity {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private String permissions;
    private String redirectUrl;

    public SinaWeiboWebAuthOfficial(String str, String str2, String str3, AuthorizeListener authorizeListener) {
        this.appkey = str;
        this.redirectUrl = str2;
        this.permissions = str3;
        this.listener = authorizeListener;
    }

    public void loginManager() {
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onCreate ");
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.authorizeWeb(this.activity, new WbAuthListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboWebAuthOfficial.3
                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onCancel() {
                    SinaWeiboWebAuthOfficial.this.listener.onCancel();
                    SinaWeiboWebAuthOfficial.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onComplete(Oauth2AccessToken oauth2AccessToken) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, oauth2AccessToken.getAccessToken());
                    bundle.putString(Oauth2AccessToken.KEY_EXPIRES_IN, String.valueOf(oauth2AccessToken.getExpiresTime()));
                    bundle.putString(Oauth2AccessToken.KEY_REFRESH_TOKEN, oauth2AccessToken.getRefreshToken());
                    bundle.putString("username", oauth2AccessToken.getScreenName());
                    bundle.putString(Oauth2AccessToken.KEY_UID, oauth2AccessToken.getUid());
                    SinaWeiboWebAuthOfficial.this.listener.onComplete(bundle);
                    SinaWeiboWebAuthOfficial.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onError(UiError uiError) {
                    StringBuilder a10 = d.a("errorCode: ");
                    a10.append(uiError.errorCode);
                    a10.append(" errorMessage: ");
                    a10.append(uiError.errorMessage);
                    a10.append(" errorDetail: ");
                    a10.append(uiError.errorDetail);
                    SinaWeiboWebAuthOfficial.this.listener.onError(new Throwable(a10.toString()));
                    SinaWeiboWebAuthOfficial.this.finish();
                }
            });
            return;
        }
        AuthorizeListener authorizeListener = this.listener;
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable("SinaWeibo SDK init failed"));
        }
        finish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        super.onCreate();
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onCreate ");
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Exception e10) {
            SSDKLog.b().a(e10);
            SSDKLog b10 = SSDKLog.b();
            StringBuilder a10 = d.a("SinaWeiboOfficialAuth onCreate exception ");
            a10.append(e10.getMessage());
            b10.a(a10.toString());
        }
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboWebAuthOfficial.1
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    AuthInfo authInfo = new AuthInfo(SinaWeiboWebAuthOfficial.this.activity, SinaWeiboWebAuthOfficial.this.appkey, SinaWeiboWebAuthOfficial.this.redirectUrl, SinaWeiboWebAuthOfficial.this.permissions);
                    SinaWeiboWebAuthOfficial sinaWeiboWebAuthOfficial = SinaWeiboWebAuthOfficial.this;
                    sinaWeiboWebAuthOfficial.iwbapi = WBAPIFactory.createWBAPI(sinaWeiboWebAuthOfficial.activity);
                    SinaWeiboWebAuthOfficial.this.iwbapi.registerApp(SinaWeiboWebAuthOfficial.this.activity, authInfo, new SdkListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboWebAuthOfficial.1.1
                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitFailure(Exception exc) {
                            if (SinaWeiboWebAuthOfficial.this.listener != null) {
                                SinaWeiboWebAuthOfficial.this.listener.onError(exc);
                            }
                            SSDKLog b11 = SSDKLog.b();
                            b11.a("SinaWeiboShareOfficial", "WeiboInitFailure " + exc);
                        }

                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitSuccess() {
                            SinaWeibo.initFlag = true;
                            SSDKLog.b().a("WB init Sucess", new Object[0]);
                        }
                    });
                } catch (Throwable th2) {
                    SSDKLog.b().a("SinaWeiboOfficialAuth", e.a("onCreate AuthInfo ", th2));
                }
            }
        });
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboWebAuthOfficial.2
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    if (SinaWeibo.initFlag) {
                        SinaWeiboWebAuthOfficial.this.loginManager();
                    }
                    SSDKLog.b().a("SinaWeiboOfficialAuth onCreate loginManager() ");
                } catch (Throwable th2) {
                    if (SinaWeiboWebAuthOfficial.this.listener != null) {
                        SinaWeiboWebAuthOfficial.this.listener.onError(new Throwable(e.a("Authorize catch: ", th2)));
                    }
                    SSDKLog b11 = SSDKLog.b();
                    b11.a("SinaWeiboOfficialAuth onCreate catch: " + th2);
                    SinaWeiboWebAuthOfficial.this.finish();
                }
            }
        });
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onDestroy");
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("SinaWeiboWebAuthOfficial onStop");
    }
}
