package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: b */
    public static final String f5813b = l.k(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: c */
    public static final String f5814c = l.k(".action_destroy", "CustomTabActivity");

    /* renamed from: a */
    public a f5815a;

    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
            CustomTabActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l.f(context, "context");
            l.f(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f5813b);
            intent2.putExtra(CustomTabMainActivity.f5820f, getIntent().getDataString());
            g2.a.a(this).c(intent2);
            a aVar = new a();
            g2.a.a(this).b(aVar, new IntentFilter(f5814c));
            this.f5815a = aVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f5813b);
        intent.putExtra(CustomTabMainActivity.f5820f, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        a aVar = this.f5815a;
        if (aVar != null) {
            g2.a.a(this).d(aVar);
        }
        super.onDestroy();
    }
}
