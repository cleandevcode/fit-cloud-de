package com.topstep.fitcloud.pro.ui.camera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.r;
import com.topstep.fitcloudpro.R;
import fm.p;
import java.util.ArrayList;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import si.c;
import si.f;
import tl.l;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class PermissionFragment extends r {

    /* renamed from: l0 */
    public static final /* synthetic */ int f10429l0 = 0;

    @e(c = "com.topstep.fitcloud.pro.ui.camera.PermissionFragment$onCreate$1", f = "PermissionFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, d<? super l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(2, dVar);
            PermissionFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            ArrayList f10;
            ArrayList f11;
            a0.k(obj);
            f fVar = f.f27071a;
            PermissionFragment permissionFragment = PermissionFragment.this;
            jc.f fVar2 = new jc.f(2, permissionFragment);
            gm.l.f(permissionFragment, "fragment");
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 23) {
                fVar2.b(true);
            } else {
                Context V0 = permissionFragment.V0();
                if (i10 < 29) {
                    f10 = h7.a.f("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    f10 = h7.a.f("android.permission.CAMERA");
                }
                if (i10 < 29) {
                    String string = V0.getString(R.string.permission_camera_for_take_photo);
                    gm.l.e(string, "context.getString(R.stri…on_camera_for_take_photo)");
                    String string2 = V0.getString(R.string.permission_storage_for_take_photo);
                    gm.l.e(string2, "context.getString(R.stri…n_storage_for_take_photo)");
                    f11 = h7.a.f(new c("android.permission-group.CAMERA", string, null), new c("android.permission-group.STORAGE", string2, null));
                } else {
                    String string3 = V0.getString(R.string.permission_camera_for_take_photo);
                    gm.l.e(string3, "context.getString(R.stri…on_camera_for_take_photo)");
                    f11 = h7.a.f(new c("android.permission-group.CAMERA", string3, null));
                }
                f.h(fVar, permissionFragment, f10, f11, fVar2);
            }
            return l.f28297a;
        }
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        rm.l.g(this).b(new a(null));
    }
}
