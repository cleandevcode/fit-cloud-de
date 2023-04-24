package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.OrientationEventListener;

/* loaded from: classes.dex */
public class ScanKitActivity extends Activity {
    private static final String TAG = "ScanKitActivity";
    private int lastRotation = Integer.MAX_VALUE;
    private OrientationEventListener mOrientationListener;
    private RemoteView remoteView;

    private void startOrientationChangeListener() {
        OrientationEventListener orientationEventListener = new OrientationEventListener(this) { // from class: com.huawei.hms.hmsscankit.ScanKitActivity.2
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i10) {
                try {
                    int rotation = ScanKitActivity.this.getWindowManager().getDefaultDisplay().getRotation();
                    if (Math.abs(ScanKitActivity.this.lastRotation - rotation) == 2) {
                        ScanKitActivity.this.recreate();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("onOrientationChanged: currentRotation");
                        sb2.append(rotation);
                        Log.i(ScanKitActivity.TAG, sb2.toString());
                    }
                    ScanKitActivity.this.lastRotation = rotation;
                } catch (RuntimeException unused) {
                    Log.e(ScanKitActivity.TAG, "onOrientationChanged: RuntimeException");
                }
            }
        };
        this.mOrientationListener = orientationEventListener;
        orientationEventListener.enable();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.remoteView.onActivityResult(i10, i11, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ScanKitActivity"
            super.onCreate(r6)
            r1 = 1
            r5.requestWindowFeature(r1)
            int r1 = com.huawei.hms.scankit.R.layout.scankit_layout
            r5.setContentView(r1)
            r1 = 0
            android.content.Intent r2 = r5.getIntent()     // Catch: java.lang.NullPointerException -> L20
            if (r2 == 0) goto L25
            android.content.Intent r2 = r5.getIntent()     // Catch: java.lang.NullPointerException -> L20
            java.lang.String r3 = "ScanFormatValue"
            int r2 = r2.getIntExtra(r3, r1)     // Catch: java.lang.NullPointerException -> L20
            goto L26
        L20:
            java.lang.String r2 = "getIntExtra can not get"
            com.huawei.hms.scankit.util.a.c(r0, r2)
        L25:
            r2 = 0
        L26:
            com.huawei.hms.hmsscankit.RemoteView r3 = new com.huawei.hms.hmsscankit.RemoteView
            r4 = 0
            r3.<init>(r5, r1, r2, r4)
            r5.remoteView = r3
            com.huawei.hms.hmsscankit.ScanKitActivity$1 r2 = new com.huawei.hms.hmsscankit.ScanKitActivity$1
            r2.<init>()
            r3.setOnResultCallback(r2)
            com.huawei.hms.hmsscankit.RemoteView r2 = r5.remoteView
            r2.onCreate(r6)
            int r6 = com.huawei.hms.scankit.R.id.ll_top
            android.view.View r6 = r5.findViewById(r6)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            com.huawei.hms.hmsscankit.RemoteView r2 = r5.remoteView
            r6.addView(r2)
            int r6 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r6 < r2) goto L52
            boolean r1 = com.huawei.hms.hmsscankit.l.a(r5)
        L52:
            android.view.Window r2 = r5.getWindow()
            if (r2 == 0) goto L64
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            r2.addFlags(r3)
            if (r1 == 0) goto L64
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r2.clearFlags(r1)
        L64:
            r1 = 28
            if (r6 < r1) goto L6b
            r5.startOrientationChangeListener()
        L6b:
            java.lang.String r6 = "ScankitActivity on create"
            android.util.Log.i(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hmsscankit.ScanKitActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.remoteView.onDestroy();
        Log.i(TAG, "ScankitActivity onDestroy");
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.remoteView.onPause();
        Log.i(TAG, "ScankitActivity onPause");
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.remoteView.onRequestPermissionsResult(i10, strArr, iArr, this);
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.remoteView.onResume();
        Log.i(TAG, "ScankitActivity onResume");
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.remoteView.onStart();
        Log.i(TAG, "ScankitActivity onStart");
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.remoteView.onStop();
        Log.i(TAG, "ScankitActivity onStop");
    }
}
