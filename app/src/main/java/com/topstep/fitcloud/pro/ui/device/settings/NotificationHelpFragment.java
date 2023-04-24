package com.topstep.fitcloud.pro.ui.device.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.FragmentNotificationHelpBinding;
import com.topstep.fitcloudpro.R;
import fb.e;
import fm.l;
import gm.b0;
import gm.m;
import gm.t;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import mm.h;
import s.h1;

@Metadata
/* loaded from: classes2.dex */
public final class NotificationHelpFragment extends lh.c {

    /* renamed from: r0 */
    public static final /* synthetic */ h<Object>[] f11210r0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11211m0;

    /* renamed from: n0 */
    public final tl.d f11212n0;

    /* renamed from: o0 */
    public final tl.d f11213o0;

    /* renamed from: p0 */
    public final tl.d f11214p0;

    /* renamed from: q0 */
    public final a f11215q0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            NotificationHelpFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            boolean a10;
            Intent intent;
            View view2 = view;
            gm.l.f(view2, "view");
            NotificationHelpFragment notificationHelpFragment = NotificationHelpFragment.this;
            h<Object>[] hVarArr = NotificationHelpFragment.f11210r0;
            boolean z10 = true;
            if (gm.l.a(view2, notificationHelpFragment.f1().btnTelephony)) {
                a10 = true;
            } else {
                a10 = gm.l.a(view2, NotificationHelpFragment.this.f1().btnSms);
            }
            if (!a10) {
                z10 = gm.l.a(view2, NotificationHelpFragment.this.f1().btnContacts);
            }
            if (z10) {
                try {
                    NotificationHelpFragment notificationHelpFragment2 = NotificationHelpFragment.this;
                    Context V0 = notificationHelpFragment2.V0();
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri parse = Uri.parse("package:" + V0.getPackageName());
                    gm.l.e(parse, "parse(\"package:\" + context.packageName)");
                    intent2.setData(parse);
                    notificationHelpFragment2.b1(intent2);
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                }
            } else if (gm.l.a(view2, NotificationHelpFragment.this.f1().btnNotification)) {
                Context V02 = NotificationHelpFragment.this.V0();
                try {
                    if (Build.VERSION.SDK_INT < 22) {
                        intent = new Intent("android.settings.NOTIFICATION_LISTENER_SETTINGS");
                    } else {
                        intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                    }
                    V02.startActivity(intent);
                } catch (Exception e11) {
                    p000do.a.f13275a.q(e11);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<PackageManager> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            NotificationHelpFragment.this = r1;
        }

        @Override // fm.a
        public final PackageManager m() {
            return NotificationHelpFragment.this.V0().getPackageManager();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            NotificationHelpFragment.this = r1;
        }

        @Override // fm.a
        public final Integer m() {
            TypedArray obtainStyledAttributes = NotificationHelpFragment.this.V0().getTheme().obtainStyledAttributes(new int[]{R.attr.colorError});
            gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return Integer.valueOf(color);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            NotificationHelpFragment.this = r1;
        }

        @Override // fm.a
        public final Integer m() {
            return Integer.valueOf(g7.a.a(NotificationHelpFragment.this.V0(), 4.0f));
        }
    }

    static {
        t tVar = new t(NotificationHelpFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentNotificationHelpBinding;", 0);
        b0.f15488a.getClass();
        f11210r0 = new h[]{tVar};
    }

    public NotificationHelpFragment() {
        super(R.layout.fragment_notification_help);
        this.f11211m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentNotificationHelpBinding.class, this);
        this.f11212n0 = e.a(new b());
        this.f11213o0 = e.a(new d());
        this.f11214p0 = e.a(new c());
        this.f11215q0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("android.permission.READ_CALL_LOG");
            arrayList.add("android.permission.READ_PHONE_STATE");
            arrayList.add("android.permission.CALL_PHONE");
            if (i10 >= 26) {
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
            }
            try {
                f1().layoutTelephony.removeAllViews();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    LinearLayout linearLayout = f1().layoutTelephony;
                    gm.l.e(linearLayout, "viewBind.layoutTelephony");
                    gm.l.e(str, "p");
                    e1(linearLayout, str);
                }
            } catch (Exception e10) {
                p000do.a.f13275a.q(e10);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("android.permission.RECEIVE_SMS");
            arrayList2.add("android.permission.READ_SMS");
            arrayList2.add("android.permission.SEND_SMS");
            try {
                f1().layoutSms.removeAllViews();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    LinearLayout linearLayout2 = f1().layoutSms;
                    gm.l.e(linearLayout2, "viewBind.layoutSms");
                    gm.l.e(str2, "p");
                    e1(linearLayout2, str2);
                }
            } catch (Exception e11) {
                p000do.a.f13275a.q(e11);
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("android.permission.READ_CONTACTS");
            try {
                f1().layoutContacts.removeAllViews();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    LinearLayout linearLayout3 = f1().layoutContacts;
                    gm.l.e(linearLayout3, "viewBind.layoutContacts");
                    gm.l.e(str3, "p");
                    e1(linearLayout3, str3);
                }
            } catch (Exception e12) {
                p000do.a.f13275a.q(e12);
            }
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(f1().btnTelephony, this.f11215q0);
        p.b.g(f1().btnSms, this.f11215q0);
        p.b.g(f1().btnContacts, this.f11215q0);
        p.b.g(f1().btnNotification, this.f11215q0);
        f1().tvNotificationDes.setText(p0(R.string.ds_notification_help_des4, o0(R.string.app_name)));
    }

    public final void e1(LinearLayout linearLayout, String str) {
        PermissionInfo permissionInfo = ((PackageManager) this.f11212n0.getValue()).getPermissionInfo(str, 0);
        TextView textView = new TextView(V0());
        textView.setText(permissionInfo.loadLabel((PackageManager) this.f11212n0.getValue()));
        if (h1.j(V0(), str) != 0) {
            textView.setTextColor(((Number) this.f11214p0.getValue()).intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ((Number) this.f11213o0.getValue()).intValue();
        linearLayout.addView(textView, layoutParams);
    }

    public final FragmentNotificationHelpBinding f1() {
        return (FragmentNotificationHelpBinding) this.f11211m0.a(this, f11210r0[0]);
    }
}
