package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Process;
import android.view.TextureView;

/* renamed from: com.huawei.hms.scankit.c */
/* loaded from: classes.dex */
public class TextureView$SurfaceTextureListenerC0635c implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ C0637e f7333a;

    public TextureView$SurfaceTextureListenerC0635c(C0637e c0637e) {
        this.f7333a = c0637e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        boolean z10;
        Context context;
        Context context2;
        Context context3;
        TextureView textureView;
        this.f7333a.E = false;
        if (surfaceTexture == null) {
            com.huawei.hms.scankit.util.a.b(C0637e.f7371a, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        z10 = this.f7333a.f7387q;
        if (z10) {
            return;
        }
        this.f7333a.f7387q = true;
        context = this.f7333a.f7377g;
        if (context.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0) {
            C0637e c0637e = this.f7333a;
            textureView = c0637e.f7382l;
            c0637e.a(textureView);
            return;
        }
        context2 = this.f7333a.f7377g;
        if (!(context2 instanceof Activity) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        this.f7333a.E = true;
        context3 = this.f7333a.f7377g;
        ((Activity) context3).requestPermissions(new String[]{"android.permission.CAMERA"}, 1);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f7333a.f7387q = false;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
