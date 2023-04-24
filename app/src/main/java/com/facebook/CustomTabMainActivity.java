package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import d6.e0;
import d6.m0;
import gm.l;
import kotlin.Metadata;
import n6.y;

@Metadata
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c */
    public static final String f5817c = l.k(".extra_action", "CustomTabMainActivity");

    /* renamed from: d */
    public static final String f5818d = l.k(".extra_params", "CustomTabMainActivity");

    /* renamed from: e */
    public static final String f5819e = l.k(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: f */
    public static final String f5820f = l.k(".extra_url", "CustomTabMainActivity");

    /* renamed from: g */
    public static final String f5821g = l.k(".extra_targetApp", "CustomTabMainActivity");

    /* renamed from: h */
    public static final String f5822h = l.k(".action_refresh", "CustomTabMainActivity");

    /* renamed from: i */
    public static final String f5823i = l.k(".no_activity_exception", "CustomTabMainActivity");

    /* renamed from: a */
    public boolean f5824a = true;

    /* renamed from: b */
    public b f5825b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5826a;

        static {
            int[] iArr = new int[y.valuesCustom().length];
            iArr[1] = 1;
            f5826a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
            CustomTabMainActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l.f(context, "context");
            l.f(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f5822h);
            String str = CustomTabMainActivity.f5820f;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    public final void a(Intent intent, int i10) {
        Bundle bundle;
        b bVar = this.f5825b;
        if (bVar != null) {
            g2.a.a(this).d(bVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f5820f);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                m0 m0Var = m0.f12709a;
                bundle = m0.G(parse.getQuery());
                bundle.putAll(m0.G(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            e0 e0Var = e0.f12668a;
            Intent intent2 = getIntent();
            l.e(intent2, "intent");
            Intent f10 = e0.f(intent2, bundle, null);
            if (f10 != null) {
                intent = f10;
            }
        } else {
            e0 e0Var2 = e0.f12668a;
            Intent intent3 = getIntent();
            l.e(intent3, "intent");
            intent = e0.f(intent3, null, null);
        }
        setResult(i10, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e5  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.f(intent, "intent");
        super.onNewIntent(intent);
        if (l.a(f5822h, intent.getAction())) {
            g2.a.a(this).c(new Intent(CustomTabActivity.f5814c));
        } else if (!l.a(CustomTabActivity.f5813b, intent.getAction())) {
            return;
        }
        a(intent, -1);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f5824a) {
            a(null, 0);
        }
        this.f5824a = true;
    }
}
