package cn.sharesdk.tencent.qq;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.c;
import cn.sharesdk.tencent.qq.utils.DownLoadWebPage;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: d */
    private String f5468d;

    /* renamed from: e */
    private String f5469e;

    /* renamed from: f */
    private String f5470f;

    public b(SSOAuthorizeActivity sSOAuthorizeActivity) {
        super(sSOAuthorizeActivity);
    }

    private void b() {
        DownLoadWebPage downLoadWebPage = new DownLoadWebPage();
        downLoadWebPage.setListener(this.f5205c);
        downLoadWebPage.show(this.f5203a.getContext(), null);
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a() {
        if (TextUtils.isEmpty(this.f5470f) || this.f5470f.equals("com.tencent.qqlite")) {
            b();
            this.f5203a.finish();
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f5470f, "com.tencent.open.agent.AgentActivity");
        if (this.f5203a.getContext().getPackageManager().resolveActivity(intent, 0) == null) {
            this.f5203a.finish();
            if (this.f5205c != null) {
                b();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("scope", this.f5469e);
        bundle.putString("client_id", this.f5468d);
        bundle.putString("pf", "openmobile_android");
        bundle.putString("need_pay", "1");
        intent.putExtra("key_params", bundle);
        intent.putExtra("key_request_code", this.f5204b);
        intent.putExtra("key_action", "action_login");
        try {
            this.f5203a.startActivityForResult(intent, this.f5204b);
        } catch (Throwable th2) {
            this.f5203a.finish();
            SSOListener sSOListener = this.f5205c;
            if (sSOListener != null) {
                sSOListener.onFailed(th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a(int i10, int i11, Intent intent) {
        SSOListener sSOListener;
        this.f5203a.finish();
        if (i11 == 0) {
            SSOListener sSOListener2 = this.f5205c;
            if (sSOListener2 != null) {
                sSOListener2.onCancel();
            }
        } else if (intent == null) {
            SSOListener sSOListener3 = this.f5205c;
            if (sSOListener3 != null) {
                sSOListener3.onFailed(new Throwable("response is empty"));
            }
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                SSOListener sSOListener4 = this.f5205c;
                if (sSOListener4 != null) {
                    sSOListener4.onFailed(new Throwable("response is empty"));
                }
            } else if (!extras.containsKey("key_response")) {
                SSOListener sSOListener5 = this.f5205c;
                if (sSOListener5 != null) {
                    sSOListener5.onFailed(new Throwable("response is empty"));
                }
            } else {
                String string = extras.getString("key_response");
                if (string == null || string.length() <= 0) {
                    SSOListener sSOListener6 = this.f5205c;
                    if (sSOListener6 != null) {
                        sSOListener6.onFailed(new Throwable("response is empty"));
                        return;
                    }
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Bundle bundle = new Bundle();
                    bundle.putInt("ret", jSONObject.optInt("ret"));
                    bundle.putString("pay_token", jSONObject.optString("pay_token"));
                    bundle.putString("pf", jSONObject.optString("pf"));
                    bundle.putString("open_id", jSONObject.optString("openid"));
                    bundle.putString(Oauth2AccessToken.KEY_EXPIRES_IN, jSONObject.optString(Oauth2AccessToken.KEY_EXPIRES_IN));
                    bundle.putString("pfkey", jSONObject.optString("pfkey"));
                    bundle.putString("msg", jSONObject.optString("msg"));
                    bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, jSONObject.optString(Oauth2AccessToken.KEY_ACCESS_TOKEN));
                    String optString = jSONObject.optString("msg");
                    if (!TextUtils.isEmpty(optString) && (sSOListener = this.f5205c) != null) {
                        sSOListener.onFailed(new Throwable(optString));
                        return;
                    }
                    SSOListener sSOListener7 = this.f5205c;
                    if (sSOListener7 != null) {
                        sSOListener7.onComplete(bundle);
                        this.f5205c = null;
                    }
                } catch (Throwable th2) {
                    SSOListener sSOListener8 = this.f5205c;
                    if (sSOListener8 != null) {
                        sSOListener8.onFailed(th2);
                    }
                }
            }
        }
    }

    public void a(String str, String str2, String str3) {
        this.f5468d = str;
        this.f5469e = str2;
        this.f5470f = str3;
    }
}
