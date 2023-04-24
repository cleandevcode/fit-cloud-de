package com.topstep.fitcloud.pro.shared.data.bean.data;

import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import gm.l;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf.e0;
import mf.h0;
import mf.t;
import mf.y;
import nf.b;
import ul.u;

@Metadata
/* loaded from: classes2.dex */
public final class FriendTotalDataBeanJsonAdapter extends t<FriendTotalDataBean> {

    /* renamed from: a */
    public final y.a f9930a;

    /* renamed from: b */
    public final t<String> f9931b;

    /* renamed from: c */
    public final t<StepRecordBean> f9932c;

    /* renamed from: d */
    public final t<SleepRecordBean> f9933d;

    /* renamed from: e */
    public final t<HeartRateRecordBean> f9934e;

    /* renamed from: f */
    public final t<OxygenRecordBean> f9935f;

    /* renamed from: g */
    public final t<BloodPressureRecordBean> f9936g;

    /* renamed from: h */
    public final t<TemperatureRecordBean> f9937h;

    /* renamed from: i */
    public final t<PressureRecordBean> f9938i;

    /* renamed from: j */
    public final t<SimpleEcgRecord> f9939j;

    /* renamed from: k */
    public volatile Constructor<FriendTotalDataBean> f9940k;

    public FriendTotalDataBeanJsonAdapter(h0 h0Var) {
        l.f(h0Var, "moshi");
        this.f9930a = y.a.a("deviceHardwareInfo", "step", "sleep", "heartRate", "oxygen", "bloodPressure", "temperature", "pressure", "ecg");
        u uVar = u.f28881a;
        this.f9931b = h0Var.c(String.class, uVar, "deviceHardwareInfo");
        this.f9932c = h0Var.c(StepRecordBean.class, uVar, "step");
        this.f9933d = h0Var.c(SleepRecordBean.class, uVar, "sleep");
        this.f9934e = h0Var.c(HeartRateRecordBean.class, uVar, "heartRate");
        this.f9935f = h0Var.c(OxygenRecordBean.class, uVar, "oxygen");
        this.f9936g = h0Var.c(BloodPressureRecordBean.class, uVar, "bloodPressure");
        this.f9937h = h0Var.c(TemperatureRecordBean.class, uVar, "temperature");
        this.f9938i = h0Var.c(PressureRecordBean.class, uVar, "pressure");
        this.f9939j = h0Var.c(SimpleEcgRecord.class, uVar, "ecg");
    }

    @Override // mf.t
    public final FriendTotalDataBean b(y yVar) {
        l.f(yVar, "reader");
        yVar.b();
        int i10 = -1;
        String str = null;
        StepRecordBean stepRecordBean = null;
        SleepRecordBean sleepRecordBean = null;
        HeartRateRecordBean heartRateRecordBean = null;
        OxygenRecordBean oxygenRecordBean = null;
        BloodPressureRecordBean bloodPressureRecordBean = null;
        TemperatureRecordBean temperatureRecordBean = null;
        PressureRecordBean pressureRecordBean = null;
        SimpleEcgRecord simpleEcgRecord = null;
        while (yVar.q()) {
            switch (yVar.L(this.f9930a)) {
                case -1:
                    yVar.R();
                    yVar.W();
                    break;
                case 0:
                    str = this.f9931b.b(yVar);
                    i10 &= -2;
                    break;
                case 1:
                    stepRecordBean = this.f9932c.b(yVar);
                    i10 &= -3;
                    break;
                case 2:
                    sleepRecordBean = this.f9933d.b(yVar);
                    i10 &= -5;
                    break;
                case 3:
                    heartRateRecordBean = this.f9934e.b(yVar);
                    i10 &= -9;
                    break;
                case 4:
                    oxygenRecordBean = this.f9935f.b(yVar);
                    i10 &= -17;
                    break;
                case 5:
                    bloodPressureRecordBean = this.f9936g.b(yVar);
                    i10 &= -33;
                    break;
                case 6:
                    temperatureRecordBean = this.f9937h.b(yVar);
                    i10 &= -65;
                    break;
                case 7:
                    pressureRecordBean = this.f9938i.b(yVar);
                    i10 &= -129;
                    break;
                case 8:
                    simpleEcgRecord = this.f9939j.b(yVar);
                    i10 &= -257;
                    break;
            }
        }
        yVar.j();
        if (i10 == -512) {
            return new FriendTotalDataBean(str, stepRecordBean, sleepRecordBean, heartRateRecordBean, oxygenRecordBean, bloodPressureRecordBean, temperatureRecordBean, pressureRecordBean, simpleEcgRecord);
        }
        Constructor<FriendTotalDataBean> constructor = this.f9940k;
        if (constructor == null) {
            constructor = FriendTotalDataBean.class.getDeclaredConstructor(String.class, StepRecordBean.class, SleepRecordBean.class, HeartRateRecordBean.class, OxygenRecordBean.class, BloodPressureRecordBean.class, TemperatureRecordBean.class, PressureRecordBean.class, SimpleEcgRecord.class, Integer.TYPE, b.f22341c);
            this.f9940k = constructor;
            l.e(constructor, "FriendTotalDataBean::cla…his.constructorRef = it }");
        }
        FriendTotalDataBean newInstance = constructor.newInstance(str, stepRecordBean, sleepRecordBean, heartRateRecordBean, oxygenRecordBean, bloodPressureRecordBean, temperatureRecordBean, pressureRecordBean, simpleEcgRecord, Integer.valueOf(i10), null);
        l.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // mf.t
    public final void f(e0 e0Var, FriendTotalDataBean friendTotalDataBean) {
        FriendTotalDataBean friendTotalDataBean2 = friendTotalDataBean;
        l.f(e0Var, "writer");
        if (friendTotalDataBean2 != null) {
            e0Var.b();
            e0Var.s("deviceHardwareInfo");
            this.f9931b.f(e0Var, friendTotalDataBean2.f9921a);
            e0Var.s("step");
            this.f9932c.f(e0Var, friendTotalDataBean2.f9922b);
            e0Var.s("sleep");
            this.f9933d.f(e0Var, friendTotalDataBean2.f9923c);
            e0Var.s("heartRate");
            this.f9934e.f(e0Var, friendTotalDataBean2.f9924d);
            e0Var.s("oxygen");
            this.f9935f.f(e0Var, friendTotalDataBean2.f9925e);
            e0Var.s("bloodPressure");
            this.f9936g.f(e0Var, friendTotalDataBean2.f9926f);
            e0Var.s("temperature");
            this.f9937h.f(e0Var, friendTotalDataBean2.f9927g);
            e0Var.s("pressure");
            this.f9938i.f(e0Var, friendTotalDataBean2.f9928h);
            e0Var.s("ecg");
            this.f9939j.f(e0Var, friendTotalDataBean2.f9929i);
            e0Var.k();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(FriendTotalDataBean)";
    }
}
