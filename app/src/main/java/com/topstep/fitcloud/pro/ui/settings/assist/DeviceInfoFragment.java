package com.topstep.fitcloud.pro.ui.settings.assist;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.FragmentDeviceInfoBinding;
import com.topstep.fitcloud.pro.databinding.ItemDeviceFeatureGroupBinding;
import com.topstep.fitcloud.pro.databinding.ItemDeviceFeatureItemBinding;
import com.topstep.fitcloudpro.R;
import d7.e;
import gm.b0;
import gm.m;
import java.util.ArrayList;
import java.util.List;
import ji.i;
import ji.l;
import kotlin.Metadata;
import mm.h;
import no.nordicsemi.android.dfu.DfuBaseService;
import og.t;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceInfoFragment extends l {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11976v0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11977t0;

    /* renamed from: u0 */
    public t f11978u0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final String f11979a;

        /* renamed from: b */
        public final ArrayList<c> f11980b = new ArrayList<>();

        public a(String str) {
            this.f11979a = str;
        }

        public final void a(String str, String str2) {
            this.f11980b.add(new c(str, str2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends i7.a<RecyclerView.b0> {

        /* renamed from: i */
        public final List<a> f11981i;

        /* loaded from: classes2.dex */
        public static final class a extends RecyclerView.b0 {

            /* renamed from: u */
            public final ItemDeviceFeatureGroupBinding f11982u;

            public a(ItemDeviceFeatureGroupBinding itemDeviceFeatureGroupBinding) {
                super(itemDeviceFeatureGroupBinding.getRoot());
                this.f11982u = itemDeviceFeatureGroupBinding;
            }
        }

        /* renamed from: com.topstep.fitcloud.pro.ui.settings.assist.DeviceInfoFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0204b extends RecyclerView.b0 {

            /* renamed from: u */
            public final ItemDeviceFeatureItemBinding f11983u;

            public C0204b(ItemDeviceFeatureItemBinding itemDeviceFeatureItemBinding) {
                super(itemDeviceFeatureItemBinding.getRoot());
                this.f11983u = itemDeviceFeatureItemBinding;
            }
        }

        public b(ArrayList arrayList) {
            this.f11981i = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
            gm.l.f(recyclerView, "parent");
            if (i10 == -1) {
                ItemDeviceFeatureGroupBinding inflate = ItemDeviceFeatureGroupBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
                gm.l.e(inflate, "inflate(LayoutInflater.f….context), parent, false)");
                return new a(inflate);
            }
            ItemDeviceFeatureItemBinding inflate2 = ItemDeviceFeatureItemBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate2, "inflate(LayoutInflater.f….context), parent, false)");
            return new C0204b(inflate2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final String f11984a;

        /* renamed from: b */
        public final String f11985b;

        public c(String str, String str2) {
            this.f11984a = str;
            this.f11985b = str2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<Button, tl.l> {

        /* renamed from: c */
        public final /* synthetic */ nj.c f11987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(nj.c cVar) {
            super(1);
            DeviceInfoFragment.this = r1;
            this.f11987c = cVar;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            Object systemService = DeviceInfoFragment.this.V0().getSystemService("clipboard");
            gm.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("info", this.f11987c.toString()));
            e.h(DeviceInfoFragment.this.f1(), R.string.assist_action_copy_success, false, 0, 30);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(DeviceInfoFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDeviceInfoBinding;", 0);
        b0.f15488a.getClass();
        f11976v0 = new h[]{tVar};
    }

    public DeviceInfoFragment() {
        super(R.layout.fragment_device_info);
        this.f11977t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDeviceInfoBinding.class, this);
    }

    public static String i1(boolean z10) {
        return z10 ? "Y" : "N";
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        t tVar = this.f11978u0;
        if (tVar != null) {
            nj.c c10 = tVar.D().c();
            ArrayList arrayList = new ArrayList();
            a aVar = new a("Raw Info");
            aVar.a("project:", c10.f());
            aVar.a("patch:", c10.b(14, 6));
            aVar.a("flash:", c10.b(20, 4));
            aVar.a("app:", c10.b(24, 4));
            arrayList.add(aVar);
            a aVar2 = new a("Module Support");
            aVar2.a("Heart Rate:", i1(c10.g(0)));
            aVar2.a("Measure Data Syncable:", i.a(aVar2, "Blood Pressure Air Pump:", i.a(aVar2, "Sport Connectivity:", i.a(aVar2, "Sport Push:", i.a(aVar2, "Dial Custom:", i.a(aVar2, "Screen vibrate:", i.a(aVar2, "Dfu Firmware Silent:", i.a(aVar2, "Is 6621:", i.a(aVar2, "Game:", i.a(aVar2, "Pressure:", i.a(aVar2, "Speech Recognition:", i.a(aVar2, "Women Health:", i.a(aVar2, "Temperature:", i.a(aVar2, "Dynamic Heart Rate:", i.a(aVar2, "Is 8762C:", i.a(aVar2, "WeChat Sport:", i.a(aVar2, "Sport:", i.a(aVar2, "ECG:", i.a(aVar2, "Weather:", i.a(aVar2, "Respiratory Rate:", i.a(aVar2, "Blood Pressure:", i.a(aVar2, "Oxygen:", i1(c10.g(1)), c10, 2), c10, 3), c10, 4), c10, 5), c10, 6), c10, 7), c10, 8), c10, 9), c10, 10), c10, 11), c10, 12), c10, 13), c10, 14), c10, 15), c10, 16), c10, 17), c10, 18), c10, 19), c10, 20), c10, 21), c10, 22));
            arrayList.add(aVar2);
            a aVar3 = new a("Page Support");
            aVar3.a("Time:", i1(c10.h(0)));
            aVar3.a("Step:", i1(c10.h(1)));
            aVar3.a("Distance:", i1(c10.h(2)));
            aVar3.a("Calories:", i1(c10.h(3)));
            aVar3.a("Sleep:", i1(c10.h(4)));
            aVar3.a("Heart Rate:", i1(c10.h(5)));
            aVar3.a("Oxygen:", i1(c10.h(6)));
            aVar3.a("Blood Pressure:", i1(c10.h(7)));
            aVar3.a("Weather:", i1(c10.h(8)));
            aVar3.a("Find Phone:", i1(c10.h(9)));
            aVar3.a("ID:", i1(c10.h(10)));
            aVar3.a("StopWatch:", i1(c10.h(13)));
            arrayList.add(aVar3);
            a aVar4 = new a("Extension Support");
            aVar4.a("Setting Page Config:", i1(c10.g(DfuBaseService.ERROR_REMOTE_TYPE_LEGACY)));
            aVar4.a("Power Save Period:", i.a(aVar4, "Power Save Mode:", i.a(aVar4, "Get Support QR Code:", i.a(aVar4, "Custom Label:", i.a(aVar4, "Ali Agent:", i.a(aVar4, "Song Push:", i.a(aVar4, "More QrCode1:", i.a(aVar4, "Habit:", i.a(aVar4, "Nucleic Acid Code:", i.a(aVar4, "Setting Dial Component:", i.a(aVar4, "Single Game Record:", i.a(aVar4, "Business Card:", i.a(aVar4, "Collection Code:", i.a(aVar4, "LCD Shape:", i.a(aVar4, "QR Code Connect:", i.a(aVar4, "Telephony Missed:", i.a(aVar4, "Game Push:", i.a(aVar4, "GUI:", i.a(aVar4, "Dial Component:", i.a(aVar4, "Dial Multiple:", i.a(aVar4, "ANCS Hike&Youtube:", i.a(aVar4, "Schedule:", i.a(aVar4, "Custom Find Phone Audio:", i.a(aVar4, "Screen Lock:", i.a(aVar4, "Weather Switch:", i.a(aVar4, "Setting Device Name:", i.a(aVar4, "Hand Washing Reminder:", i.a(aVar4, "Weather Forecast:", i.a(aVar4, "Sedentary Interval:", i.a(aVar4, "Health Monitor Interval:", i.a(aVar4, "Protection Reminder:", i.a(aVar4, "TI ECG:", i.a(aVar4, "Contacts:", i.a(aVar4, "Mock ECG:", i.a(aVar4, "Change Config Itself:", i.a(aVar4, "New Sleep Protocol:", i.a(aVar4, "New Notification Protocol:", i.a(aVar4, "TP Upgrade:", i.a(aVar4, "Latest Health:", i.a(aVar4, "DND:", i.a(aVar4, "Dial Push:", i.a(aVar4, "ANCS Extra:", i.a(aVar4, "BloodPressure Alarm:", i.a(aVar4, "HeartRate Alarm:", i.a(aVar4, "Step Extra:", i.a(aVar4, "ANCS Viber&Telegram:", i.a(aVar4, "ANCS Email:", i1(c10.g(257)), c10, 258), c10, 259), c10, 260), c10, 261), c10, 262), c10, 263), c10, 264), c10, 265), c10, 266), c10, 267), c10, 268), c10, 269), c10, 270), c10, 271), c10, 272), c10, 273), c10, 274), c10, 275), c10, 276), c10, 277), c10, 278), c10, 279), c10, 280), c10, 281), c10, 282), c10, DfuBaseService.NOTIFICATION_ID), c10, 284), c10, 285), c10, 286), c10, 287), c10, 288), c10, 289), c10, 290), c10, 291), c10, 292), c10, 293), c10, 294), c10, 295), c10, 296), c10, 297), c10, 298), c10, 299), c10, 300), c10, 301), c10, 302), c10, 303));
            arrayList.add(aVar4);
            h1().tvInfo.setText(c10.toString());
            p.b.g(h1().btnCopy, new d(c10));
            RecyclerView recyclerView = h1().recyclerView;
            V0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            h1().recyclerView.setAdapter(new b(arrayList));
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final FragmentDeviceInfoBinding h1() {
        return (FragmentDeviceInfoBinding) this.f11977t0.a(this, f11976v0[0]);
    }
}
