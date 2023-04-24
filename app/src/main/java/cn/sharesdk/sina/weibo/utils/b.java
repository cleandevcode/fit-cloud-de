package cn.sharesdk.sina.weibo.utils;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.text.TextUtils;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.authorize.SSOAuthorizeActivity;
import cn.sharesdk.framework.authorize.SSOListener;
import cn.sharesdk.framework.authorize.c;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.sina.weibo.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends c implements ServiceConnection {

    /* renamed from: d */
    private String f5410d;

    /* renamed from: e */
    private String f5411e;

    /* renamed from: f */
    private String[] f5412f;

    public b(SSOAuthorizeActivity sSOAuthorizeActivity) {
        super(sSOAuthorizeActivity);
    }

    private void a(Intent intent, final ShareSDKCallback<Boolean> shareSDKCallback) {
        DH.requester(this.f5203a.getContext()).resolveActivity(intent, 0).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.utils.b.3
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    ResolveInfo resolveActivity = dHResponse.resolveActivity(new int[0]);
                    if (resolveActivity != null) {
                        DH.requester(MobSDK.getContext()).getPInfoForce(true, resolveActivity.activityInfo.packageName, 64).request(new DH.DHResponder() { // from class: cn.sharesdk.sina.weibo.utils.b.3.1
                            @Override // com.mob.tools.utils.DH.DHResponder
                            public void onResponse(DH.DHResponse dHResponse2) {
                                try {
                                    for (Signature signature : dHResponse2.getPInfoForce(new int[0]).signatures) {
                                        if ("30820295308201fea00302010202044b4ef1bf300d06092a864886f70d010105050030818d310b300906035504061302434e3110300e060355040813074265694a696e673110300e060355040713074265694a696e67312c302a060355040a132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c7464312c302a060355040b132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c74643020170d3130303131343130323831355a180f32303630303130323130323831355a30818d310b300906035504061302434e3110300e060355040813074265694a696e673110300e060355040713074265694a696e67312c302a060355040a132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c7464312c302a060355040b132353696e612e436f6d20546563686e6f6c6f677920284368696e612920436f2e204c746430819f300d06092a864886f70d010101050003818d00308189028181009d367115bc206c86c237bb56c8e9033111889b5691f051b28d1aa8e42b66b7413657635b44786ea7e85d451a12a82a331fced99c48717922170b7fc9bc1040753c0d38b4cf2b22094b1df7c55705b0989441e75913a1a8bd2bc591aa729a1013c277c01c98cbec7da5ad7778b2fad62b85ac29ca28ced588638c98d6b7df5a130203010001300d06092a864886f70d0101050500038181000ad4b4c4dec800bd8fd2991adfd70676fce8ba9692ae50475f60ec468d1b758a665e961a3aedbece9fd4d7ce9295cd83f5f19dc441a065689d9820faedbb7c4a4c4635f5ba1293f6da4b72ed32fb8795f736a20c95cda776402099054fccefb4a1a558664ab8d637288feceba9508aa907fc1fe2b1ae5a0dec954ed831c0bea4".equals(signature.toCharsString())) {
                                            ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                                            if (shareSDKCallback2 != null) {
                                                shareSDKCallback2.onCallback(Boolean.TRUE);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                                    if (shareSDKCallback3 != null) {
                                        shareSDKCallback3.onCallback(Boolean.FALSE);
                                    }
                                } catch (Throwable unused) {
                                    ShareSDKCallback shareSDKCallback4 = shareSDKCallback;
                                    if (shareSDKCallback4 != null) {
                                        shareSDKCallback4.onCallback(Boolean.FALSE);
                                    }
                                }
                            }
                        });
                        return;
                    }
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(Boolean.FALSE);
                    }
                } catch (Throwable unused) {
                    ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                    if (shareSDKCallback3 != null) {
                        shareSDKCallback3.onCallback(Boolean.FALSE);
                    }
                }
            }
        });
    }

    private void a(String str, String str2, final ShareSDKCallback<Boolean> shareSDKCallback) {
        final Intent intent = new Intent();
        intent.setClassName(str, str2);
        intent.putExtra("appKey", this.f5410d);
        intent.putExtra("redirectUri", this.f5411e);
        String[] strArr = this.f5412f;
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("scope", TextUtils.join(",", strArr));
        }
        a(intent, new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.sina.weibo.utils.b.2
            @Override // cn.sharesdk.framework.ShareSDKCallback
            /* renamed from: a */
            public void onCallback(Boolean bool) {
                ShareSDKCallback shareSDKCallback2;
                Boolean bool2;
                if (bool.booleanValue()) {
                    try {
                        b.this.f5203a.startActivityForResult(intent, b.this.f5204b);
                        b.this.f5203a.getContext().getApplicationContext().unbindService(b.this);
                        shareSDKCallback2 = shareSDKCallback;
                        if (shareSDKCallback2 == null) {
                            return;
                        }
                        bool2 = Boolean.TRUE;
                    } catch (Throwable unused) {
                        ShareSDKCallback shareSDKCallback3 = shareSDKCallback;
                        if (shareSDKCallback3 != null) {
                            shareSDKCallback3.onCallback(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                } else {
                    shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 == null) {
                        return;
                    }
                    bool2 = Boolean.FALSE;
                }
                shareSDKCallback2.onCallback(bool2);
            }
        });
    }

    private void b(Intent intent) {
        if (this.f5205c == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("error_type");
        }
        if (stringExtra == null) {
            this.f5205c.onComplete(intent.getExtras());
        } else if (!stringExtra.equals("access_denied") && !stringExtra.equals("OAuthAccessDeniedException")) {
            String stringExtra2 = intent.getStringExtra("error_description");
            if (stringExtra2 != null) {
                stringExtra = android.support.v4.media.a.a(stringExtra, ": ", stringExtra2);
            }
            this.f5205c.onFailed(new Throwable(stringExtra));
        } else {
            this.f5205c.onCancel();
        }
    }

    private void c(Intent intent) {
        if (intent == null) {
            SSOListener sSOListener = this.f5205c;
            if (sSOListener != null) {
                sSOListener.onCancel();
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("error");
        int intExtra = intent.getIntExtra("error_code", -1);
        Throwable th2 = new Throwable(stringExtra + " (" + intExtra + ")");
        SSOListener sSOListener2 = this.f5205c;
        if (sSOListener2 != null) {
            sSOListener2.onFailed(th2);
        }
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a() {
        boolean z10;
        Intent intent = new Intent();
        intent.setClassName(BuildConfig.APPLICATION_ID, "com.sina.weibo.business.RemoteSSOService");
        try {
            z10 = this.f5203a.getContext().getApplicationContext().bindService(intent, this, 1);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        this.f5203a.finish();
        SSOListener sSOListener = this.f5205c;
        if (sSOListener != null) {
            sSOListener.onFailed(new Throwable());
        }
    }

    @Override // cn.sharesdk.framework.authorize.c
    public void a(int i10, int i11, Intent intent) {
        this.f5203a.finish();
        if (i10 == this.f5204b) {
            if (i11 == -1) {
                b(intent);
            } else if (i11 != 0) {
            } else {
                c(intent);
            }
        }
    }

    public void a(String str, String str2, String[] strArr) {
        this.f5410d = str;
        this.f5411e = str2;
        this.f5412f = strArr;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            Class<?> cls = Class.forName("com.sina.sso.RemoteSSO$Stub");
            Method method = cls.getMethod("asInterface", IBinder.class);
            method.setAccessible(true);
            Object invoke = method.invoke(null, iBinder);
            Method method2 = cls.getMethod("getPackageName", new Class[0]);
            method2.setAccessible(true);
            String valueOf = String.valueOf(method2.invoke(invoke, new Object[0]));
            Method method3 = cls.getMethod("getActivityName", new Class[0]);
            method3.setAccessible(true);
            a(valueOf, String.valueOf(method3.invoke(invoke, new Object[0])), new ShareSDKCallback<Boolean>() { // from class: cn.sharesdk.sina.weibo.utils.b.1
                @Override // cn.sharesdk.framework.ShareSDKCallback
                /* renamed from: a */
                public void onCallback(Boolean bool) {
                    if (bool.booleanValue()) {
                        return;
                    }
                    b.this.f5203a.finish();
                    if (b.this.f5205c != null) {
                        b.this.f5205c.onFailed(new Throwable());
                    }
                }
            });
        } catch (Throwable th2) {
            this.f5203a.finish();
            SSOListener sSOListener = this.f5205c;
            if (sSOListener != null) {
                sSOListener.onFailed(th2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f5203a.finish();
        SSOListener sSOListener = this.f5205c;
        if (sSOListener != null) {
            sSOListener.onFailed(new Throwable());
        }
    }
}
