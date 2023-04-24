package com.sina.weibo.sdk.share;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.b.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ShareTransActivity extends BaseActivity {

    /* renamed from: t */
    private Intent f9522t;

    /* renamed from: u */
    private FrameLayout f9523u;

    /* renamed from: v */
    private d f9524v;

    /* renamed from: w */
    private String f9525w;

    /* renamed from: x */
    private Handler f9526x = new Handler(Looper.getMainLooper()) { // from class: com.sina.weibo.sdk.share.ShareTransActivity.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    ShareTransActivity.this.b((Intent) obj);
                    return;
                }
            }
            ShareTransActivity.this.j();
        }
    };

    public void a(WeiboMultiMessage weiboMultiMessage) {
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start wb composer");
        try {
            this.f9522t.putExtra("start_flag", 1002);
            String f10 = com.sina.weibo.sdk.b.d.f(String.valueOf((Math.random() * 10000.0d) + System.currentTimeMillis()));
            this.f9525w = f10;
            this.f9522t.putExtra("share_back_flag", f10);
            this.f9522t.putExtra("share_flag_for_new_version", 1);
            Bundle extras = this.f9522t.getExtras();
            Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
            a.C0120a c10 = com.sina.weibo.sdk.b.a.c(this);
            if (c10 != null) {
                intent.setPackage(c10.packageName);
            }
            intent.putExtras(weiboMultiMessage.writeToBundle(extras));
            intent.putExtra("_weibo_sdkVersion", "0041005000");
            intent.putExtra("_weibo_appPackage", getPackageName());
            intent.putExtra("_weibo_appKey", com.sina.weibo.sdk.a.a().getAppKey());
            intent.putExtra("_weibo_flag", 538116905);
            intent.putExtra("_weibo_sign", com.sina.weibo.sdk.b.d.f(com.sina.weibo.sdk.b.e.b(this, getPackageName())));
            String stringExtra = this.f9522t.getStringExtra("start_web_activity");
            if (!TextUtils.isEmpty(stringExtra) && "com.sina.weibo.sdk.web.WebActivity".equals(stringExtra)) {
                intent.setClassName(this, stringExtra);
                startActivityForResult(intent, 10001);
            } else if (!com.sina.weibo.sdk.a.a(this)) {
                c("Start weibo client's composer fail. And Weibo client is not installed.");
            } else {
                if (c10 != null) {
                    intent.setPackage(c10.packageName);
                }
                startActivityForResult(intent, 10001);
            }
        } catch (Throwable th2) {
            com.sina.weibo.sdk.b.c.b("WBShareTag", "start wb composer fail," + th2.getMessage());
            c("Start weibo client's composer fail. " + th2.getMessage());
        }
    }

    private boolean a(Intent intent) {
        if (TextUtils.isEmpty(this.f9525w) || intent == null || !intent.getExtras().containsKey("share_back_flag")) {
            return false;
        }
        return TextUtils.equals(this.f9525w, intent.getStringExtra("share_back_flag"));
    }

    public void b(Intent intent) {
        FrameLayout frameLayout = this.f9523u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.f9526x;
        if (handler != null) {
            handler.removeMessages(0);
            this.f9526x = null;
        }
        if (!a(intent)) {
            j();
            return;
        }
        c(intent);
        setResult(-1, intent);
        finish();
    }

    private static void c(Intent intent) {
        if (intent == null || intent.getFlags() == 0) {
            return;
        }
        int flags = intent.getFlags();
        String binaryString = Integer.toBinaryString(flags);
        ArrayList arrayList = new ArrayList();
        arrayList.add(64);
        arrayList.add(128);
        arrayList.add(1);
        arrayList.add(2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            flags &= ~((Integer) it.next()).intValue();
        }
        com.sina.weibo.sdk.b.c.a("WBShareTag", "clear flags: " + binaryString + "->" + Integer.toBinaryString(flags));
        intent.setFlags(flags);
    }

    public void c(String str) {
        FrameLayout frameLayout = this.f9523u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.f9526x;
        if (handler != null) {
            handler.removeMessages(0);
            this.f9526x = null;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("_weibo_resp_errcode", 2);
        bundle.putString("_weibo_resp_errstr", str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    public void j() {
        FrameLayout frameLayout = this.f9523u;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Handler handler = this.f9526x;
        if (handler != null) {
            handler.removeMessages(0);
            this.f9526x = null;
        }
        try {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("_weibo_resp_errcode", 1);
            intent.putExtras(bundle);
            setResult(-1, intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "onActivityResult. Means share result coming!");
        Handler handler = this.f9526x;
        if (handler != null) {
            if (i11 != -1) {
                handler.sendEmptyMessageDelayed(0, 100L);
                return;
            }
            Message obtain = Message.obtain(handler, 1);
            obtain.obj = intent;
            this.f9526x.sendMessageDelayed(obtain, 100L);
        }
    }

    @Override // com.sina.weibo.sdk.share.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start share activity.");
        Intent intent = getIntent();
        this.f9522t = intent;
        if (intent == null) {
            finish();
        } else if (intent.getIntExtra("start_flag", -1) != 1001) {
            finish();
        } else {
            this.f9523u = new FrameLayout(this);
            int intExtra = getIntent().getIntExtra("progress_id", -1);
            View inflate = intExtra != -1 ? ((LayoutInflater) getSystemService("layout_inflater")).inflate(intExtra, (ViewGroup) null) : new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f9523u.addView(inflate, layoutParams);
            this.f9523u.setBackgroundColor(855638016);
            setContentView(this.f9523u);
            com.sina.weibo.sdk.b.c.a("WBShareTag", "prepare wb resource.");
            Bundle extras = this.f9522t.getExtras();
            if (extras == null) {
                finish();
                return;
            }
            WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
            weiboMultiMessage.readFromBundle(extras);
            if (weiboMultiMessage.multiImageObject == null && weiboMultiMessage.videoSourceObject == null) {
                a(weiboMultiMessage);
                return;
            }
            d dVar = this.f9524v;
            if (dVar != null) {
                dVar.cancel(true);
            }
            d dVar2 = new d(this, new b() { // from class: com.sina.weibo.sdk.share.ShareTransActivity.2
                @Override // com.sina.weibo.sdk.share.b
                public final void a(c cVar) {
                    ShareTransActivity.this.f9523u.setVisibility(4);
                    if (cVar == null) {
                        ShareTransActivity.this.c("Trans result is null.");
                    } else if (cVar.f9529z) {
                        ShareTransActivity.this.a(cVar.A);
                    } else if (TextUtils.isEmpty(cVar.errorMessage)) {
                        ShareTransActivity.this.c("Trans resource fail.");
                    } else {
                        ShareTransActivity.this.c(cVar.errorMessage);
                    }
                }
            });
            this.f9524v = dVar2;
            dVar2.execute(weiboMultiMessage);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.sina.weibo.sdk.b.c.a("WBShareTag", "start share activity again. Means share result coming!");
        int intExtra = intent.getIntExtra("start_flag", -1);
        if (intExtra == 1001) {
            return;
        }
        if (intExtra == 1002) {
            b(intent);
        } else {
            j();
        }
    }
}
