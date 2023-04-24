package s;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import androidx.activity.ComponentActivity;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.gms.common.api.Status;
import com.topstep.fitcloud.pro.model.location.LocationInfo;
import com.topstep.fitcloud.pro.shared.data.bean.data.EcgRecordBean;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import p000do.a;
import q2.a;

/* loaded from: classes.dex */
public final class h1 implements zm.j {

    /* renamed from: b */
    public static y8.m f25977b;

    /* renamed from: c */
    public static Context f25978c;

    public static final Object c(androidx.fragment.app.r rVar) {
        gm.l.f(rVar, "<this>");
        Bundle bundle = rVar.f2516f;
        if (bundle != null) {
            return bundle.get("mavericks:arg");
        }
        return null;
    }

    public static int d(int i10) {
        switch (i10) {
            case 10128:
                return 0;
            case 10129:
                return 1;
            case 10130:
                return 2;
            case 10131:
                return 3;
            case 10132:
                return 4;
            case 10133:
                return 5;
            case 10134:
                return 6;
            case 10135:
                return 7;
            case 10136:
                return 8;
            default:
                return 254;
        }
    }

    public static void e(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void f(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(int i10, String str, int i11, int i12) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static void h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x008d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int j(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = 0
            r4 = -1
            if (r0 != r4) goto L15
            goto L38
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r0 < r5) goto L20
            java.lang.String r9 = x0.k.d(r9)
            goto L21
        L20:
            r9 = 0
        L21:
            if (r9 != 0) goto L25
            goto L8e
        L25:
            if (r2 != 0) goto L3a
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L38
            int r6 = r2.length
            if (r6 > 0) goto L35
            goto L38
        L35:
            r2 = r2[r3]
            goto L3a
        L38:
            r3 = -1
            goto L8e
        L3a:
            int r4 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            r7 = 1
            if (r4 != r1) goto L4d
            boolean r4 = j1.b.a(r6, r2)
            if (r4 == 0) goto L4d
            r4 = 1
            goto L4e
        L4d:
            r4 = 0
        L4e:
            if (r4 == 0) goto L7b
            r4 = 29
            if (r0 < r4) goto L6c
            android.app.AppOpsManager r0 = x0.l.c(r8)
            int r4 = android.os.Binder.getCallingUid()
            int r2 = x0.l.a(r0, r9, r4, r2)
            if (r2 == 0) goto L63
            goto L8a
        L63:
            java.lang.String r8 = x0.l.b(r8)
            int r2 = x0.l.a(r0, r9, r1, r8)
            goto L8a
        L6c:
            if (r0 < r5) goto L89
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r8 = x0.k.a(r8, r0)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = x0.k.c(r8, r9, r2)
            goto L89
        L7b:
            if (r0 < r5) goto L89
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r8 = x0.k.a(r8, r0)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = x0.k.c(r8, r9, r2)
        L89:
            r2 = r7
        L8a:
            if (r2 != 0) goto L8d
            goto L8e
        L8d:
            r3 = -2
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h1.j(android.content.Context, java.lang.String):int");
    }

    public static void k(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static y.r l(t.f fVar) {
        int i10 = fVar.f27411a;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 != 4) {
        }
        return new y.r(fVar);
    }

    public static d9.a m(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                y8.m mVar = f25977b;
                i8.p.g(mVar, "IBitmapDescriptorFactory is not initialized");
                return new d9.a(mVar.i(bitmap));
            } catch (RemoteException e10) {
                throw new d9.k(e10);
            }
        }
        throw new NullPointerException("image must not be null");
    }

    public static g8.b n(Status status) {
        boolean z10;
        if (status.f6059d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new g8.g(status);
        }
        return new g8.b(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [VM extends y3.k0<S>, y3.k0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y3.f1] */
    public static y3.k0 o(final Class cls, final Class cls2, y3.o oVar, String str, boolean z10, y3.c0 c0Var, int i10) {
        String str2;
        boolean z11;
        y3.y0 y0Var;
        y3.b1 b1Var;
        y3.o oVar2;
        ?? r22;
        Class cls3;
        y3.f1 oVar3;
        if ((i10 & 8) != 0) {
            str2 = cls.getName();
        } else {
            str2 = str;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i10 & 32) != 0) {
            y0Var = new y3.y0();
        } else {
            y0Var = c0Var;
        }
        gm.l.f(y0Var, "initialStateFactory");
        q2.a aVar = oVar.f30999e;
        if (aVar.f24508d) {
            Bundle a10 = aVar.a(str2);
            Class cls4 = null;
            if (a10 != null) {
                Object obj = a10.get("mvrx:saved_args");
                Bundle bundle = a10.getBundle("mvrx:saved_instance_state");
                Serializable serializable = a10.getSerializable("mvrx:saved_viewmodel_class");
                if (serializable instanceof Class) {
                    cls3 = (Class) serializable;
                } else {
                    cls3 = null;
                }
                Serializable serializable2 = a10.getSerializable("mvrx:saved_state_class");
                if (serializable2 instanceof Class) {
                    cls4 = (Class) serializable2;
                }
                if (bundle != null) {
                    if (cls3 != null) {
                        if (cls4 != null) {
                            if (oVar instanceof y3.a) {
                                y3.a aVar2 = (y3.a) oVar;
                                ComponentActivity componentActivity = aVar2.f30921a;
                                androidx.lifecycle.y0 y0Var2 = aVar2.f30923c;
                                q2.a aVar3 = aVar2.f30924d;
                                gm.l.f(componentActivity, InnerShareParams.ACTIVITY);
                                gm.l.f(y0Var2, "owner");
                                gm.l.f(aVar3, "savedStateRegistry");
                                oVar3 = new y3.a(componentActivity, obj, y0Var2, aVar3);
                            } else {
                                ComponentActivity componentActivity2 = oVar.f30995a;
                                androidx.fragment.app.r rVar = oVar.f30997c;
                                androidx.lifecycle.y0 y0Var3 = oVar.f30998d;
                                q2.a aVar4 = oVar.f30999e;
                                gm.l.f(componentActivity2, InnerShareParams.ACTIVITY);
                                gm.l.f(rVar, "fragment");
                                gm.l.f(y0Var3, "owner");
                                gm.l.f(aVar4, "savedStateRegistry");
                                oVar3 = new y3.o(componentActivity2, obj, rVar, y0Var3, aVar4);
                            }
                            b1Var = new y3.b1(oVar3, cls3, cls4, new y3.u0(bundle));
                        } else {
                            throw new IllegalArgumentException("State class was not properly saved prior to restoring!".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("ViewModel class was not properly saved prior to restoring!".toString());
                    }
                } else {
                    throw new IllegalArgumentException("State was not saved prior to restoring!".toString());
                }
            } else {
                b1Var = null;
            }
            if (b1Var != null && (r22 = b1Var.f30930a) != 0) {
                oVar2 = r22;
            } else {
                oVar2 = oVar;
            }
            androidx.lifecycle.s0 b10 = new androidx.lifecycle.v0(oVar.f30998d, new y3.r(cls, cls2, oVar2, str2, b1Var, z11, y0Var)).b(str2, y3.v0.class);
            gm.l.d(b10, "null cannot be cast to non-null type com.airbnb.mvrx.MavericksViewModelWrapper<VM of com.airbnb.mvrx.MavericksViewModelProvider.get, S of com.airbnb.mvrx.MavericksViewModelProvider.get>");
            final y3.v0 v0Var = (y3.v0) b10;
            try {
                final y3.o oVar4 = oVar2;
                final y3.b1 b1Var2 = b1Var;
                oVar.f30999e.c(str2, new a.b() { // from class: y3.s0
                    @Override // q2.a.b
                    public final Bundle a() {
                        Class cls5;
                        Class cls6;
                        v0 v0Var2 = v0.this;
                        f1 f1Var = oVar4;
                        b1 b1Var3 = b1Var2;
                        Class cls7 = cls;
                        Class cls8 = cls2;
                        gm.l.f(v0Var2, "$viewModel");
                        gm.l.f(f1Var, "$restoredContext");
                        gm.l.f(cls7, "$viewModelClass");
                        gm.l.f(cls8, "$stateClass");
                        VM vm2 = v0Var2.f31085d;
                        Object b11 = f1Var.b();
                        if (b1Var3 != null && (cls6 = b1Var3.f30931b) != null) {
                            cls7 = cls6;
                        }
                        if (b1Var3 != null && (cls5 = b1Var3.f30932c) != null) {
                            cls8 = cls5;
                        }
                        return (Bundle) gm.j.p(vm2, new t0(cls7, cls8, b11));
                    }
                });
            } catch (IllegalArgumentException unused) {
            }
            return v0Var.f31085d;
        }
        throw new IllegalStateException("You can only access a view model after super.onCreate of your activity/fragment has been called.".toString());
    }

    public static final int p(Context context, int i10) {
        if (context.getResources().getConfiguration().orientation == 1) {
            return i10;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels / (displayMetrics.heightPixels / i10);
    }

    public static final LocationInfo q(Geocoder geocoder, String str, Location location) {
        String str2;
        gm.l.f(geocoder, "<this>");
        gm.l.f(location, "location");
        LocationInfo locationInfo = null;
        try {
            List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            Address address = fromLocation != null ? (Address) ul.q.I(fromLocation) : null;
            if (address != null) {
                try {
                    str2 = address.getAddressLine(0);
                } catch (Exception e10) {
                    a.b bVar = p000do.a.f13275a;
                    bVar.t(str);
                    bVar.q(e10);
                    str2 = null;
                }
                locationInfo = new LocationInfo(location.getLatitude(), location.getLongitude(), System.currentTimeMillis(), address.getCountryName(), address.getAdminArea(), address.getSubAdminArea(), address.getLocality(), address.getSubLocality(), str2);
            }
        } catch (Exception e11) {
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t(str);
            bVar2.q(e11);
        }
        return locationInfo == null ? new LocationInfo(location.getLatitude(), location.getLongitude(), System.currentTimeMillis(), null, null, null, null, null, null, 504, null) : locationInfo;
    }

    public static final EcgRecordBean r(rg.d dVar) {
        gm.l.f(dVar, "<this>");
        return new EcgRecordBean(dVar.f25611b, dVar.f25612c, dVar.f25613d, dVar.f25614e, dVar.f25615f, dVar.f25616g, dVar.f25617h, dVar.f25618i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final eh.l s(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            gm.l.f(r3, r0)
            int r0 = r3.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L31
            int r0 = r3.length()
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L1f
            r0 = 0
            goto L2d
        L1f:
            java.lang.String r0 = "^1[3-9][0-9]\\d{8}$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
        L2d:
            if (r0 == 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L40
            eh.l r0 = new eh.l
            java.lang.String r2 = "+86 "
            java.lang.String r3 = a.b.b(r2, r3)
            r0.<init>(r3, r1)
            goto L61
        L40:
            int r0 = r3.length()
            if (r0 != 0) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 == 0) goto L4c
            r0 = 0
            goto L5a
        L4c:
            java.lang.String r0 = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
        L5a:
            if (r0 == 0) goto L62
            eh.l r0 = new eh.l
            r0.<init>(r3, r2)
        L61:
            return r0
        L62:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h1.s(java.lang.String):eh.l");
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @Override // zm.j
    public List a(zm.q qVar) {
        gm.l.f(qVar, InnerShareParams.URL);
        return ul.s.f28879a;
    }

    @Override // zm.j
    public void b(zm.q qVar, List list) {
        gm.l.f(qVar, InnerShareParams.URL);
    }
}
