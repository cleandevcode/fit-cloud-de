package cn.sharesdk.sina.weibo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.d;
import android.widget.LinearLayout;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.j;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.openapi.WBAPIFactory;

/* loaded from: classes.dex */
public class SinaWeiboOfficialAuth extends FakeActivity {
    private String appkey;
    private IWBAPI iwbapi;
    private AuthorizeListener listener;
    private String permissions;
    private String redirectUrl;

    public SinaWeiboOfficialAuth(String str, String str2, String str3, AuthorizeListener authorizeListener) {
        this.appkey = str;
        this.redirectUrl = str2;
        this.permissions = str3;
        this.listener = authorizeListener;
    }

    private String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    private String join(Object[] objArr, String str, int i10, int i11) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i12 = i11 - i10;
        if (i12 <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i12 * 16);
        Object obj = objArr[i10];
        if (obj != null) {
            sb2.append(obj);
        }
        while (true) {
            i10++;
            if (i10 >= i11) {
                return sb2.toString();
            }
            sb2.append(str);
            Object obj2 = objArr[i10];
            if (obj2 != null) {
                sb2.append(obj2);
            }
        }
    }

    public void loginManager() {
        SSDKLog.b().a("SinaWeiboOfficialAuth loginManager");
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.authorizeClient(this.activity, new WbAuthListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.3
                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onCancel() {
                    SinaWeiboOfficialAuth.this.listener.onCancel();
                    SinaWeiboOfficialAuth.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onComplete(Oauth2AccessToken oauth2AccessToken) {
                    Bundle bundle = new Bundle();
                    bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, oauth2AccessToken.getAccessToken());
                    bundle.putString(Oauth2AccessToken.KEY_EXPIRES_IN, String.valueOf(oauth2AccessToken.getExpiresTime()));
                    bundle.putString(Oauth2AccessToken.KEY_REFRESH_TOKEN, oauth2AccessToken.getRefreshToken());
                    bundle.putString("username", oauth2AccessToken.getScreenName());
                    bundle.putString(Oauth2AccessToken.KEY_UID, oauth2AccessToken.getUid());
                    SinaWeiboOfficialAuth.this.listener.onComplete(bundle);
                    SinaWeiboOfficialAuth.this.finish();
                }

                @Override // com.sina.weibo.sdk.auth.WbAuthListener
                public void onError(UiError uiError) {
                    SinaWeiboOfficialAuth sinaWeiboOfficialAuth = SinaWeiboOfficialAuth.this;
                    sinaWeiboOfficialAuth.showWebAuthActivity(sinaWeiboOfficialAuth.listener);
                    SinaWeiboOfficialAuth.this.finish();
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

    public void showWebAuthActivity(AuthorizeListener authorizeListener) {
        new SinaWeiboWebAuthOfficial(this.appkey, this.redirectUrl, this.permissions, authorizeListener).show(MobSDK.getContext(), null);
        SSDKLog.b().a("SinaWeibo SDK Web showWebAuthActivity ");
    }

    @Override // com.mob.tools.FakeActivity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        IWBAPI iwbapi = this.iwbapi;
        if (iwbapi != null) {
            iwbapi.authorizeCallback(this.activity, i10, i11, intent);
        }
        SSDKLog.b().a("SinaWeiboOfficialAuth onActivityResult");
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        SSDKLog.b().a("SinaWeiboOfficialAuth onCreate ");
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
            AuthorizeListener authorizeListener = this.listener;
            if (authorizeListener != null && authorizeListener != null) {
                authorizeListener.onError(new Throwable("SinaWeibo SDK init failed"));
            }
            finish();
        }
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.1
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    AuthInfo authInfo = new AuthInfo(SinaWeiboOfficialAuth.this.activity, SinaWeiboOfficialAuth.this.appkey, SinaWeiboOfficialAuth.this.redirectUrl, SinaWeiboOfficialAuth.this.permissions);
                    SinaWeiboOfficialAuth sinaWeiboOfficialAuth = SinaWeiboOfficialAuth.this;
                    sinaWeiboOfficialAuth.iwbapi = WBAPIFactory.createWBAPI(sinaWeiboOfficialAuth.activity);
                    SinaWeiboOfficialAuth.this.iwbapi.registerApp(SinaWeiboOfficialAuth.this.activity, authInfo, new SdkListener() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.1.1
                        @Override // com.sina.weibo.sdk.openapi.SdkListener
                        public void onInitFailure(Exception exc) {
                            if (SinaWeiboOfficialAuth.this.listener != null) {
                                SinaWeiboOfficialAuth.this.listener.onError(exc);
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
        j.a(new j.a() { // from class: cn.sharesdk.sina.weibo.SinaWeiboOfficialAuth.2
            @Override // cn.sharesdk.framework.utils.j.a
            public void a() {
                try {
                    if (SinaWeibo.initFlag) {
                        SinaWeiboOfficialAuth.this.loginManager();
                    }
                    SSDKLog.b().a("SinaWeiboOfficialAuth onCreate loginManager() ");
                } catch (Throwable th2) {
                    if (SinaWeiboOfficialAuth.this.listener != null) {
                        SinaWeiboOfficialAuth.this.listener.onError(new Throwable(e.a("Authorize catch: ", th2)));
                    }
                    SSDKLog b11 = SSDKLog.b();
                    b11.a("SinaWeiboOfficialAuth onCreate catch: " + th2);
                    SinaWeiboOfficialAuth.this.finish();
                }
            }
        });
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        super.onDestroy();
        SSDKLog.b().a("SinaWeiboOfficialAuth onDestroy");
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        super.onPause();
        SSDKLog.b().a("SinaWeiboOfficialAuth onPause");
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        super.onResume();
        SSDKLog.b().a("SinaWeiboOfficialAuth onResume");
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        super.onStop();
        SSDKLog.b().a("SinaWeiboOfficialAuth onStop");
    }
}
