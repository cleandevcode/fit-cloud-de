package uh;

import android.bluetooth.BluetoothDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.ItemOtherDeviceDataBinding;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class y extends RecyclerView.e<RecyclerView.b0> {

    /* renamed from: e */
    public List<z> f28812e;

    /* renamed from: g */
    public List<z> f28814g;

    /* renamed from: h */
    public c f28815h;

    /* renamed from: d */
    public e f28811d = new e();

    /* renamed from: f */
    public e f28813f = new e();

    /* loaded from: classes2.dex */
    public static final class a {
        public static ArrayList a(Collection collection) {
            if (collection == null || collection.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
                String address = bluetoothDevice.getAddress();
                gm.l.e(address, "device.address");
                arrayList.add(new z(address, bluetoothDevice.getName(), 0));
            }
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemOtherDeviceDataBinding f28816u;

        public b(ItemOtherDeviceDataBinding itemOtherDeviceDataBinding) {
            super(itemOtherDeviceDataBinding.getRoot());
            this.f28816u = itemOtherDeviceDataBinding;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(z zVar);
    }

    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.b0 {
        public d(View view) {
            super(view);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        public int f28817a = 0;

        /* renamed from: b */
        public int f28818b = 2;
    }

    /* loaded from: classes2.dex */
    public static final class f extends RecyclerView.b0 {
        public f(View view) {
            super(view);
        }

        public final void s(int i10) {
            View view = this.f2927a;
            gm.l.d(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f28811d.f28818b + this.f28813f.f28818b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0019 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001b A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r3) {
        /*
            r2 = this;
            uh.y$e r0 = r2.f28811d
            int r1 = r0.f28818b
            if (r3 >= r1) goto Le
            if (r3 != 0) goto L9
            goto L11
        L9:
            int r3 = r0.f28817a
            if (r3 != 0) goto L1b
            goto L19
        Le:
            int r3 = r3 - r1
            if (r3 != 0) goto L13
        L11:
            r3 = 0
            goto L1c
        L13:
            uh.y$e r3 = r2.f28813f
            int r3 = r3.f28817a
            if (r3 != 0) goto L1b
        L19:
            r3 = 1
            goto L1c
        L1b:
            r3 = 2
        L1c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.y.g(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(androidx.recyclerview.widget.RecyclerView.b0 r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uh.y.f
            if (r0 == 0) goto L13
            uh.y$f r5 = (uh.y.f) r5
            if (r6 != 0) goto Lc
            r6 = 2131951872(0x7f130100, float:1.954017E38)
            goto Lf
        Lc:
            r6 = 2131951877(0x7f130105, float:1.954018E38)
        Lf:
            r5.s(r6)
            goto L6a
        L13:
            boolean r0 = r5 instanceof uh.y.b
            if (r0 == 0) goto L6a
            uh.y$e r0 = r4.f28811d
            int r0 = r0.f28818b
            r1 = 0
            r2 = 1
            if (r6 >= r0) goto L29
            java.util.List<uh.z> r0 = r4.f28812e
            if (r0 == 0) goto L36
            int r6 = r6 - r2
            java.lang.Object r6 = r0.get(r6)
            goto L33
        L29:
            java.util.List<uh.z> r3 = r4.f28814g
            if (r3 == 0) goto L36
            int r6 = r6 - r0
            int r6 = r6 - r2
            java.lang.Object r6 = r3.get(r6)
        L33:
            r1 = r6
            uh.z r1 = (uh.z) r1
        L36:
            gm.l.c(r1)
            uh.y$b r5 = (uh.y.b) r5
            com.topstep.fitcloud.pro.databinding.ItemOtherDeviceDataBinding r6 = r5.f28816u
            android.widget.TextView r6 = r6.tvName
            java.lang.String r0 = r1.f28820b
            if (r0 == 0) goto L4b
            int r0 = r0.length()
            if (r0 != 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 == 0) goto L50
            java.lang.String r0 = "Unknown"
            goto L52
        L50:
            java.lang.String r0 = r1.f28820b
        L52:
            r6.setText(r0)
            com.topstep.fitcloud.pro.databinding.ItemOtherDeviceDataBinding r6 = r5.f28816u
            android.widget.TextView r6 = r6.tvAddress
            java.lang.String r0 = r1.f28819a
            r6.setText(r0)
            com.topstep.fitcloud.pro.databinding.ItemOtherDeviceDataBinding r5 = r5.f28816u
            android.widget.Button r5 = r5.btnAction
            uh.x r6 = new uh.x
            r6.<init>()
            r5.setOnClickListener(r6)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.y.n(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        if (i10 == 0) {
            View inflate = from.inflate(R.layout.item_other_device_title, (ViewGroup) recyclerView, false);
            gm.l.e(inflate, "layoutInflater.inflate(R…ice_title, parent, false)");
            return new f(inflate);
        } else if (i10 == 1) {
            View inflate2 = from.inflate(R.layout.item_other_device_none, (ViewGroup) recyclerView, false);
            gm.l.e(inflate2, "layoutInflater.inflate(R…vice_none, parent, false)");
            return new d(inflate2);
        } else if (i10 == 2) {
            ItemOtherDeviceDataBinding inflate3 = ItemOtherDeviceDataBinding.inflate(from, recyclerView, false);
            gm.l.e(inflate3, "inflate(layoutInflater, parent, false)");
            return new b(inflate3);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
