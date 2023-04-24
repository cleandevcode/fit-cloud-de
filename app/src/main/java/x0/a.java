package x0;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.activity.ComponentActivity;
import x0.b;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String[] f30084a;

    /* renamed from: b */
    public final /* synthetic */ Activity f30085b;

    /* renamed from: c */
    public final /* synthetic */ int f30086c;

    public a(ComponentActivity componentActivity, String[] strArr, int i10) {
        this.f30084a = strArr;
        this.f30085b = componentActivity;
        this.f30086c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[this.f30084a.length];
        PackageManager packageManager = this.f30085b.getPackageManager();
        String packageName = this.f30085b.getPackageName();
        int length = this.f30084a.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = packageManager.checkPermission(this.f30084a[i10], packageName);
        }
        ((b.c) this.f30085b).onRequestPermissionsResult(this.f30086c, this.f30084a, iArr);
    }
}
