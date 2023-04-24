package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.huawei.hms.feature.dynamic.b;
import f8.a;
import h8.d;
import i8.p;
import v8.j;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public static final /* synthetic */ int f6047b = 0;

    /* renamed from: a */
    public int f6048a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f6048a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d g10 = d.g(this);
                if (i11 != -1) {
                    if (i11 == 0) {
                        g10.h(new a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    j jVar = g10.f15938n;
                    jVar.sendMessage(jVar.obtainMessage(3));
                }
            }
        } else if (i10 == 2) {
            this.f6048a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f6048a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f6048a = bundle.getInt(b.f7007h);
        }
        if (this.f6048a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f6048a = 1;
                        return;
                    } catch (ActivityNotFoundException e10) {
                        if (extras.getBoolean("notify_manager", true)) {
                            d.g(this).h(new a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String a10 = android.support.v4.media.a.a("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                a10 = a10.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", a10, e10);
                        }
                        this.f6048a = 1;
                    } catch (IntentSender.SendIntentException e11) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    }
                } else {
                    p.f(num);
                    f8.d.f14180d.d(this, num.intValue(), this);
                    this.f6048a = 1;
                    return;
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(b.f7007h, this.f6048a);
        super.onSaveInstanceState(bundle);
    }
}
