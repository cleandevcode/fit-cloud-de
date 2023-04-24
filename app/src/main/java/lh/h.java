package lh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.q;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import lh.f;
import p000do.a;
import s.i0;
import s.m1;
import s.n2;
import s.q0;
import s.r0;

@Metadata
/* loaded from: classes2.dex */
public abstract class h extends i implements f.a {

    /* renamed from: o0 */
    public Uri f20011o0;

    /* renamed from: p0 */
    public Uri f20012p0;

    /* renamed from: q0 */
    public boolean f20013q0;

    /* renamed from: r0 */
    public int f20014r0;

    /* renamed from: s0 */
    public final q f20015s0;

    /* renamed from: t0 */
    public final q f20016t0;

    /* renamed from: u0 */
    public final q f20017u0;

    public h() {
        this.f20013q0 = true;
        this.f20014r0 = 1;
        this.f20015s0 = R0(new i0(5, this), new e.d());
        this.f20016t0 = R0(new jc.f(1, this), new e.d());
        this.f20017u0 = R0(new q0(9, this), new e.d());
    }

    public h(int i10) {
        super(i10);
        this.f20013q0 = true;
        this.f20014r0 = 1;
        this.f20015s0 = R0(new m1(6, this), new e.d());
        this.f20016t0 = R0(new s.i(6, this), new e.d());
        this.f20017u0 = R0(new n2(5, this), new e.d());
    }

    public static void g1(h hVar, androidx.activity.result.a aVar) {
        l.f(hVar, "this$0");
        Uri uri = hVar.f20011o0;
        a.b bVar = p000do.a.f13275a;
        bVar.t("GetPhotoFragment");
        bVar.h("take photo result:%d , uri:%s", Integer.valueOf(aVar.f751a), uri);
        if (aVar.f751a == -1) {
            if (uri != null) {
                hVar.q1(uri);
            } else {
                d7.e.e(hVar.f1(), hVar.o0(R.string.photo_take_failed));
            }
        }
    }

    public static void h1(h hVar, boolean z10) {
        l.f(hVar, "this$0");
        if (z10) {
            File n12 = hVar.n1();
            if (n12 != null) {
                Intent a10 = e7.a.a(hVar.V0(), n12);
                hVar.f20011o0 = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) a10.getParcelableExtra("output", Uri.class) : a10.getParcelableExtra("output"));
                hVar.f20015s0.a(a10);
                return;
            }
            a.b bVar = p000do.a.f13275a;
            bVar.t("GetPhotoFragment");
            bVar.p("getTakePhotoFile null", new Object[0]);
            d7.e.d(hVar.f1(), R.string.photo_take_failed, null, 0, 30);
        }
    }

    public static void i1(h hVar, androidx.activity.result.a aVar) {
        Uri uri;
        l.f(hVar, "this$0");
        Intent intent = aVar.f752b;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("GetPhotoFragment");
        bVar.h("crop photo result:%d , uri:%s", Integer.valueOf(aVar.f751a), uri);
        if (aVar.f751a == -1) {
            if (uri == null) {
                uri = hVar.f20012p0;
            }
            hVar.o1(uri);
        }
    }

    public static void j1(h hVar, androidx.activity.result.a aVar) {
        Uri uri;
        l.f(hVar, "this$0");
        Intent intent = aVar.f752b;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        a.b bVar = p000do.a.f13275a;
        bVar.t("GetPhotoFragment");
        bVar.h("choose photo result:%d , uri:%s", Integer.valueOf(aVar.f751a), uri);
        if (aVar.f751a == -1) {
            if (uri != null) {
                rm.l.g(hVar).e(new g(hVar, uri, null));
            } else {
                d7.e.e(hVar.f1(), hVar.o0(R.string.photo_select_failed));
            }
        }
    }

    @Override // androidx.fragment.app.r
    public void B0(Bundle bundle) {
        super.B0(bundle);
        if (bundle != null) {
            int i10 = Build.VERSION.SDK_INT;
            this.f20011o0 = (Uri) (i10 >= 33 ? (Parcelable) bundle.getParcelable("photo_uri", Uri.class) : bundle.getParcelable("photo_uri"));
            this.f20012p0 = (Uri) (i10 >= 33 ? (Parcelable) bundle.getParcelable("crop_uri", Uri.class) : bundle.getParcelable("crop_uri"));
            this.f20013q0 = bundle.getBoolean("action_take", true);
            this.f20014r0 = bundle.getInt("crop_mode", 1);
        }
    }

    @Override // lh.f.a
    public final void I(int i10) {
        this.f20013q0 = false;
        this.f20014r0 = i10;
        q qVar = this.f20016t0;
        Intent addCategory = new Intent("android.intent.action.OPEN_DOCUMENT").setType("image/*").addCategory("android.intent.category.OPENABLE");
        l.e(addCategory, "Intent(Intent.ACTION_OPE…Intent.CATEGORY_OPENABLE)");
        qVar.b(addCategory);
    }

    @Override // androidx.fragment.app.r
    public final void L0(Bundle bundle) {
        bundle.putParcelable("photo_uri", this.f20011o0);
        bundle.putParcelable("crop_uri", this.f20012p0);
        bundle.putBoolean("action_take", this.f20013q0);
        bundle.putInt("crop_mode", this.f20014r0);
    }

    public abstract File k1();

    @Override // lh.f.a
    public final void l(int i10) {
        this.f20013q0 = true;
        this.f20014r0 = i10;
        si.f fVar = si.f.f27071a;
        r0 r0Var = new r0(10, this);
        if (Build.VERSION.SDK_INT < 23) {
            r0Var.b(true);
            return;
        }
        Context V0 = V0();
        ArrayList f10 = h7.a.f("android.permission.CAMERA");
        String string = V0.getString(R.string.permission_camera_for_take_photo);
        l.e(string, "context.getString(R.stri…on_camera_for_take_photo)");
        si.f.h(fVar, this, f10, h7.a.f(new si.c("android.permission-group.CAMERA", string, null)), r0Var);
    }

    public abstract d l1();

    public final void m1(int i10) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putInt("crop_mode", i10);
        fVar.Z0(bundle);
        fVar.h1(h0(), null);
    }

    public abstract File n1();

    public final void o1(Uri uri) {
        d7.e f12;
        int i10;
        if (uri == null) {
            uri = this.f20014r0 == 1 ? this.f20011o0 : null;
            if (uri == null) {
                a.b bVar = p000do.a.f13275a;
                bVar.t("GetPhotoFragment");
                bVar.p("crop failed", new Object[0]);
                if (this.f20013q0) {
                    f12 = f1();
                    i10 = R.string.photo_take_failed;
                } else {
                    f12 = f1();
                    i10 = R.string.photo_select_failed;
                }
                d7.e.e(f12, o0(i10));
                return;
            }
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("GetPhotoFragment");
            bVar2.p("crop failed and use rawUri instead", new Object[0]);
        }
        p1(uri);
    }

    public abstract void p1(Uri uri);

    public final void q1(Uri uri) {
        if (this.f20014r0 == 0) {
            p1(uri);
            return;
        }
        this.f20011o0 = uri;
        try {
            File k12 = k1();
            if (k12 == null) {
                throw new NullPointerException();
            }
            d l12 = l1();
            if (l12 == null) {
                throw new NullPointerException();
            }
            Intent b10 = e7.a.b(V0(), uri, k12, l12.a(), l12.b(), l12.c(), l12.d());
            this.f20012p0 = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) b10.getParcelableExtra("output", Uri.class) : b10.getParcelableExtra("output"));
            a.b bVar = p000do.a.f13275a;
            bVar.t("GetPhotoFragment");
            bVar.h("create crop uri:%s", this.f20012p0);
            this.f20017u0.a(b10);
        } catch (Exception e10) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("GetPhotoFragment");
            bVar2.q(e10);
            o1(null);
        }
    }
}
