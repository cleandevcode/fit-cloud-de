package com.github.kilnn.wheellayout;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.kilnn.wheelview.WheelView;
import gm.l;
import gm.m;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import m7.c;
import m7.d;
import m7.e;
import m7.f;
import n7.b;
import tl.i;

@Metadata
/* loaded from: classes.dex */
public final class OneWheelLayout extends RelativeLayout implements b {

    /* renamed from: a */
    public final WheelView f5957a;

    /* renamed from: b */
    public final TextView f5958b;

    /* renamed from: c */
    public final TextView f5959c;

    /* renamed from: d */
    public final i f5960d;

    /* renamed from: e */
    public e f5961e;

    /* loaded from: classes.dex */
    public static final class a extends m implements fm.a<HashMap<d, c>> {

        /* renamed from: b */
        public static final a f5962b = new a();

        public a() {
            super(0);
        }

        @Override // fm.a
        public final HashMap<d, c> m() {
            return new HashMap<>(5);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneWheelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        l.f(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OneWheelLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r4 = 0
            java.lang.String r0 = "context"
            gm.l.f(r2, r0)
            r1.<init>(r2, r3, r4)
            com.github.kilnn.wheellayout.OneWheelLayout$a r3 = com.github.kilnn.wheellayout.OneWheelLayout.a.f5962b
            tl.i r4 = new tl.i
            r4.<init>(r3)
            r1.f5960d = r4
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            int r3 = com.github.kilnn.wheelview.R.layout.layout_default_one_wheel
            r2.inflate(r3, r1)
            int r2 = com.github.kilnn.wheelview.R.id.wheel_view
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.wheel_view)"
            gm.l.e(r2, r3)
            com.github.kilnn.wheelview.WheelView r2 = (com.github.kilnn.wheelview.WheelView) r2
            r1.f5957a = r2
            java.util.LinkedList r2 = r2.f5973k
            r2.add(r1)
            int r2 = com.github.kilnn.wheelview.R.id.tv_place_holder
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.tv_place_holder)"
            gm.l.e(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f5958b = r2
            int r2 = com.github.kilnn.wheelview.R.id.tv_des
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.tv_des)"
            gm.l.e(r2, r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f5959c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.wheellayout.OneWheelLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final HashMap<d, c> getAdapterCache() {
        return (HashMap) this.f5960d.getValue();
    }

    private final c getCurrentAdapter() {
        return (c) this.f5957a.getViewAdapter();
    }

    @Override // n7.b
    public final void a(WheelView wheelView) {
        LinkedList<DataSetObserver> linkedList;
        l.f(wheelView, "wheel");
        c currentAdapter = getCurrentAdapter();
        if (currentAdapter == null || (linkedList = currentAdapter.f20406a) == null) {
            return;
        }
        for (DataSetObserver dataSetObserver : linkedList) {
            dataSetObserver.onChanged();
        }
    }

    public final int b(d dVar) {
        int value = getValue();
        if (dVar == null) {
            dVar = this.f5961e;
        }
        if (dVar == null) {
            return value;
        }
        int i10 = dVar.f20410a;
        if (value < i10) {
            return i10;
        }
        int i11 = dVar.f20411b;
        if (value > i11) {
            return i11;
        }
        return value;
    }

    public final int getValue() {
        c currentAdapter = getCurrentAdapter();
        if (currentAdapter == null) {
            return 0;
        }
        return this.f5957a.getCurrentItem() + currentAdapter.f20407b;
    }

    public final WheelView getWheelView() {
        return this.f5957a;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAdapterKey(m7.d r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L4
            m7.e r5 = r4.f5961e
        L4:
            if (r5 != 0) goto L7
            return
        L7:
            java.util.HashMap r0 = r4.getAdapterCache()
            java.lang.Object r0 = r0.get(r5)
            m7.c r0 = (m7.c) r0
            if (r0 != 0) goto L2b
            m7.c r0 = new m7.c
            int r1 = r5.f20410a
            int r2 = r5.f20411b
            m7.e r3 = r4.f5961e
            if (r3 != 0) goto L1f
            r3 = 0
            goto L21
        L1f:
            m7.f r3 = r3.f20414e
        L21:
            r0.<init>(r1, r2, r3)
            java.util.HashMap r1 = r4.getAdapterCache()
            r1.put(r5, r0)
        L2b:
            com.github.kilnn.wheelview.WheelView r1 = r4.f5957a
            boolean r5 = r5.f20412c
            r1.setCyclic(r5)
            com.github.kilnn.wheelview.WheelView r5 = r4.f5957a
            o7.a r5 = r5.getViewAdapter()
            boolean r5 = gm.l.a(r0, r5)
            if (r5 != 0) goto L7f
            com.github.kilnn.wheelview.WheelView r5 = r4.f5957a
            r5.setViewAdapter(r0)
            m7.c r5 = r4.getCurrentAdapter()
            if (r5 != 0) goto L4a
            goto L7f
        L4a:
            com.github.kilnn.wheelview.WheelView r0 = r4.f5957a
            int r0 = r0.getCurrentItem()
            if (r0 >= 0) goto L56
            com.github.kilnn.wheelview.WheelView r0 = r4.f5957a
            r1 = 0
            goto L64
        L56:
            int r1 = r5.e()
            if (r0 < r1) goto L67
            com.github.kilnn.wheelview.WheelView r0 = r4.f5957a
            int r1 = r5.e()
            int r1 = r1 + (-1)
        L64:
            r0.setCurrentItem(r1)
        L67:
            java.util.LinkedList r5 = r5.f20406a
            if (r5 == 0) goto L7f
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            android.database.DataSetObserver r0 = (android.database.DataSetObserver) r0
            r0.onChanged()
            goto L6f
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.wheellayout.OneWheelLayout.setAdapterKey(m7.d):void");
    }

    public final void setConfig(e eVar) {
        l.f(eVar, "config");
        this.f5961e = eVar;
        setAdapterKey(eVar);
        if (!TextUtils.isEmpty(eVar.f20413d)) {
            this.f5958b.setVisibility(4);
            this.f5959c.setVisibility(0);
            TextView textView = this.f5958b;
            c currentAdapter = getCurrentAdapter();
            String str = null;
            if (currentAdapter != null) {
                int i10 = currentAdapter.f20408c;
                f fVar = currentAdapter.f20409d;
                if (fVar != null) {
                    str = fVar.a(0, i10);
                }
                if (str == null) {
                    str = String.valueOf(i10);
                }
            }
            textView.setText(str);
            this.f5959c.setText(eVar.f20413d);
        }
    }

    public final void setValue(int i10) {
        c currentAdapter = getCurrentAdapter();
        if (currentAdapter == null) {
            return;
        }
        int i11 = currentAdapter.f20407b;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = currentAdapter.f20408c;
            if (i10 > i12) {
                i10 = i12;
            }
        }
        this.f5957a.setCurrentItem(i10 - i11);
    }
}
