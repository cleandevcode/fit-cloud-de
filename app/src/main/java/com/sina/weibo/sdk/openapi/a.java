package com.sina.weibo.sdk.openapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.share.ShareTransActivity;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.sina.weibo.sdk.share.e;
import com.sina.weibo.sdk.web.b.d;
import no.nordicsemi.android.dfu.DfuServiceInitiator;

/* loaded from: classes.dex */
public final class a implements IWBAPI {
    private Context mContext;

    /* renamed from: r */
    private com.sina.weibo.sdk.auth.a f9520r = new com.sina.weibo.sdk.auth.a();

    /* renamed from: s */
    private e f9521s = new e();

    public a(Context context) {
        this.mContext = context;
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorize(Activity activity, WbAuthListener wbAuthListener) {
        com.sina.weibo.sdk.auth.a aVar = this.f9520r;
        c.a("WBSsoTag", "authorize()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f9493d = wbAuthListener;
        if (com.sina.weibo.sdk.a.a(activity)) {
            if (com.sina.weibo.sdk.b.a.e(activity) != null) {
                aVar.a(activity);
                return;
            }
        }
        aVar.b(activity);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeCallback(Activity activity, int i10, int i11, Intent intent) {
        com.sina.weibo.sdk.auth.a aVar = this.f9520r;
        c.a("WBSsoTag", "authorizeCallback()");
        WbAuthListener wbAuthListener = aVar.f9493d;
        if (wbAuthListener != null) {
            if (32973 != i10) {
                wbAuthListener.onError(new UiError(-7, "request code is error", "requestCode is error"));
            } else if (i11 != -1) {
                if (i11 == 0) {
                    wbAuthListener.onCancel();
                } else {
                    wbAuthListener.onError(new UiError(-6, "result code is error", "result code is error"));
                }
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("error");
                String stringExtra2 = intent.getStringExtra("error_type");
                String stringExtra3 = intent.getStringExtra("error_description");
                if (!TextUtils.isEmpty(stringExtra) || !TextUtils.isEmpty(stringExtra2) || !TextUtils.isEmpty(stringExtra3)) {
                    if ("access_denied".equals(stringExtra) || "OAuthAccessDeniedException".equals(stringExtra)) {
                        aVar.f9493d.onCancel();
                        return;
                    } else {
                        aVar.f9493d.onError(new UiError(-5, stringExtra2, stringExtra3));
                        return;
                    }
                }
                Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(intent.getExtras());
                if (parseAccessToken == null) {
                    aVar.f9493d.onError(new UiError(-4, "oauth2AccessToken is null", "oauth2AccessToken is null"));
                    return;
                }
                AccessTokenHelper.writeAccessToken(activity, parseAccessToken);
                aVar.f9493d.onComplete(parseAccessToken);
            }
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeClient(Activity activity, WbAuthListener wbAuthListener) {
        com.sina.weibo.sdk.auth.a aVar = this.f9520r;
        c.a("WBSsoTag", "authorizeClient()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f9493d = wbAuthListener;
        aVar.a(activity);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void authorizeWeb(Activity activity, WbAuthListener wbAuthListener) {
        com.sina.weibo.sdk.auth.a aVar = this.f9520r;
        c.a("WBSsoTag", "authorizeWeb()");
        if (wbAuthListener == null) {
            throw new RuntimeException("listener can not be null.");
        }
        aVar.f9493d = wbAuthListener;
        aVar.b(activity);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void doResultIntent(Intent intent, WbShareCallback wbShareCallback) {
        Bundle extras;
        if (intent == null || wbShareCallback == null || (extras = intent.getExtras()) == null) {
            return;
        }
        try {
            int i10 = extras.getInt("_weibo_resp_errcode", -1);
            if (i10 == 0) {
                wbShareCallback.onComplete();
            } else if (i10 == 1) {
                wbShareCallback.onCancel();
            } else if (i10 != 2) {
            } else {
                wbShareCallback.onError(new UiError(i10, extras.getString("_weibo_resp_errstr"), "error from weibo client!"));
            }
        } catch (Exception e10) {
            wbShareCallback.onError(new UiError(-1, e10.getMessage(), e10.getMessage()));
        }
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final boolean isWBAppInstalled() {
        return com.sina.weibo.sdk.a.a(this.mContext);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final boolean isWBAppSupportMultipleImage() {
        return com.sina.weibo.sdk.a.b(this.mContext);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void registerApp(Context context, AuthInfo authInfo) {
        registerApp(context, authInfo, null);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void registerApp(Context context, AuthInfo authInfo, SdkListener sdkListener) {
        com.sina.weibo.sdk.a.a(authInfo, sdkListener);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void setLoggerEnable(boolean z10) {
        c.setLoggerEnable(z10);
    }

    @Override // com.sina.weibo.sdk.openapi.IWBAPI
    public final void shareMessage(Activity activity, WeiboMultiMessage weiboMultiMessage, boolean z10) {
        e eVar = this.f9521s;
        if (activity != null) {
            if (com.sina.weibo.sdk.a.a(activity) || !z10) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - eVar.D >= DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT) {
                    eVar.D = currentTimeMillis;
                    if (z10) {
                        e.a(activity, weiboMultiMessage);
                        return;
                    }
                    a.C0120a e10 = com.sina.weibo.sdk.b.a.e(activity);
                    if (com.sina.weibo.sdk.a.a(activity) && e10 != null) {
                        a.C0120a e11 = com.sina.weibo.sdk.b.a.e(activity);
                        boolean z11 = false;
                        if (e11 != null && e11.f9497ah > 10000) {
                            z11 = true;
                        }
                        if (z11) {
                            e.a(activity, weiboMultiMessage);
                            return;
                        }
                    }
                    AuthInfo a10 = com.sina.weibo.sdk.a.a();
                    if (a10 != null) {
                        d dVar = new d(a10);
                        dVar.setContext(activity);
                        dVar.aE = weiboMultiMessage;
                        dVar.packageName = activity.getPackageName();
                        Oauth2AccessToken readAccessToken = AccessTokenHelper.readAccessToken(activity);
                        if (readAccessToken != null) {
                            String accessToken = readAccessToken.getAccessToken();
                            if (!TextUtils.isEmpty(readAccessToken.getAccessToken())) {
                                dVar.f9534ae = accessToken;
                            }
                        }
                        Bundle bundle = new Bundle();
                        dVar.writeToBundle(bundle);
                        Intent intent = new Intent(activity, ShareTransActivity.class);
                        intent.putExtra("start_flag", 1001);
                        intent.putExtra("start_web_activity", "com.sina.weibo.sdk.web.WebActivity");
                        intent.putExtras(bundle);
                        activity.startActivityForResult(intent, 10001);
                    }
                }
            }
        }
    }
}
