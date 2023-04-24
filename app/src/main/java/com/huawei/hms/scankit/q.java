package com.huawei.hms.scankit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.C0675ib;

/* loaded from: classes.dex */
public class q extends IRemoteViewDelegate.Stub implements A, SensorEventListener {

    /* renamed from: a */
    private static final String f8142a = "q";

    /* renamed from: b */
    public static boolean f8143b = false;

    /* renamed from: d */
    public int f8145d;

    /* renamed from: e */
    public Context f8146e;

    /* renamed from: f */
    public ProviderRemoteView f8147f;

    /* renamed from: g */
    public TextureView f8148g;

    /* renamed from: h */
    public C0637e f8149h;

    /* renamed from: i */
    public IOnResultCallback f8150i;

    /* renamed from: j */
    public SensorManager f8151j;

    /* renamed from: k */
    public View.OnClickListener f8152k;

    /* renamed from: n */
    public Boolean f8155n;

    /* renamed from: o */
    public AlertDialog f8156o;

    /* renamed from: p */
    public Rect f8157p;

    /* renamed from: q */
    private IObjectWrapper f8158q;

    /* renamed from: r */
    public boolean f8159r;

    /* renamed from: s */
    private OrientationEventListener f8160s;

    /* renamed from: t */
    private boolean f8161t;

    /* renamed from: u */
    public boolean f8162u;

    /* renamed from: w */
    public IOnLightCallback f8164w;

    /* renamed from: x */
    public LinearLayout f8165x;

    /* renamed from: c */
    private volatile C0675ib f8144c = null;

    /* renamed from: l */
    public boolean f8153l = false;

    /* renamed from: m */
    public final Float f8154m = Float.valueOf(40.0f);

    /* renamed from: v */
    public boolean f8163v = true;

    /* renamed from: y */
    public boolean f8166y = false;

    public q(Context context, int i10, Object obj, IObjectWrapper iObjectWrapper, boolean z10, boolean z11, boolean z12) {
        this.f8145d = 0;
        this.f8159r = false;
        this.f8146e = context;
        this.f8145d = i10;
        this.f8158q = iObjectWrapper;
        if (obj instanceof Rect) {
            this.f8157p = (Rect) obj;
        } else {
            this.f8157p = null;
        }
        this.f8159r = z10;
        this.f8161t = z11;
        this.f8162u = z12;
    }

    private static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (com.huawei.hms.scankit.util.b.d(context)) {
            Log.i(f8142a, "initSurfaceView: is in MultiWindowMode");
            defaultDisplay.getSize(point);
        } else {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    public void a(int i10) {
        FrameLayout.LayoutParams layoutParams;
        C0637e c0637e = this.f8149h;
        if (c0637e == null || c0637e.a() == null || i10 == this.f8149h.a().d()) {
            return;
        }
        this.f8149h.a().a(i10);
        if (!com.huawei.hms.scankit.util.b.d(this.f8146e) || com.huawei.hms.scankit.util.b.b((Activity) this.f8146e)) {
            e();
            return;
        }
        if (com.huawei.hms.scankit.util.b.c((Activity) this.f8146e)) {
            layoutParams = (FrameLayout.LayoutParams) this.f8148g.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = (int) ((a(this.f8146e).x / 1080.0f) * 1920.0f);
        } else {
            layoutParams = (FrameLayout.LayoutParams) this.f8148g.getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = (int) ((a(this.f8146e).x / 1080.0f) * 1920.0f);
        }
        layoutParams.gravity = 17;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        int i10;
        HmsScan hmsScan;
        if (iObjectWrapper == null) {
            com.huawei.hms.scankit.util.a.b("ScankitRemoteS", "bitmap is null");
            return new HmsScan[0];
        }
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            i10 = 0;
        } else {
            i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            int i11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i11;
            z10 = i11 >= 2;
            if (z10) {
                i10 = com.huawei.hms.scankit.util.b.b(i10);
            }
        }
        HmsScan[] b10 = D.a().b((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), i10, true, this.f8144c);
        if (!z10) {
            b10 = com.huawei.hms.scankit.util.b.a(b10);
        }
        if (b10.length == 0 || ((hmsScan = b10[0]) != null && TextUtils.isEmpty(hmsScan.originalValue))) {
            i();
        }
        return b10;
    }

    public void a(Point point) {
        int i10;
        int i11;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8148g.getLayoutParams();
        float f10 = point.x;
        float f11 = point.y;
        if (com.huawei.hms.scankit.util.b.c((Activity) this.f8146e)) {
            f8143b = false;
            int i12 = 1080;
            int i13 = 1920;
            if ("ceres-c3".equals(Build.DEVICE)) {
                i12 = 1280;
                i13 = 1280;
            }
            float f12 = i12;
            float f13 = f10 / f12;
            float f14 = i13;
            float f15 = f11 / f14;
            if (f13 > f15) {
                i11 = (int) (f14 * f13);
                layoutParams.width = -1;
                layoutParams.height = i11;
            } else {
                i10 = (int) (f12 * f15);
                layoutParams.height = -1;
                layoutParams.width = i10;
            }
        } else {
            f8143b = true;
            float f16 = f10 / 1920.0f;
            float f17 = f11 / 1080.0f;
            if (f16 > f17) {
                i11 = (int) (f16 * 1080.0f);
                layoutParams.width = -1;
                layoutParams.height = i11;
            } else {
                i10 = (int) (f17 * 1920.0f);
                layoutParams.height = -1;
                layoutParams.width = i10;
            }
        }
        layoutParams.gravity = 17;
    }

    @Override // com.huawei.hms.scankit.A
    public boolean a() {
        return this.f8166y;
    }

    @Override // com.huawei.hms.scankit.A
    public boolean a(HmsScan[] hmsScanArr) {
        AlertDialog alertDialog;
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (alertDialog = this.f8156o) == null || !alertDialog.isShowing()) {
            return false;
        }
        this.f8156o.dismiss();
        return false;
    }

    public boolean b() {
        String str;
        String str2;
        try {
            return this.f8149h.a().h().equals("torch");
        } catch (RuntimeException unused) {
            str = f8142a;
            str2 = "getFlashStatusRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            return false;
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "getFlashStatusException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            return false;
        }
    }

    public void c() {
        Object systemService = this.f8146e.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.f8151j = sensorManager;
            for (Sensor sensor : sensorManager.getSensorList(-1)) {
                if (5 == sensor.getType()) {
                    this.f8153l = true;
                    return;
                }
            }
        }
    }

    public ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f8146e : DynamicModuleInitializer.getContext(), true);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        String str;
        String str2;
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        if (this.f8144c == null) {
            try {
                this.f8144c = new C0675ib(bundle, DetailRect.PHOTO_MODE);
            } catch (RuntimeException unused) {
                str = f8142a;
                str2 = "RuntimeException";
                com.huawei.hms.scankit.util.a.b(str, str2);
                return a(iObjectWrapper, iObjectWrapper2);
            } catch (Exception unused2) {
                str = f8142a;
                str2 = "Exception";
                com.huawei.hms.scankit.util.a.b(str, str2);
                return a(iObjectWrapper, iObjectWrapper2);
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    public void e() {
        String str;
        String str2;
        try {
            if (this.f8146e.getSystemService("window") != null) {
                a(a(this.f8146e));
            }
        } catch (NullPointerException unused) {
            str = f8142a;
            str2 = "initSurfaceView: nullpoint";
            com.huawei.hms.scankit.util.a.d(str, str2);
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "initSurfaceView: Exception";
            com.huawei.hms.scankit.util.a.d(str, str2);
        }
    }

    public void f() {
        ProviderRemoteView d10 = d();
        this.f8147f = d10;
        TextureView textureView = (TextureView) d10.findViewById(R.id.surfaceView);
        this.f8148g = textureView;
        C0637e c0637e = new C0637e(this.f8146e, textureView, null, this.f8157p, this.f8145d, this.f8158q, this.f8159r, "CustomizedView", true);
        this.f8149h = c0637e;
        c0637e.b(this.f8162u);
        c();
        e();
    }

    public void g() {
        String str;
        String str2;
        try {
            C0637e c0637e = this.f8149h;
            if (c0637e == null || c0637e.a() == null) {
                return;
            }
            this.f8149h.a().a("off");
        } catch (RuntimeException unused) {
            str = f8142a;
            str2 = "offFlashRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "offFlashException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public boolean getLightStatus() {
        return b();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.f8147f);
    }

    public void h() {
        String str;
        String str2;
        try {
            C0637e c0637e = this.f8149h;
            if (c0637e == null || c0637e.a() == null) {
                return;
            }
            this.f8149h.a().a("torch");
        } catch (RuntimeException unused) {
            str = f8142a;
            str2 = "openFlashRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "openFlashException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        }
    }

    public void i() {
        AlertDialog create = new AlertDialog.Builder(this.f8146e).create();
        this.f8156o = create;
        create.show();
        View inflate = LayoutInflater.from(DynamicModuleInitializer.getContext() == null ? this.f8146e : DynamicModuleInitializer.getContext()).inflate(R.layout.scankit_dialog_layout, (ViewGroup) null);
        Window window = this.f8156o.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 60;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setContentView(inflate);
        window.setGravity(80);
        inflate.findViewById(R.id.dialog_sure_btn).setOnClickListener(new p(this));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(Bundle bundle) {
        boolean isInMultiWindowMode;
        Context context = this.f8146e;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.f8146e).getWindow().setFlags(16777216, 16777216);
        }
        Context context2 = this.f8146e;
        if (context2 != null && context2.getPackageManager() != null) {
            this.f8163v = this.f8146e.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
        f();
        this.f8149h.a(this);
        this.f8147f.setOnTouchListener(new n(this));
        IOnResultCallback iOnResultCallback = this.f8150i;
        if (iOnResultCallback != null) {
            this.f8149h.a(iOnResultCallback);
        }
        this.f8149h.a(this.f8161t);
        this.f8149h.b();
        if (Build.VERSION.SDK_INT >= 24) {
            Context context3 = this.f8146e;
            if (context3 instanceof Activity) {
                isInMultiWindowMode = ((Activity) context3).isInMultiWindowMode();
                if (isInMultiWindowMode) {
                    o oVar = new o(this, this.f8146e);
                    this.f8160s = oVar;
                    if (oVar.canDetectOrientation()) {
                        this.f8160s.enable();
                    } else {
                        this.f8160s.disable();
                    }
                }
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onDestroy() {
        String str;
        String str2;
        try {
            this.f8149h.c();
            OrientationEventListener orientationEventListener = this.f8160s;
            if (orientationEventListener == null || !orientationEventListener.canDetectOrientation()) {
                return;
            }
            this.f8160s.disable();
        } catch (RuntimeException unused) {
            str = f8142a;
            str2 = "onDestroyRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "onDestroyException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onPause() {
        String str;
        String str2;
        try {
            this.f8149h.d();
            this.f8151j.unregisterListener(this);
        } catch (RuntimeException unused) {
            str = f8142a;
            str2 = "onPauseRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        } catch (Exception unused2) {
            str = f8142a;
            str2 = "onPauseException";
            com.huawei.hms.scankit.util.a.b(str, str2);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
        String str;
        String str2;
        try {
            this.f8149h.e();
            SensorManager sensorManager = this.f8151j;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
        } catch (RuntimeException e10) {
            e = e10;
            str = f8142a;
            str2 = "onResumeRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        } catch (Exception e11) {
            e = e11;
            str = f8142a;
            str2 = "onResumeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f8153l && sensorEvent.sensor.getType() == 5 && this.f8163v) {
            Boolean valueOf = Boolean.valueOf(sensorEvent.values[0] > this.f8154m.floatValue());
            this.f8155n = valueOf;
            try {
                if (!valueOf.booleanValue()) {
                    LinearLayout linearLayout = this.f8165x;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    IOnLightCallback iOnLightCallback = this.f8164w;
                    if (iOnLightCallback == null) {
                        return;
                    }
                    iOnLightCallback.onVisibleChanged(true);
                } else if (sensorEvent.values[0] <= 600.0f) {
                } else {
                    if (this.f8165x != null && !b()) {
                        this.f8165x.setVisibility(8);
                    }
                    IOnLightCallback iOnLightCallback2 = this.f8164w;
                    if (iOnLightCallback2 == null) {
                        return;
                    }
                    iOnLightCallback2.onVisibleChanged(false);
                }
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.d(f8142a, "onSensorChanged RemoteException");
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
        String str;
        String str2;
        try {
            this.f8149h.f();
        } catch (RuntimeException e10) {
            e = e10;
            str = f8142a;
            str2 = "onStartRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        } catch (Exception e11) {
            e = e11;
            str = f8142a;
            str2 = "onStartException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
        String str;
        String str2;
        try {
            this.f8149h.g();
        } catch (RuntimeException e10) {
            e = e10;
            str = f8142a;
            str2 = "onStopRuntimeException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        } catch (Exception e11) {
            e = e11;
            str = f8142a;
            str2 = "onStopException";
            com.huawei.hms.scankit.util.a.b(str, str2);
            e.printStackTrace();
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void pauseContinuouslyScan() {
        C0637e c0637e = this.f8149h;
        if (c0637e != null) {
            c0637e.h();
        }
        this.f8166y = true;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void resumeContinuouslyScan() {
        this.f8166y = false;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f8152k = (View.OnClickListener) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) {
        C0637e c0637e = this.f8149h;
        if (c0637e != null) {
            c0637e.a(iOnErrorCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) {
        this.f8164w = iOnLightCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnResultCallback(IOnResultCallback iOnResultCallback) {
        this.f8150i = iOnResultCallback;
        C0637e c0637e = this.f8149h;
        if (c0637e != null) {
            c0637e.a(iOnResultCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() {
        g();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() {
        h();
    }
}
