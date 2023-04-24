package com.topstep.fitcloud.pro.ui.device.alarm;

import bi.z0;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import nh.f;
import og.t;
import pm.e0;
import qi.s;
import th.d;
import th.q;
import th.u;
import tl.l;
import zl.c;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class AlarmViewModel extends f<q, d> {

    /* renamed from: h */
    public final t f10785h;

    /* renamed from: i */
    public final th.f f10786i;

    /* renamed from: j */
    public final a f10787j;

    /* loaded from: classes2.dex */
    public static final class a extends s<l> {

        @e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$setAlarmsAction$1", f = "AlarmViewModel.kt", l = {129}, m = "action")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel$a$a */
        /* loaded from: classes2.dex */
        public static final class C0155a extends c {

            /* renamed from: d */
            public /* synthetic */ Object f10789d;

            /* renamed from: f */
            public int f10791f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155a(xl.d<? super C0155a> dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f10789d = obj;
                this.f10791f |= Integer.MIN_VALUE;
                return a.this.a(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var) {
            super(e0Var);
            AlarmViewModel.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0034  */
        @Override // qi.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(xl.d<? super tl.l> r18) {
            /*
                Method dump skipped, instructions count: 297
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel.a.a(xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmViewModel(t tVar) {
        super(new q(0));
        gm.l.f(tVar, "deviceManager");
        this.f10785h = tVar;
        this.f10786i = new th.f();
        z0.g(rm.l.h(this), null, 0, new u(this, null), 3);
        this.f10787j = new a(rm.l.h(this));
    }

    public static final int h(AlarmViewModel alarmViewModel, rj.a aVar, ArrayList arrayList) {
        Integer num;
        alarmViewModel.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((Comparator) alarmViewModel.f10786i.f28188c.getValue()).compare(aVar, arrayList.get(i10)) < 0) {
                    num = Integer.valueOf(i10);
                    break;
                }
                i10++;
            } else {
                num = null;
                break;
            }
        }
        if (num == null) {
            num = Integer.valueOf(arrayList.size());
        }
        return num.intValue();
    }
}
