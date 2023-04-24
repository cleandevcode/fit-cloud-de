package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.LifecycleDelegate;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.scankit.p.C0703pb;

/* loaded from: classes.dex */
public class RemoteView extends FrameLayout {
    public static final int REQUEST_CODE_PHOTO = 4371;
    private static final String TAG = "ScanKitRemoteView";
    private boolean flagForGallery;
    private Context mContext;
    private boolean mContinuouslyScan;
    private a mRemoteHelper;
    private boolean mReturnedBitmap;

    /* loaded from: classes.dex */
    public static class Builder {
        public Activity mContext;
        public HmsScanAnalyzerOptions mFormat;
        public Rect mRect;
        public boolean mIsCustomed = true;
        public boolean mContinuouslyScan = true;
        public boolean mReturnedBitmap = false;

        public RemoteView build() {
            Activity activity = this.mContext;
            boolean z10 = this.mIsCustomed;
            HmsScanAnalyzerOptions hmsScanAnalyzerOptions = this.mFormat;
            return new RemoteView(activity, z10, hmsScanAnalyzerOptions == null ? 0 : hmsScanAnalyzerOptions.mode, this.mRect).setContinuouslyScan(this.mContinuouslyScan).enableReturnBitmap(this.mReturnedBitmap);
        }

        public Builder enableReturnBitmap() {
            this.mReturnedBitmap = true;
            return this;
        }

        public Builder setBoundingBox(Rect rect) {
            this.mRect = rect;
            return this;
        }

        public Builder setContext(Activity activity) {
            this.mContext = activity;
            return this;
        }

        public Builder setContinuouslyScan(boolean z10) {
            this.mContinuouslyScan = z10;
            return this;
        }

        public Builder setFormat(int i10, int... iArr) {
            this.mFormat = new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(i10, iArr).create();
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class a extends DeferredLifecycleHelper<b> {

        /* renamed from: f */
        private ViewGroup f7062f;

        /* renamed from: g */
        private Activity f7063g;

        /* renamed from: h */
        private OnDelegateCreatedListener<b> f7064h;

        /* renamed from: i */
        private IRemoteViewDelegate f7065i;

        /* renamed from: j */
        private IOnResultCallback f7066j = null;

        /* renamed from: k */
        private boolean f7067k;

        /* renamed from: l */
        private boolean f7068l;

        /* renamed from: m */
        private int f7069m;

        /* renamed from: n */
        private IOnLightCallback f7070n;

        /* renamed from: o */
        private Rect f7071o;

        /* renamed from: p */
        private Bundle f7072p;

        /* renamed from: q */
        private boolean f7073q;

        /* renamed from: r */
        private boolean f7074r;

        public a(Activity activity, ViewGroup viewGroup, boolean z10, int i10, Rect rect) {
            RemoteView.this = r1;
            this.f7062f = viewGroup;
            this.f7063g = activity;
            this.f7067k = z10;
            this.f7069m = i10;
            this.f7071o = rect;
        }

        public void a(int i10, int i11, Intent intent) {
            String str;
            if (i11 == -1 && intent != null && i10 == 4371) {
                try {
                    HmsScan[] decodeWithBitmap = ScanUtil.decodeWithBitmap(RemoteView.this.mContext, com.huawei.hms.scankit.util.b.a(RemoteView.this.mContext, intent), new HmsScanAnalyzerOptions.Creator().setPhotoMode(true).create());
                    IOnResultCallback iOnResultCallback = this.f7066j;
                    if (iOnResultCallback != null) {
                        iOnResultCallback.onResult(decodeWithBitmap);
                    }
                } catch (RemoteException unused) {
                    str = "RemoteException in remoteview";
                    com.huawei.hms.scankit.util.a.b(RemoteView.TAG, str);
                } catch (Error unused2) {
                    str = "Exception in error";
                    com.huawei.hms.scankit.util.a.b(RemoteView.TAG, str);
                } catch (IllegalStateException unused3) {
                    str = "IllegalStateException in remoteview";
                    com.huawei.hms.scankit.util.a.b(RemoteView.TAG, str);
                } catch (Exception unused4) {
                    str = "Exception in remoteview";
                    com.huawei.hms.scankit.util.a.b(RemoteView.TAG, str);
                }
            }
        }

        public void a(Bundle bundle) {
            this.f7072p = bundle;
        }

        public void a(IOnErrorCallback iOnErrorCallback) {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnErrorCallback(iOnErrorCallback);
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
        }

        public void a(IOnLightCallback iOnLightCallback) {
            this.f7070n = iOnLightCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnLightVisbleCallBack(iOnLightCallback);
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
        }

        public void a(IOnResultCallback iOnResultCallback) {
            this.f7066j = iOnResultCallback;
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
        }

        public boolean b() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    return iRemoteViewDelegate.getLightStatus();
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                    return false;
                }
            }
            return false;
        }

        public void c() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.pauseContinuouslyScan();
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
        }

        public void c(boolean z10) {
            this.f7068l = z10;
        }

        public void d() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.resumeContinuouslyScan();
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                }
            }
        }

        public boolean e() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.turnOffLight();
                    return true;
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                    return false;
                }
            }
            return false;
        }

        public boolean f() {
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate != null) {
                try {
                    iRemoteViewDelegate.turnOnLight();
                    return true;
                } catch (RemoteException unused) {
                    com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
                    return false;
                }
            }
            return false;
        }

        public void a(boolean z10) {
            this.f7073q = z10;
        }

        public void b(boolean z10) {
            this.f7074r = z10;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<b> onDelegateCreatedListener) {
            Bundle bundle;
            IRemoteCreator c10;
            this.f7064h = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            this.f7065i = null;
            try {
                bundle = new Bundle();
                boolean z10 = this.f7067k;
                if (!z10 && this.f7069m == 0 && this.f7071o == null) {
                    com.huawei.hms.scankit.util.a.c(RemoteView.TAG, "!mCustomed && mFormatValue == 0 && mRect == null");
                } else {
                    bundle.putBoolean(DetailRect.CUSTOMED_FLAG, z10);
                    bundle.putInt(DetailRect.FORMAT_FLAG, this.f7069m);
                    Rect rect = this.f7071o;
                    if (rect != null) {
                        bundle.putParcelable(DetailRect.RECT_FLAG, rect);
                    }
                }
                boolean z11 = this.f7073q;
                if (z11) {
                    bundle.putBoolean(DetailRect.SCAN_OFFSCEEN_FLAG, z11);
                }
                boolean z12 = this.f7068l;
                if (z12) {
                    bundle.putBoolean(DetailRect.DEEPLINK_JUMP_FLAG, z12);
                    bundle.putAll(this.f7072p);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putBoolean(DetailRect.RETURN_BITMAP, this.f7074r);
                bundle.putAll(C0703pb.a(this.f7063g));
                bundle.putBoolean(DetailRect.SCAN_NEW_UI, true);
                c10 = j.c(this.f7063g);
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
            if (c10 == null) {
                return;
            }
            this.f7065i = c10.newRemoteViewDelegate(ObjectWrapper.wrap(this.f7063g), ObjectWrapper.wrap(bundle));
            IRemoteViewDelegate iRemoteViewDelegate = this.f7065i;
            if (iRemoteViewDelegate == null) {
                return;
            }
            try {
                IOnResultCallback iOnResultCallback = this.f7066j;
                if (iOnResultCallback != null) {
                    iRemoteViewDelegate.setOnResultCallback(iOnResultCallback);
                    this.f7065i.setOnClickListener(ObjectWrapper.wrap(new h(this)));
                }
                this.f7065i.setOnClickListener(ObjectWrapper.wrap(new i(this)));
                IOnLightCallback iOnLightCallback = this.f7070n;
                if (iOnLightCallback != null) {
                    this.f7065i.setOnLightVisbleCallBack(iOnLightCallback);
                }
            } catch (RemoteException unused2) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
            this.f7064h.onDelegateCreated(new b(this.f7062f, this.f7065i));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements LifecycleDelegate {

        /* renamed from: a */
        private ViewGroup f7076a;

        /* renamed from: b */
        private View f7077b;

        /* renamed from: c */
        private IRemoteViewDelegate f7078c;

        public b(ViewGroup viewGroup, IRemoteViewDelegate iRemoteViewDelegate) {
            this.f7076a = viewGroup;
            this.f7078c = iRemoteViewDelegate;
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
            try {
                this.f7078c.onCreate(bundle);
                this.f7077b = (View) ObjectWrapper.unwrap(this.f7078c.getView());
                this.f7076a.removeAllViews();
                this.f7076a.addView(this.f7077b);
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return new View(null);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.f7078c.onDestroy();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.f7078c.onPause();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                this.f7078c.onResume();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                this.f7078c.onStart();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.f7078c.onStop();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }
    }

    public RemoteView(Activity activity, boolean z10, int i10, Rect rect) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.flagForGallery = false;
        this.mContext = activity;
        this.mRemoteHelper = new a(activity, this, z10, i10, rect);
    }

    public RemoteView(Activity activity, boolean z10, int i10, Rect rect, boolean z11) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.flagForGallery = false;
        this.mContext = activity;
        a aVar = new a(activity, this, z10, i10, rect);
        this.mRemoteHelper = aVar;
        aVar.a(z11);
    }

    public RemoteView(Activity activity, boolean z10, Bundle bundle) {
        super(activity);
        this.mContinuouslyScan = true;
        this.mReturnedBitmap = false;
        this.flagForGallery = false;
        this.mContext = activity;
        a aVar = new a(activity, this, false, 0, null);
        this.mRemoteHelper = aVar;
        aVar.c(z10);
        this.mRemoteHelper.a(bundle);
    }

    public void startPhotoCode(Activity activity) {
        if (!com.huawei.hms.scankit.util.b.b((Context) activity) && activity.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, REQUEST_CODE_PHOTO);
                return;
            }
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (com.huawei.hms.scankit.util.b.e(activity)) {
                if (com.huawei.hms.scankit.util.b.a(new Intent(), "com.android.gallery3d", activity) != null) {
                    com.huawei.hms.scankit.util.a.c(TAG, "Start Gallery:com.android.gallery3d");
                    intent.setPackage("com.android.gallery3d");
                } else if (com.huawei.hms.scankit.util.b.a(new Intent(), "com.huawei.photos", activity) != null) {
                    intent.setPackage("com.huawei.photos");
                    com.huawei.hms.scankit.util.a.c(TAG, "Start Gallery:com.huawei.photos");
                }
            }
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
            this.flagForGallery = true;
            activity.startActivityForResult(intent, REQUEST_CODE_PHOTO);
        } catch (Exception unused) {
            com.huawei.hms.scankit.util.a.b(TAG, "startPhotoCode Exception");
        }
    }

    public RemoteView enableReturnBitmap(boolean z10) {
        this.mReturnedBitmap = z10;
        this.mRemoteHelper.b(z10);
        return this;
    }

    public boolean getLightStatus() {
        return this.mRemoteHelper.b();
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        Log.i(TAG, "onActivityResult: ");
        this.mRemoteHelper.a(i10, i11, intent);
    }

    public void onCreate(Bundle bundle) {
        Log.i(TAG, "onCreate:");
        Context context = this.mContext;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.mContext).getWindow().setFlags(16777216, 16777216);
        }
        this.mRemoteHelper.onCreate(bundle);
    }

    public final void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        this.mRemoteHelper.onDestroy();
    }

    public final void onPause() {
        Log.i(TAG, "onPause: ");
        this.mRemoteHelper.onPause();
        if (this.flagForGallery) {
            this.mRemoteHelper.onStop();
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr, Activity activity) {
        if (i10 == 4371 && iArr.length == 1 && iArr[0] == 0) {
            startPhotoCode(activity);
        }
    }

    public final void onResume() {
        Log.i(TAG, "onResume: ");
        this.mRemoteHelper.onResume();
        this.flagForGallery = false;
    }

    public final void onStart() {
        Log.i(TAG, "onStart: ");
        this.mRemoteHelper.onStart();
        this.flagForGallery = false;
    }

    public final void onStop() {
        Log.i(TAG, "onStop: ");
        if (this.flagForGallery) {
            return;
        }
        this.mRemoteHelper.onStop();
    }

    public void pauseContinuouslyScan() {
        this.mRemoteHelper.c();
    }

    public void resumeContinuouslyScan() {
        this.mRemoteHelper.d();
    }

    public void selectPictureFromLocalFile() {
        startPhotoCode((Activity) this.mContext);
    }

    public void selectPictureFromLocalFileFragment(Fragment fragment) {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        fragment.startActivityForResult(intent, REQUEST_CODE_PHOTO);
    }

    public RemoteView setContinuouslyScan(boolean z10) {
        this.mContinuouslyScan = z10;
        return this;
    }

    public void setOnErrorCallback(OnErrorCallback onErrorCallback) {
        this.mRemoteHelper.a(new c(onErrorCallback));
    }

    public void setOnLightVisibleCallback(OnLightVisibleCallBack onLightVisibleCallBack) {
        this.mRemoteHelper.a(new d(onLightVisibleCallBack));
    }

    public void setOnResultCallback(OnResultCallback onResultCallback) {
        this.mRemoteHelper.a(new e(onResultCallback, this.mContinuouslyScan));
    }

    public boolean switchLight() {
        return !getLightStatus() ? this.mRemoteHelper.f() : this.mRemoteHelper.e();
    }
}
